

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  @Override
  public void getGoal(){
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce(){
    System.out.println("Hi, I'm " + getName()+ ", a "+  getAge() +" year old "+ getGender() + " from " +previousOrganization + "who skipped" +skippedDays +" days from the course already.");
  }


  public void skipDays(int numberOfDays){
    skippedDays += numberOfDays;
  }

  Student(String name, int age, String gender, String po){
    super (name, age, gender);
    this.previousOrganization = po;
    this.skippedDays = 0;
  }

  Student(){
    super();
    this.previousOrganization = "The School of life";
    this.skippedDays = 0;
  }
}
