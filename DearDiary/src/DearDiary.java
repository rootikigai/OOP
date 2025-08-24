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
    private void ensureUnlocked() {
        if (isLocked) {
            throw new IllegalStateException("Diary is Locked");
        }
    }
    public int entryCount(){
        return entries.size();
    }
    public Entry addEntry(String title, String content){
        ensureUnlocked();
        Entry entry = new Entry(nextId++, title, content);
        entries.add(entry);
        return entry;
    }
    public Entry getEntryById(int id){
        for (Entry entry: entries){
            if (entry.getId() == id){
                return entry;
            }
        }
        return null;
    }
    public boolean removeEntryById(int id){
        ensureUnlocked();
        for (int index = 0; index < entries.size(); index++){
            Entry entry = entries.get(index);
            if (entry.getId() == id){
                entries.remove(index);
                return true;
            }
        }
        return false;
    }
}
