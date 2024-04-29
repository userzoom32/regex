import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^\\s*([A-Z][a-z]+)\\s+([0-9]{4})\\s+([0-9]{3,5}\\.?[0-9]{0,2})");

        Calendar
        String line = null;
        List<Person> list1 = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/in2.txt"))) {

            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(matcher.group() + " " + matcher.group(1) + " " + matcher.group(2) + " " + matcher.group(3));
                    list1.add(new Person(matcher.group(1), Integer.parseInt(matcher.group(2)), Double.parseDouble(matcher.group(3))));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("---------------------------");
        for (Person person : list1) {
            System.out.println(person);
        }
    }
}
