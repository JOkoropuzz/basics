package lab6.ex1_2;

public abstract class Human {
    protected String fname;
    protected String lname;

    public Human(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    @Override
    public abstract String toString();
}


