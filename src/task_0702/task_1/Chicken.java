package task_0702.task_1;
public class Chicken extends Animal implements Cheetable {
  public Chicken(int speed) {
    super(speed);
  }

  @Override
  public void run(int hours) {
    this.distance += this.speed * hours;
  }

  @Override
  public void fly() {
    this.speed *= 2;
  }
}
