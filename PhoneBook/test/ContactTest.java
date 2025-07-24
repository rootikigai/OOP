import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
A phone has a phonebook (I go just skip the phone class las las.)
Contacts are in the phonebook
A person can create a contact with just firstname, lastname and phone number
A person can edit a contact by searching for name or number and editing either name or number
A person can delete contact by searching for name or number and deleting
A person can view all contact
*/
public class ContactTest {
    private Contact contact;
    @BeforeEach
    public void setUp(){
        contact = new Contact("Kelvin", "Ifeanyi", "08035859351");
    }
    @Test
    public void testThatContactCanBeCreated() {
        assertEquals("Kelvin", contact.getFirstName());
        assertEquals("Ifeanyi", contact.getLastName());
        assertEquals("08035859351", contact.getPhoneNumber());
    }
    @Test
    public void testThatInvalidFirstNameThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("", "Ifeanyi", "08035859351");
        });
    }
    @Test
    public void testThatInvalidPhoneNumberThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            new Contact("Kelvin", "Ifeanyi", "08035abc351");
        });
    }
    @Test
    public void testThatContactDetailsCanBeUpdated() {
        contact.setFirstName("Kelvin");
        contact.setLastName("Ifeanyi");
        contact.setPhoneNumber("08035859351");
        assertEquals("Kelvin", contact.getFirstName());
        assertEquals("Ifeanyi", contact.getLastName());
        assertEquals("08035859351", contact.getPhoneNumber());
    }
    @Test
    public void testThatInvalidFirstNameUpdateThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            contact.setFirstName("");
        });
    }
    @Test
    public void testThatInvalidPhoneNumberUpdateThrowsIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class, ()-> {
            contact.setPhoneNumber("090abc243!!@");
        });
    }
}