package task_0702.task_1;
public class Dog extends Animal {
  public Dog(int speed) {
    super(speed);
  }

  @Override
  public void run(int hours) {
    this.distance += this.speed * (hours / 2);
  }
}
