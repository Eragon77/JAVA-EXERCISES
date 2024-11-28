package package3;

public class Dog extends Animal implements NoiseCapable{
    //We do not need to declare a private String name because Dog inherits from Animal, which has String name.

    public Dog(String name){
        super(name);
    }

    public Dog(){
        super("Dog");
    }

    public void bark(){
        System.out.println(this.getName()+" barks");
    }

    public void sleep(){
        System.out.println(this.getName() +" sleeps");
    }

    public void eat(){
        System.out.println(this.getName()+" eats");
    }

    public void makeNoise(){
        this.bark();
    }



}
