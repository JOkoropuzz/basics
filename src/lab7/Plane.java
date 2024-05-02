package lab7;

public class Plane {
    private final Wing wing;

    public Plane(double weight) {
        this.wing = new Wing(weight);
    }

    private static class Wing {
        private final double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        public void printWeight() {
            System.out.println("Wing{" +
                    "weight=" + weight +
                    '}');
        }
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane( 2345.6);
        Plane plane2 = new Plane(1345.5);

        plane1.wing.printWeight();
        plane2.wing.printWeight();
    }



}
