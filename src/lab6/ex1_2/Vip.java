package lab6.ex1_2;

public interface Vip {
    boolean ISVIP = true;
    double DISCOUNT = 0.9;

    static double applyDiscount(double price){
        return price*DISCOUNT;
    }

}
