package lab2;

public class Cargo {
    private Double lenght; //Lenght of cargo (m)
    private Double width; //Width of cargo (m)
    private Double height; //Height of cargo (m)
    private Boolean isPallet; //Cargo is pallets?
    private Integer amountPallet; //Null or 0 if cargo is not a pallet

    public Double getLenght() {
        return lenght;
    }

    public void setLenght(Double lenght) {
        this.lenght = lenght;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Boolean getPallet() {
        return isPallet;
    }

    public void setPallet(Boolean pallet) {
        isPallet = pallet;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Integer getAmountPallet() {
        return amountPallet;
    }

    public void setAmountPallet(Integer amountPallet) {
        this.amountPallet = amountPallet;
    }

    //Empty constructor
    public Cargo() {

    }

    //Constructor with all parameters
    public Cargo(Double lenght, Double width, Double height, Boolean isPallet, Integer amountPallet) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
        this.isPallet = isPallet;
        this.amountPallet = amountPallet;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "lenght=" + lenght +
                ", width=" + width +
                ", height=" + height +
                ", isPallet=" + isPallet +
                ", amountPallet=" + amountPallet +
                '}';
    }
}
