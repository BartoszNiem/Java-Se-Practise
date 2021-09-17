package Section_6.exercises;
/*
    Exercise 30 Section 6
 */
public class Person {
    private String firstName = "", lastName = "";
    private int age;

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public boolean isTeen(){
        if(age > 12 && age < 20){
            return true;
        }
        else
            return false;
    }
    public String getFullName(){
        if(firstName.isEmpty()){
            if(lastName.isEmpty()){
                return "";
            }
            else{
                return lastName;
            }
        }
        else{
            if(lastName.isEmpty()){
                return firstName;
            }
            else{
                return firstName + " " + lastName;
            }
        }
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Kowalski");
        person.setAge(23);
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());
        System.out.println(person.getFullName());

        System.out.println("*********************************************************");
        Person person1 = new Person();
        System.out.println(person1.getFullName());
        person1.setFirstName("Adam");
        System.out.println(person1.getFullName());
        person1.setFirstName("");
        person1.setLastName("Smith");
        System.out.println(person1.getFullName());
    }
}
