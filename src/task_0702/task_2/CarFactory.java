package task_0702.task_2;

public class CarFactory extends Factory implements IWorkingTogether {

  public CarFactory(String name, int openHour, int closeHour) {
    super(name, openHour, closeHour);
  }


  @Override
  public int workTogether(IWorkingTogether partner) {
    return makeProducts('B');
  }

  @Override
  public int makeProducts(char skill) {
    switch (skill) {
      case 'A':
        return 3 * getWorkingTime();

      case 'B':
        return 2 * getWorkingTime();

      case 'C':
        return 1 * getWorkingTime();

      default:
        return 0 * getWorkingTime();


    }


  }
}
