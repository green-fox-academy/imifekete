import java.util.ArrayList;
import java.util.List;

/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class LagopusClass {
  private String className;
  private List <Student> students = new ArrayList<>();
  private List <Mentor> mentors = new ArrayList<>();

  public void addStudent (Student s){
    students.add(s);
  }

  public void addMentor (Mentor m){
    mentors.add(m);
  }

  public void info (){
    System.out.println("Lagopus " + className + "class has" + students.size() + students + " and " + mentors.size() +  mentors + ".");
  }

  LagopusClass (String className){
    this.className = className;
  }


}


