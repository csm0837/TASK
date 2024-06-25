package task_0625.task_0625_2;

public class Employee {


  private String name;
  private int age;
  private String dept;

  //getter
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getdept() {
    return dept;
  }

  //setter
  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public void print(){
    System.out.printf("이\t름 : %s\t나 이 : %d\t부\t서 : %s\n",name,age,dept);
  }

}
