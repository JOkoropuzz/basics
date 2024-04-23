package lab5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String text = "Some бяка text, with words and words and words!";
        System.out.println("Самое длинное слово: " + largeWord(text));

        String word = "Madam";
        System.out.println(isPalindrom(word));

        System.out.println(censored(text));

        System.out.println("В строке: " + text + "\nсодержится: " + countSubstring(text, "words") + "\nподстрок: " + "words");

        System.out.println(reversWords(text));
    }

    //ex1
    public static String largeWord(String words){
        String a = "";
        //Цифрвы и знаки препинания не учитываются в длинне слова
        words = words.replaceAll("\\d|_|[?]|!|[.]|,|\"|\\n|-", "");
        for(String word : words.split(" ")){
            if (a.length() < word.length()) a = word;
        }
        return a;
    }

    //ex2
    public static boolean isPalindrom(String word){
        word = word.toLowerCase();
        String[] chars = word.split("");
        boolean res = false;
        for (int i = 0; i<chars.length/2; i++){
            if (!chars[i].equals(chars[chars.length-(i+1)])){
                res = false;
                break;
            }
            else res = true;
        }
        return res;
    }

    //ex3
    public static String censored(String text){
        List<String> badWords = Arrays.asList("бяка", "бяка!", "Бяка", "Бяка!", "бяка?", "Бяка?",
                "бяка,", "Бяка,", "бяка.", "Бяка.", "бяка-", "-бяка");
        for(String bw: badWords){
            text = text.replaceAll(bw, "[вырезано цензурой]");
        }
        return text;
    }

    //ex4
    public static int countSubstring(String s1, String s2) {
        int res = 0;
        int index = s1.indexOf(s2);
        //Если в строке s1 нету строки s2, значение indexOf = -1
        while (index != -1) {
            res++;
            index = s1.indexOf(s2, index + 1);
        }
        return res;
    }

    //ex5
    public static String reversWords(String str){
        String[] strgs = str.split(" ");
        StringBuilder res = new StringBuilder();
        for (String s : strgs){
            String reversed = "";
            String[] chars = s.split("");
            for(int i = chars.length; i!=0; i--){
                reversed += chars[i-1];
            }
            res.append(reversed).append(" ");
        }
        return res.toString();
    }
}
