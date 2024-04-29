import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Main3 {
    public static void main(String[] args) {
        //Pattern pattern = Pattern.compile("^\\s*([A-Z][a-z]+)\\s+([0-4]{4})\\s+([0-9]{3,5})");
        String regex = "^\\s*([A-Z][a-z]+)\\s+([0-9]{4})\\s+([0-9]{3,5})";

        String line = null;
        List<Person> list1 = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("src/in2.txt"))){

            while ((line=br.readLine())!=null){
                //System.out.println(line.matches(regex));
                if(line.matches(regex)){
                    String[] values = line.trim().split("\\s+");
                    System.out.println(Arrays.toString(values));
                    list1.add(new Person(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2])));
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
