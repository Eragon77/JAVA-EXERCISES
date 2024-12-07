package package8;

public abstract class Product implements Comparable<Product> {

    /**
     * Il nome del prodotto.
     */
    private final String name;

    /**
     * Il prezzo in euro del prodotto.
     */
    private final double price;

    /**
     * Il numero di milliseocndi che formano 24 ore (un giorno).
     */
    public final static long _24_HOURS = 1000L * 60 * 60 * 24;

    /**
     * Costruisce un prodotto.
     *
     * @param name il nome del prodotto
     * @param price il prezzo in euro del prodotto
     * @throws IllegalArgumentException se name e' null oppure vuoto oppure price e' negativo
     */
    protected Product(String name, double price) throws IllegalArgumentException{
        this.name = name;
        this.price = price;

        if(this.name==null || name.isEmpty())
            throw new IllegalArgumentException("name cannot be null nor empty");
        else if(this.price<0)
            throw new IllegalArgumentException("price cannot be negative");
        // TODO
    }

    @Override
    public final String toString() {
        return name;
    }

    /**
     * Confronta il momento di scadenza di questo prodotto con quello di un altro prodotto.
     *
     * @return un numero negativo se questo prodotto scade prima di other;
     *         un numero positivo se questo prodotto scade dopo other;
     *         0 se questo prodotto e other scadono nello stesso momento (o entrambi non scadono mai)
     */
    protected abstract int compareExpiration(Product other);

    /**
     * Due prodotti sono equals se hanno stesso nome, stesso prezzo e stesso momento di scadenza.
     */
    @Override
    public final boolean equals(Object other) {
        if(!(other instanceof Product))
            return false;

        Product otherAsProduct=(Product) other;

        if(this.name.equals(otherAsProduct.name) && this.price==otherAsProduct.price && compareExpiration(otherAsProduct)==0)
            return true; // TODO
        else
            return false;

    }

    /**
     * Non deve essere banale.
     */
    @Override
    public final int hashCode() {
        return name.hashCode()^(int)this.price; // TODO

    }

    /**
     * Determina se, al momento indicato, questo prodotto e' scaduto.
     *
     * @param whenChecked il momento indicato
     */
    public abstract boolean hasExpired(long whenChecked);

    /**
     * Determina se, al momento indicato, questo prodotto non e' ancora
     * scaduto ma scadra' nelle 24 ore successive.
     *
     * @param whenChecked il momento indicato (in millisecondi da 1/1/1970)
     */
    public final boolean expiresInSubsequent24Hours(long whenChecked) {
        return !hasExpired(whenChecked) && hasExpired(whenChecked + _24_HOURS);
    }

    /**
     * Restituisce il prezzo di questo prodotto, come e' stato fornito al costruttore.
     */
    public final double getPrice() {
        return price;
    }

    /**
     * Si comporta identicamente al getPrice() che c'e' sopra, ma restituisce
     * un prezzo scontato del 40% se, al momento indicato, questo prodotto non e' ancora
     * scaduto ma scadra' nelle 24 ore successive.
     *
     * @param whenChecked il momento in cui si chiede di controllare il prezzo (in millisecondi da 1/1/1970)
     * @return il prezzo del prodotto, possibilmente scontato
     */
    public final double getPrice(long whenChecked) {
        return expiresInSubsequent24Hours(whenChecked)?(getPrice()*0.6) : (getPrice());
    }

    /**
     * Ordina i prodotti per momento di scadenza (si usi compareExpiration),
     * poi per nome e infine per prezzo (si usi il metodo statico della libreria
     * Double.compare(double1, double2)).
     */
    @Override
    public final int compareTo(Product other) {
        if(compareExpiration(other)!=0)
            return compareExpiration(other);

        if(this.name.compareTo(other.name)!=0)
            return this.name.compareTo(other.name);

        return Double.compare(price, other.price);

    }
}