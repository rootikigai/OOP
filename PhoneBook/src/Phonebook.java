import java.util.ArrayList;
import java.util.List;

public class Phonebook{
    private List<Contact> contacts;
    public Phonebook(){
        contacts = new ArrayList<>();
    }
    public boolean addContact(String firstName, String lastName, String phoneNumber){
        Contact contact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(contact);
        return true;
    }

    public List<Contact> viewContacts(){
        return contacts;
    }
}
