import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args){
        Runner2 runner = new Runner2();

        String sourceString = runner.getFile("source");

        String[] array = sourceString.split("\\W+");

        Boolean duplicates = false;
        for (int i = 0; i < array.length; i++)
            for (int j = i+1; j < array.length; j++)
                if (array[i].equals(array[j]))
                    System.out.println(array[i]);

        char[] punctuationMark = new char[]{ ',', ';', '!' };
        int counter = 0;
        for (int i = 0; i < sourceString.length(); i++) {
            for (int j = 0; j < punctuationMark.length; j++) {
                if (punctuationMark[j] == sourceString.charAt(i)) {
                    counter ++;
                }
            }
        }

        System.out.println("Count of marks: " + counter);
    }

    private String getFile(String fileName) {

        StringBuilder result = new StringBuilder("");

        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());

        try {
            Scanner scanner = new Scanner(file);
            try {

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    result.append(line).append("\n");
                }

                scanner.close();

            } finally {
                scanner.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }
}
