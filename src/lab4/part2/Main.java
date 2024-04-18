package lab4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 6, 10};
        int[] array2 = {12, 4, 6, 2};
        System.out.println(isSort(array1));
        System.out.println(isSort(array2));
        ex2();
        firstLastChange(array2);
        int[] array3 = {1, 2, 3, 1, 2, 4};
        firstUniq(array3);
        System.out.println(Arrays.toString(mergeSort(array2)));
    }

    //1st exercise
    public static String isSort(int[] ints) {
        String res = "OK";
        for (int i = 0; i < ints.length - 1; i++) {
            if (ints[i] > ints[i + 1]) {
                res = "Try again";
                break;
            }
        }
        return res; //Вместо string значения лучше возвращать boolean true/false
    }

    //2nd exercise
    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int g = scanner.nextInt();
        int[] ints = new int[g];
        System.out.println("Enter numbers of array:");
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(ints));
        //TODO: add validation
    }


    //3rd exercise
    public static void firstLastChange(int[] ints) {
        System.out.println("Before: " + Arrays.toString(ints));
        int a = ints[0];
        ints[0] = ints[ints.length - 1];
        ints[ints.length - 1] = a;
        System.out.println("After: " + Arrays.toString(ints));
    }

    //4th exercise
    public static void firstUniq(int[] ints) {
        boolean flag = false;
        for (int i = 0; i < ints.length; i++) {
            if (flag) break; //Флаг для остановки цикла, если уникальное значение уже найдено
            for (int j = 0; j < ints.length; j++) {
                if (i != j) {
                    if (ints[i] == ints[j]) {
                        break;
                    } else if (j == ints.length - 1) {
                        System.out.println("First unique: " + ints[i]);
                        flag = true;
                        break;
                    }
                } else if (j == ints.length - 1) System.out.println("First unique: " + ints[i]);
                //Строка 68 выполняется, если в массиве уникальный эллемент стоит последним.
            }
        }
    }

    //5th exercise completed on lesson
    public static int[] mergeSort(int[] ints) {
        if (ints.length < 2) return ints;
        int[] left = new int[ints.length / 2];
        int[] right = (ints.length % 2 == 0) ? new int[ints.length / 2] : new int[(ints.length / 2) + 1];
        for (int i = 0; i < left.length; i++) {
            left[i] = ints[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = ints[(ints.length / 2) + i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;
        while (leftPointer < left.length || rightPointer < right.length) {
            if (leftPointer < left.length && rightPointer < right.length){
                if(left[leftPointer] < right[rightPointer]){
                    res[resultPointer++] = left[leftPointer++];
                }
                else{
                    res[resultPointer++] = right[rightPointer++];
                }
            }else if (leftPointer< left.length){
                res[resultPointer++] = left[leftPointer++];
            }else if (rightPointer< right.length){
                res[resultPointer++] = right[rightPointer++];
            }
        }
        return res;

    }
}


