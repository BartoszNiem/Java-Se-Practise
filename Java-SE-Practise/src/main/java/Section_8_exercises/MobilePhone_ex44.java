package Section_8_exercises;

import java.util.ArrayList;

public class MobilePhone_ex44 {
    private String myNumber;
    private ArrayList<Contact_ex44> myContacts;

    public MobilePhone_ex44(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    public boolean addNewContact(Contact_ex44 contact){
        if(myContacts.contains(contact)){
            return false;
        }
        else {
            myContacts.add(contact);
            return true;
        }
    }
    public boolean updateContact(Contact_ex44 old, Contact_ex44 newContact){
        if(myContacts.contains(old)){
            myContacts.set(myContacts.indexOf(old), newContact);
            return true;
        }
        else
            return false;
    }
    public boolean removeContact(Contact_ex44 contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        else
            return false;
    }
    public int findContact(Contact_ex44 contact){
        int position = -1;
        if(myContacts.contains(contact)){
            position = myContacts.indexOf(contact);
        }
        return position;
    }
    public int findContact(String contactName){
        int position = -1;
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName().equals(contactName)){
                position = i;
            }
        }
        return position;
    }
    public Contact_ex44 queryContact(String name){
        Contact_ex44 contactToReturn = null;
        for (Contact_ex44 contact :
             myContacts) {
            if(contact.getName().equals(name)){
                contactToReturn = contact;
            }
        }
        return contactToReturn;
    }
    public void printContact(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(String.format("%d %s -> %s", i, myContacts.get(i).getName(), myContacts.get(i).getPhoneNumber()));
        }
    }

    public static void main(String[] args) {
        MobilePhone_ex44 mobile = new MobilePhone_ex44("555097394");
        Contact_ex44 contact1 = new Contact_ex44("Bob", "432546767");
        Contact_ex44 contact2 = new Contact_ex44("Sally", "954965334");
        Contact_ex44 contact3 = new Contact_ex44("John", "323434656");
        Contact_ex44 contact4 = new Contact_ex44("Filip", "939434999");
        Contact_ex44 contact4_reapeted = new Contact_ex44("Filip", "939434999");
        Contact_ex44 contact5 = new Contact_ex44("Amy","4356786587" );
        System.out.println("------------------------Adding contacts-------------------------");
        System.out.println(mobile.addNewContact(contact1));
        System.out.println(mobile.addNewContact(contact2));
        System.out.println(mobile.addNewContact(contact3));
        System.out.println(mobile.addNewContact(contact4));
        System.out.println(mobile.addNewContact(contact4_reapeted));
        mobile.printContact();
        System.out.println("------------------------Updating contact------------------------");
        System.out.println(mobile.updateContact(contact3, contact5));
        mobile.printContact();
        System.out.println("----------------Deleting Sally from Contact List----------------");
        System.out.println(mobile.removeContact(contact2));
        mobile.printContact();

    }
}
