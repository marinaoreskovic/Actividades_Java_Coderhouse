package Animals;

public class Dog extends Animal{
    public Dog(String name, int weight) {
        super(name, weight);
    }

    public void speak() {
        System.out.println("Woof Woof!");
    }

    
}
