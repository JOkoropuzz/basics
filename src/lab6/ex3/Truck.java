package lab6.ex3;

public class Truck extends Car{
    int wheels;
    double maxWeight;

    public Truck(int w, String m, char c, float s, int wheels, double maxWeight){
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;

    }

    public void newWheels(int wheels){
        this.wheels = wheels;
        System.out.println("Установленное количество колёс: " + this.wheels);
    }
}
