import java.util.InputMismatchException;
import java.util.Scanner;
import Animals.Animal;
import Animals.Cow;
import Animals.Cat;
import Animals.Fish;
import Animals.Dog;
import Animals.Bird;
import Animals.Monkey;

public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animals = {
            new Cat("cat", 100),
            new Cow("cow", 10),
            new Dog("dog", 10),
            new Monkey("monkey", 10),
            new Bird("bird", 10),
            new Fish("fish", 5)
        };
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese el nombre del animal:");
        String name = scanner.nextLine();
        scanner.close();
       //switch that accepts an animal name and returns the sound it makes
      //if the animal is not found, return "I don't know that animal!"

      switch (name.toLowerCase()) {
            case "gato":
                animals[0].speak();
                break;
            case "vaca":
                animals[1].speak();
                break;
            case "perro":
                animals[2].speak();
                break;
            case "mono":
                animals[3].speak();
                break;
            case "pajaro":
                animals[4].speak();
                break;
            case "pez":
                animals[5].speak();
                break;
            default:
                throw new  InputMismatchException("Ese animal no existe.");
       
      }





    }
}