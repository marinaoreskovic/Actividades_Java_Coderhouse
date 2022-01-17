package Animals;

public abstract class Animal {
    private String name;
    private int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void speak();

    //getters
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}