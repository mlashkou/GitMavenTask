import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner = new Scanner( System. in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        String[] array1 = s1.split(" ");
        String[] array2 = s2.split(" ");

        for (int i = 0; i < array1.length; i++)
        {
            Boolean match = false;
            for (int j = 0; j < array1.length; j++)
            {
                if (array1[i].equals(array2[j]))
                {
                    match = true;
                    break;
                }
            }

            if (!match)
            {
                System.out.println(array1[i]);
            }
        }
    }
}