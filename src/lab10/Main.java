package lab10;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");
        System.out.println(fileToStrings(file));

        String path = "files/outText.txt";
        writeStringInfile("Hello world!", path);

        String path2 = "files/concatText.txt";
        File file2 = new File("files/outText.txt");
        concatTwoFile(file, file2, path2);

        InputStream is = null;
        InputStream is2 = null;
        OutputStream os = null;
        dollarText(file);

    }


    //ex1
    public static List<String> fileToStrings(File file) {
        List<String> result = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;

            while ((input = reader.readLine()) != null) {
                result.add(input);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        return result;
    }

    //ex2
    public static void writeStringInfile(String str, String path) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(str);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //ex3
    public static void concatTwoFile(File file1, File file2, String path) {
        InputStream is = null;
        InputStream is2 = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(file1);
            is2 = new FileInputStream(file2);
            os = new FileOutputStream(path);

            while (is.available() > 0) {
                os.write(is.read());
            }

            while (is2.available() > 0) {
                os.write(is2.read());
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }

                if (is2 != null) {
                    is.close();
                }

                if (os != null) {
                    is.close();
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    //ex4
    public static void dollarText(File file) {
        List<String> dollarStrings = fileToStrings(file);
        StringBuilder resultString = new StringBuilder();

        dollarStrings.replaceAll(str -> str.replaceAll("[^\\dA-Za-zА-Яа-яёЁ]", "\\$"));

        for (String str : dollarStrings) {
            resultString.append(str).append("\n");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("files/dollarText.txt"))) {
            writer.write(resultString.toString());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
