public class Cw1 {
    public static void main(String[] args) {
        Person person = new Person("oskar", "korczak", 1993);
        System.out.println(person.name);
        System.out.println(person.surname);
        System.out.println(person.birthYear);
    }
}

class Person {
    public String name;
    public String surname;
    public int birthYear;

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }
}