public class Entry{
    private String title;
    private String content;
    private java.time.LocalDateTime date;;

    public Entry(String title, String content, String date){
        this.title = title;
        this.content = content;
        this.date = java.time.LocalDateTime.now();
    }
    public String getTitle(){
        return title;
    }
    public String getContent(){
        return content;
    }
    public java.time.LocalDateTime getDate(){
        return date;
    }
}
