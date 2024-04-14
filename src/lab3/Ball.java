package lab3;

public class Ball {
    private String color;
    private String name;
    private Double weight;

    //CONSTRUCTORS
    public Ball(String color, String name, Double weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    public Ball() {
    }

    public Ball(String color) {
        this.color = color;
    }

    public Ball(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    //GETTERS AND SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    //METHODS
    @Override
    public String toString() {
        return "Ball{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
}
