public class Problem{
    private String name;
    private String type;
    private boolean isSolved;

    public Problem(String name, String type){
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

    public boolean isSolved(){
        return isSolved;
    }

    public void setSolved(boolean isSolved){
        this.isSolved = isSolved;
    }
}
