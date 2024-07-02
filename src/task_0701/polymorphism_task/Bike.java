package task_0701.polymorphism_task;

public class Bike extends Wheeler {

  public Bike(String carName, int velocity, int wheelNumber) {
    this.carName = carName;
    this.velocity = velocity;
    this.wheelNumber = wheelNumber;
  }

  @Override
  public void speedUp(int speed) {
    if (velocity + speed <= 40) {
      velocity += speed;
      System.out.println("자전거의 현재 속도는 " + velocity + "입니다.");
    } else {
      velocity = 40;
    }
    System.out.println("자전거의 최저속도위반으로 속도를 40으로 내립니다.");
  }

  @Override
  public void speedDown(int speed) {
    if (velocity - speed >= 10) {
      velocity -= speed;
      System.out.println("자전거의 현재 속도는 " + velocity + "입니다.");
    } else {
      velocity = 10;
      System.out.println("자전거의 최저속도위반으로 속도를 10으로 올립니다.");
    }
  }
}
