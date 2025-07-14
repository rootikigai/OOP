public class Problem{
    private String name;
    private final ProblemType type;
    private boolean isSolved;

    public Problem(String name, ProblemType type){
        this.name = name;
        this.type = type;
        this.isSolved = false;
    }

    public String getName(){
        return name;
    }

    public String setName(String newName){
        name = newName.toUpperCase();
        return newName;
    }

    public ProblemType getType(){
        return type;
    }

    public boolean isSolved(){
        return isSolved;
    }

    public void getIsSolved(){
        isSolved = true;
    }

    public void setSolved(boolean isSolved){
        this.isSolved = isSolved;
    }
}
