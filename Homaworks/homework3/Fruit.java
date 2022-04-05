package homework3;

public class Fruit {
    private static double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public static double getWeight() {
        return weight;
    }

    public static void setWeight(double weight) {
        Fruit.weight = weight;
    }
}
