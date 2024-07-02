package task_0701.polymorphism_practice_02.No_01;

public class CoffeeShop {
  public static void main(String[] args) {
    System.out.println("****java nara CoffeeShop영업개시****");
    Beverage[] beverage = new Beverage[5];
    beverage[0] = new Coffee("Cappuccino");
    beverage[1] = new Coffee("CafeLatte");
    beverage[2] = new Tea("ginsengTea");
    beverage[3] = new Coffee("CafeLatte");
    beverage[4] = new Tea("redginsengTea");

    getSalesInfo(beverage);

    System.out.println("총 판매 금액==> " + getTotalPrice(beverage));
    System.out.println("Coffee의 판매 개수 => " + Coffee.amount + "잔");
    System.out.println("Tea의 판매 개수 => " + Tea.amount + "잔");
  }

  public static void getSalesInfo(Beverage[] beverages) {
    for (int i = 0; i < beverages.length; i++) {
      beverages[i].print(i + 1);
    }
  }

  public static int getTotalPrice(Beverage[] beverages) {
    int total = 0;
    for (Beverage beverage : beverages) {
      total += beverage.getPrice();
    }
    return total;
  }
}
