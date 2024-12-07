package package8;

/**
 * Un prodotto con un momento di scadenza.
 */
public class ProductWithExpiration extends Product {

    // TODO: campi?

   private final long expiration;

    /**
     * Costruisce un prodotto con una scadenza.
     *
     * @param name il nome del prodotto
     * @param price il prezzo in euro del prodotto
     * @param whenProduced il momento di produzione (millisecondi da 1/1/1970)
     * @param duration il numero di giorni, successivi all produzione, dopo i quali il prodotto scade
     * @throws IllegalArgumentException se name e' null oppure vuota oppure se price e' negativo
     *                                  oppure se whenProduced e' negativo oppure su duration e' negativo
     */
    public ProductWithExpiration(String name, double price, long whenProduced, int duration) throws IllegalArgumentException {
        super(name,price);
        this.expiration=whenProduced+duration*_24_HOURS;

        if(whenProduced<0)
            throw new IllegalArgumentException("cannot have been produced at a negative time");
        if(duration<0)
            throw new IllegalArgumentException("duration cannot be negative");
    }

    @Override
    protected int compareExpiration(Product other) {
        if (other instanceof ProductNotExpiring)
            return -1;
        else
            return Long.compare(expiration, ((ProductWithExpiration) other).expiration);
    }

    @Override
    public boolean hasExpired(long whenChecked) {
        return whenChecked>=this.expiration;
    }



    // TODO
}