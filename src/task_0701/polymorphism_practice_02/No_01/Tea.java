package task_0701.polymorphism_practice_02.No_01;

public class Tea extends Beverage {
  public static int amount = 0;

  public Tea(String name) {
    super(name);
    calcPrice();
    amount++;
  }

  @Override
  public void calcPrice() {
    switch (getName()) {
      case "lemonTea":
        price = 1500;
        break;
      case "ginsengTea":
        price = 2000;
        break;
      case "redginsengTea":
        price = 2500;
        break;
    }
  }
}
