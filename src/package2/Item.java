package package2;

public class Item {
    private String product;
    private int qty;
    private int unitPrice;

    public Item(String product, int qty, int unitPrice){
        this.product=product;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }

    //return price
    public int price(){
        return qty*this.unitPrice;
    }

    //Increase qty
    public void increaseQuantity(){
        this.qty++;
    }
    @Override
    public String toString(){
        return this.product+": "+this.qty;
    }


}
