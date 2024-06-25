package task_0625.task_0625_3;

public class Emp {

  private String id;
  private String name;
  private int baseSalry;

  //getter
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getBaseSalry() {
    return baseSalry;
  }

  //setter
  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBaseSalry(int baseSalry) {
    this.baseSalry = baseSalry;
  }

  public String toString() {
    String a =  name +"("+id+") 사원의 기본급은 "+baseSalry+"원입니다.\n";
    return a;
  }

    public String getSalary ( int day){
      String b = String.format(String.valueOf((double) (baseSalry + baseSalry * day)));
      return b;
    }

  }


