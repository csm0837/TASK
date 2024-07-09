package task_0702.task_2;

public abstract class Factory {

  protected int openHour; // 공장가동시각
  protected int closeHour; //공장 종료시간
  protected String name; //공장이름

  public Factory(String name, int openHour, int closeHour) {
    this.name = name;
    this.openHour = openHour;
    this.closeHour = closeHour;

  }

  String getFactoryName() {
    return name;

  }

  int getWorkingTime() {
    return closeHour - openHour;
  }

  public abstract int makeProducts(char skill);


}
