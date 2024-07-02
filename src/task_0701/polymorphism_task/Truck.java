package task_0701.polymorphism_task;

public class Truck extends Wheeler {

  public Truck(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    if (velocity + speed * 5 <= 100) {
      velocity += speed * 5;
      System.out.println("트럭의 현재 속도는 " + velocity + "입니다.");
    } else {
      velocity = 100;
      System.out.println("트럭의 최고속도위반으로 속도를 100으로 내립니다.");
    }

  }

  @Override
  public void speedDown(int speed) {
    if (velocity - speed * 5 >= 50) {
      velocity -= speed * 5;
      System.out.println("트럭의 현재 속도는 " + velocity + "입니다.");
    } else {
      velocity = 50;
      System.out.println("트럭의 최저속도위반으로 속도를 50으로 올립니다.");
    }
  }
}
