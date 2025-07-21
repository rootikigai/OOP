import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhonebookTest{
    private Phonebook phonebook;
    @BeforeEach
    public void setup(){
        phonebook = new Phonebook();
    }
    @Test
    public void testThatContactCanBeAdded(){
        boolean contactAdded = phonebook.addContact("Kelvin", "Ifeanyi", "08035859351");
        assertTrue(contactAdded);
        List<Contact> contacts = phonebook.viewContacts();
        assertEquals(1, contacts.size());
        Contact contact = contacts.getFirst();
        assertEquals("Kelvin", contact.getFirstName());
        assertEquals("Ifeanyi", contact.getLastName());
        assertEquals("08035859351", contact.getPhoneNumber());
    }
}
