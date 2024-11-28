package package3;

public class AnimalsMain {
   public static void main(String[] args){
       Dog dog = new Dog();
       dog.bark();
       dog.eat();

       Dog fido = new Dog("Fido");
       fido.bark();

       Cat cat = new Cat();
       cat.purr();
       cat.eat();

       Cat garfield = new Cat("Garfield");
       garfield.purr();

       NoiseCapable doggo = new Dog();
       doggo.makeNoise();

       NoiseCapable catto = new Cat("Garfield");
       catto.makeNoise();
       Cat c = (Cat) catto;
       c.purr();
   }
}
