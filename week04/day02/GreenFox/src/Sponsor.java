/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  @Override
  public void introduce (){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  @Override
  public void getGoal(){
    System.out.println("Hire brilliant junior software developers.");
  }

  public void hire(){
    hiredStudents += 1;
  }

  Sponsor (String name, int age, String gender, String company){
    super ();
    this.hiredStudents = 0;
    this.company = company;
  }

  Sponsor (){
    super ();
    this.company = "Google";
    this.hiredStudents = 0;
  }
}
