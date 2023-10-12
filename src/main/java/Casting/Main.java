package Casting;

public class Main {
    public static void main(String[] args)
    {
        // Upcasting
        Animal dog = new Dog();
        Animal cat= new Dog();


        System.out.println("---Upcasting----");
        dog.makeSound();
        cat.makeSound();

        if (dog instanceof Dog){
            //Alternative way -> ((Dog) dog).bark();
            Dog downCastingDog = (Dog) dog;
            System.out.println("----DownCasting----");
            downCastingDog.bark();
        }

    }
}
