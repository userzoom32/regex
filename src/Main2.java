import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String regex1 = "([A-Za-z0-9_.]+)@([A-Za-z]{2,}).[A-Za-z]{2,}";
        String str1 = "qwert.rewq@gmail.com";
        System.out.println(str1.matches(regex1));


        try (BufferedReader br = new BufferedReader(new FileReader("src/in.txt"))){

            String line = br.readLine();
            String regex = "^\\s*(-?[0-9]+\\s*)+";
            System.out.println(line.matches(regex));

            String[] values = line.trim().split("\\s+");
            System.out.println(Arrays.toString(values));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
