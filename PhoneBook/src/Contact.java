public class Contact {
    public String firstName;
    public String lastName;
    public String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;

        if(firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("First name cannot be empty");
        }
        if(phoneNumber == null || !phoneNumber.matches("\\d{11}")){
            throw new IllegalArgumentException("Phone number must be 11 digits");
        }
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
