public class Warehouse {
    private double capacity;
    private double balance;

    //Constructor
    public Warehouse(double capacity){
        if(capacity>0)
            this.capacity=capacity;
        else //Useless warehouse
            this.capacity=0;

        this.balance=0;
    }


    //getters
    public double getBalance(){

        return this.balance;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double howMuchSpaceLeft(){
        return this.capacity-this.balance;
    }

    public void addToWarehouse(double amount){
        if(amount<=0)
            return;
        if(amount+balance>=capacity)
            balance=capacity;
        else{
            balance+=amount;
        }

    }

    public double takeFromWarehouse(double amount){
        if(amount<=0)
            return balance;
        if(balance-amount<=0)
            balance=0;
        else{
            balance-=amount;
        }

        return balance;

    }

    @Override
    public String toString(){
        return String.format("balance=%.1f, space left %.1f",balance,capacity-balance);
    }

}