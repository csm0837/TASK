package task_0701.polymorphism_practice_02.No_02;

public abstract class Content {
  private String title;
  protected int price;

  public Content() {
  }

  public Content(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public abstract void totalPrice();

  public void show() {
    System.out.println(title + " 비디오의 가격은 " + price + "원 입니다.");
  }
}
