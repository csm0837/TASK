package task_0701.polymorphism_practice_02.No_01;

public abstract class Beverage {
  private String name;
  protected int price;

  public Beverage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  public abstract void calcPrice();

  public void print(int order) {
    System.out.println(order + "번째 판매 음료는 " + name + "이며, 가격은 " + price);
  }
}
