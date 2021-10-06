package Section_8_exercises;

import java.util.Objects;

public class Contact_ex44 {
    private String name, phoneNumber;

    public Contact_ex44(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public static Contact_ex44 createContact(String name, String phoneNumber){
        return new Contact_ex44(name, phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact_ex44 that = (Contact_ex44) o;
        return Objects.equals(name, that.name) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }
}
