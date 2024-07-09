package MoringTest.mt0709;

public class CellPhone {

  public String model;
  public double battery = 0;

  public CellPhone(String model) {

  }

  void call(int time) {
    if (time < 0) {
      System.out.println("통화시간 입력오류");

    }else if (battery - 0.5 * time >= 0) {
      System.out.println("통화시간 :  "+time+"분");
      battery -= 0.5 * time;
    }  else {
      System.out.printf("통화시간 : %.1f분\n", (double)time);
      battery = 0;
    }
  }

  void charge(int time) {
    if (battery + time * 3 > 100) {
      System.out.println("충전시간 : "+time+"분");
      battery = 100;
    } else if (time < 0) {
      System.out.println("충전시간 입력오류");
    } else {
      battery += time * 3;
      System.out.println("충전시간 : "+time+"분");
    }
  }

  void printBattery() {
    System.out.printf("남은 배터리 양 : %.1f\n", battery);
  }

}
