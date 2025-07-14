import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person{
    private List<Problem> problems = new ArrayList<>();

    public List<Problem> getProblems(){
        return new ArrayList<>(problems);
    }

    public void addProblem(Problem problem){
        problems.add(problem);
    }

    public List<Problem> getUnsolvedProblems(){
        List<Problem> unsolvedProblems = new ArrayList<>();
        for(Problem problem: getProblems()){
            if(!problem.isSolved()){
                unsolvedProblems.add(problem);
            }
        }
        return unsolvedProblems;
    }
}
