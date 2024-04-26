package lab6.ex1_2;

public class Employee extends Human{

    private String bank;

    public Employee(String fname, String lname, String bank) {
        super(fname, lname);
        this.bank = bank;
    }

    @Override
    public String toString() {
        return this.fname + this.lname + this.bank;
    }
}
