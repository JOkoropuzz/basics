package lab9;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("Bob");
        list.add("Bob");
        list.add("Tom");
        list.add("Mark");
        list.add(4);
        list.add("Jack");
        System.out.println(unique(list));

        //List<Object> list2 = generationLinkedList();
        //List<Object> list2 = generationArrayList();
        //System.out.println(randomItem(list2));

        //ex4
        Random random = new Random();
        Map<User, Integer> scoreBoard = new HashMap<>();
        List<String> names = Arrays.asList("Bob", "Tom", "John", "Jack", "Michel", "Charly", "Din", "Den", "Helen", "Mark", "Julia");
        for (String name : names) {
            scoreBoard.put(new User(name), random.nextInt(100)); //Generation of random score for every user.
        }

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        for (Map.Entry<User, Integer> entry : scoreBoard.entrySet()) {
            if (entry.getKey().getName().equals(a)) { //Equivalent of user name and an input value
                System.out.println(entry.getKey().getName() + " = " + entry.getValue());
                break;
            }

        }

    }


    //ex2
    public static Set<Object> unique(List<Object> list) {
        return new HashSet<>(list);
    }

    //ex3
    public static List<Object> generationArrayList() { //Generation of ArrayList
        List<Object> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(1000000));
        }
        return list;
    }

    public static List<Object> generationLinkedList() { //Generation of LinkedList
        List<Object> list = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1000000; i++) {
            list.add(random.nextInt(1000000));
        }
        return list;
    }

    public static List<Object> randomItem(List<Object> list) {
        List<Object> result = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            result.add(list.get(random.nextInt(list.size() - 1)));
        }
        return result;
    }


}
