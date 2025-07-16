public class DearDiary{
    private String username;
    private String password;
    private boolean isLocked;
    private java.util.List<Entry> entries;

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
}
