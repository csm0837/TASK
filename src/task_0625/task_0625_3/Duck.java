package task_0625.task_0625_3;

public class Duck {

  private String name;
  private int legs;
  private int length;
  String a;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void fly() {
    System.out.println("오리(" + name + ")는 날지 않습니다");
  }

  public void sing() {
    System.out.println("오리(" + name + ")가 소리내어 웁니다");
  }

  public String toString() {
    String a = "오리의 이름은 " + name + "입니다.";
    return a;


  }
}
