// Tl 09/12/2024
// Main.java
import myanimals.Animal;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;
import myanimals.Cat;


public class Main {
    public static void main(String[] args) {
        System.out.println("\n Hello and welcome from the Main \n");

        // Create a Student object
        Student student = new Student();

        //C Create an object from a runnable class.
        App app = new App();

        // Use a method from the Student class.
        Student mystudent = new Student();
        // I know that I have a static method on the Student class
        // and, I know how to call a static class method
        student.sayHello();

        // Call a method that belongs to the student object.
        student.sayHi();

        // Out the number of animals
        System.out.println("\n The number of animals is: " + Animal.numOfAnimals);

        // Create a Cat object.
        Cat cat = new Cat();
        // use a method that is available to the Cat object named cat
        System.out.println("\n this sound is coming from the Cat object named cat");
        cat.animalSound();

        // Create a Dog object
        Dog dog = new Dog();
        System.out.println("\n this sound is coming from the Dog object named Dog");
        dog.animalSound();

        // Output the numer of animals

    }
}