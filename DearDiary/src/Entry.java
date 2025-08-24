public class Entry{
    private int id;
    private String title;
    private String content;
    private java.time.LocalDateTime createdAt;;

    public Entry(int id, String title, String content){
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = java.time.LocalDateTime.now();
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public java.time.LocalDateTime getCreatedAt(){
        return createdAt;
    }
}
