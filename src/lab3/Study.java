package lab3;

public class Study {

    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        //1st ex
        Study std = new Study("Изучение Java - это просто!");
        System.out.println(std.printCourse());

        //2nd ex
        Ball bal1 = new Ball("Black", "Bob", 0.3);
        Ball bal2 = new Ball("Red", "Rob", 0.7);
        System.out.println(bal1 + "\n" + bal2);

        //3rd ex
        House home1 = new House();
        House home2 = new House();
        home1.setParameters(5, 1964, "Хрущев");
        home2.setParameters(9, 1988, "Горбачев");
        System.out.println(home1);
        System.out.println(home2);

        //4th ex
        Tree tree1 = new Tree();
        Tree tree2 = new Tree(89, "Берёза");
        Tree tree3 = new Tree(110, "Дуб", true);

    }

}
