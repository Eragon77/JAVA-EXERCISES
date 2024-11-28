package package3;

public abstract class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.print("The animal eats");
    }

    public void sleep(){
        System.out.print("The animal sleeps");
    }

    public String getName(){
        return this.name;
    }


}