public class Person {
   private String name;
   private int year;
   private double salary;

    public Person(String name, int year, double salary) {
        this.name = name;
        this.year = year;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", salary=" + salary +
                '}';
    }



}
