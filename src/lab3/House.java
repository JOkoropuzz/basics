package lab3;

import java.time.Year;

public class House {
    private Integer floors;
    private Integer year;
    private String name;

    //GETTERS AND SETTERS
    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //METHODS
    public int yearsOld() {
        return -(this.year - Year.now().getValue());
    }

    public void setParameters(Integer floors, Integer year, String name) {
        this.floors = floors;
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Дом - " + name + " " +
                "имеет " + floors + " этажей, " +
                "построен в " + year + ", " +
                "возраст: " + this.yearsOld();
    }
}
