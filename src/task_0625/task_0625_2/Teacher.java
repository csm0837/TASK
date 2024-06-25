package task_0625.task_0625_2;

public class Teacher {

  private String name;
  private int age;
  private String subject;

  //getter
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getSubject() {
    return subject;
  }

  //setter
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSubject(String subjectd) {
    this.subject = subjectd;
  }

  public void print(){
    System.out.printf("이\t름 : %s\t나 이 : %d\t부\t서 : %s\n",name,age,subject);
  }


}