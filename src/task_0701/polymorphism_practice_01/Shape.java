package task_0701.polymorphism_practice_01;

abstract public class Shape {

  private double area;
  private String name;

  public Shape() {
  }

  public Shape(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getArea() {
    return area;
  }

  public void setArea(double area) {
    this.area = area;
  }

  abstract void calculationArea();

  public void print() {
    System.out.println(name + "의 면적은 " + area);
  }
}
