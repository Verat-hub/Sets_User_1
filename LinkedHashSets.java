import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets{
public static void main(String[]args){
  // Preapre LinkedHashSets Object and Load Person Objects in it and iterate it using Iterator and While Loop
  LinkedHashSet<Person> p=new LinkedHashSet<>();
  p.add(new Person(987, "ZYX", 9510, "Sec", "HR"));
  p.add(new Person(654, "CBA", 7530, "KOK", "GM"));
  p.add(new Person(321, "DEF", 8520, "Dil", "AGM"));
  Iterator<Person> iterator=p.iterator();
  while(iterator.hasNext()){
    Person person = iterator.next();
    System.out.println(person);
  }

}
}
