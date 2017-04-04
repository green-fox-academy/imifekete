/**
 * Created by Fekete Imre on 2017.04.04..
 */
public class Mentor extends Person {
  private String level;

  @Override
  public void getGoal(){
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + getName() + ", a " + getAge() + " year old " + getGender() +" "+ level + " mentor.");
  }

  Mentor (String name, int age, String gender, String level){
    super (name, age, gender);
    this.level = level;
  }

  Mentor(){
    super();
    this.level = "intermediate";
  }
}
