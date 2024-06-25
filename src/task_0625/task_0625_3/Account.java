package task_0625.task_0625_3;

public class Account {

  private String accNo;
  private int balance;
  private String s;

  //getter
  public String getAccNo(){
    return accNo;
  }

  //setter
  public void setAccNo(String s){
    this.accNo = s;
    System.out.printf(accNo+" 계좌가 개설되었습니다.\n");
  }

  public int getBalance(){
    return balance;
  }

  public String deposit(int a){

      balance -= a;
      System.out.printf(accNo + " 계좌에 %d만원이 출금되었습니다.\n", a);
     return s = accNo + " 계좌의 잔고는 " + balance + "만원입니다.\n";

  }

  public String save(int a){
    balance += a;
    System.out.printf(accNo + " 계좌에 %d만원이 입금되었습니다.\n", a);
    return s = accNo + " 계좌의 잔고는 " + balance + "만원입니다.\n";
  }
}
