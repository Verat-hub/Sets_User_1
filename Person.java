public class Person{
// prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
private int person_id;
private String person_name;
private double person_salary;
private String person_address;
private String person_designation;
public int getPerson_id() {
    return person_id;
}
public void setPerson_id(int person_id) {
    this.person_id = person_id;
}
public Person(int person_id, String person_name, double person_salary, String person_address,
        String person_designation) {
    this.person_id = person_id;
    this.person_name = person_name;
    this.person_salary = person_salary;
    this.person_address = person_address;
    this.person_designation = person_designation;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + person_id;
    result = prime * result + ((person_name == null) ? 0 : person_name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(person_salary);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((person_address == null) ? 0 : person_address.hashCode());
    result = prime * result + ((person_designation == null) ? 0 : person_designation.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (person_id != other.person_id)
        return false;
    if (person_name == null) {
        if (other.person_name != null)
            return false;
    } else if (!person_name.equals(other.person_name))
        return false;
    if (Double.doubleToLongBits(person_salary) != Double.doubleToLongBits(other.person_salary))
        return false;
    if (person_address == null) {
        if (other.person_address != null)
            return false;
    } else if (!person_address.equals(other.person_address))
        return false;
    if (person_designation == null) {
        if (other.person_designation != null)
            return false;
    } else if (!person_designation.equals(other.person_designation))
        return false;
    return true;
}
@Override
public String toString() {
    return "Person [person_id=" + person_id + ", person_name=" + person_name + ", person_salary=" + person_salary
            + ", person_address=" + person_address + ", person_designation=" + person_designation + "]";
}
public String getPerson_name() {
    return person_name;
}
public void setPerson_name(String person_name) {
    this.person_name = person_name;
}
public double getPerson_salary() {
    return person_salary;
}
public void setPerson_salary(double person_salary) {
    this.person_salary = person_salary;
}
public String getPerson_address() {
    return person_address;
}
public void setPerson_address(String person_address) {
    this.person_address = person_address;
}
public String getPerson_designation() {
    return person_designation;
}
public void setPerson_designation(String person_designation) {
    this.person_designation = person_designation;
}
}
