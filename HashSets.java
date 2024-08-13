import java.util.HashSet;

public class HashSets{
// Prepare Hashset object here and add person class objects in them iterate it by using for each
public static void main(String[] args) {
    HashSet<Person> p= new HashSet<>();
    p.add(new Person(123, "Verat", 1000000, "Ameerpet", "Dev"));
    p.add(new Person(456, "Tarev", 100000, "Begumpet", "Jr.Dev"));
    p.add(new Person(789, "Vers", 10000, "Malakpet", "Asst.Dev"));
    for(Person person: p){
        System.out.println(person);
    }
}
}
