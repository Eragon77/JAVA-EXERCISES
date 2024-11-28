package package3;

public class Cat extends Animal implements NoiseCapable{

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super("Cat");
    }

    public void purr(){
        System.out.println(this.getName()+" purrs");
    }

    public void sleep(){
        System.out.println(this.getName() +" sleeps");
    }

    public void eat(){
        System.out.println(this.getName()+" eats");
    }

    public void makeNoise(){
        this.purr();
    }
}
