package lab3;

public class Tree {
    private Integer yearsOld;
    private String name;
    private Boolean isAlive;

    //CONSTRUCTORS

    public Tree(Integer yearsOld, String name) {
        this.yearsOld = yearsOld;
        this.name = name;
    }

    public Tree(Integer yearsOld, String name, Boolean isAlive) {
        this.yearsOld = yearsOld;
        this.name = name;
        this.isAlive = isAlive;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}
