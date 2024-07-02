package task_0701.polymorphism_practice_01;

public class Circle extends Shape {

  private double radius;

  public Circle(double radius, String name) {
    super(name);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  void calculationArea() {
    setArea(Math.PI * radius * radius);
  }
}
