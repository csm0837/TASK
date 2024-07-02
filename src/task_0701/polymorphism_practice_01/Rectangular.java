package task_0701.polymorphism_practice_01;

public class Rectangular extends Shape {

  private double width;
  private double height;

  public Rectangular(double width, double height, String name) {
    super(name);
    this.width = width;
    this.height = height;
  }

  @Override
  void calculationArea() {
    setArea(width * height);
  }
}
