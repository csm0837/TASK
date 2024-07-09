package task_0630.Inheritance2;

public class CheckingAccount extends Account {
  private String cardNo;

  public CheckingAccount(String accId, String ownerName, long balance, String cardNo) {
    super(accId, balance, ownerName);
    this.cardNo = cardNo;
  }

  @Override
  public void calcRate() {
    // 이 메서드는 구체적인 이율 계산 로직이 필요할 경우 구현합니다.
  }

  public void pay(String cardNo, long amount) {
    if (this.cardNo.equals(cardNo)) {
      if (getBalance() >= amount) {
        withdraw(amount);
        System.out.println("지불이 성공적으로 처리되었습니다.");
      } else {
        System.out.println("지불이 불가능합니다. 잔액이 부족합니다.");
      }
    } else {
      System.out.println("지불이 불가능합니다. 카드 번호가 일치하지 않습니다.");
    }
  }

  public String getCardNo() {
    return cardNo;
  }

  public void setCardNo(String cardNo) {
    this.cardNo = cardNo;
  }


}
