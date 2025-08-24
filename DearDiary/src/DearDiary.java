public class DearDiary{
    private String username;
    private String password;
    private boolean isLocked;
    private java.util.List<Entry> entries;
    private int nextId = 1;

    public DearDiary(String username, String password){
        this.username = username;
        this.password = password;
        this.isLocked = true;
        this.entries = new java.util.ArrayList<>();
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public boolean isLocked() {
        return isLocked;
    }
    public void unlockDiary(String password){
        if (this.password.equals(password)){
            isLocked = false;
        }
        else{
            throw new SecurityException("Password is Invalid");
        }
    }
    public void lockDiary(){
        isLocked = true;
    }
}
