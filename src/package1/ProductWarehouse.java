package package1;

public class ProductWarehouse extends Warehouse{
        private  String productName;

        public ProductWarehouse(String productName, double capacity){
            super(capacity);
            this.productName=productName;
        }

        public String getName(){
            return productName;
        }

    public void setName(String newName){
            this.productName=newName; //Method that changes the product's name.
    }

    @Override
    public String toString(){
            return this.productName+": "+super.toString();
    }



    }
