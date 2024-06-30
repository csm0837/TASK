package task_0630.Inheritance1;

public class Alcohol extends Drink {

  private double alcper;


  public Alcohol(String name, int price, int count, double alcper) {
    super(name, price, count);
    this.alcper = alcper;
  }


  public static void printTitle() {
    System.out.println("상품명(도수[%])\t단가\t수량\t금액");
  }


  @Override
  public void printData() {
    System.out.println(name + "(" + alcper + ")\t" + price + "\t" + count + "\t" + getTotalPrice());
  }
}
