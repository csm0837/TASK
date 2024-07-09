package task_0709.String03;

public class Prob2 {

  public static void main(String[] args) {
    Prob2 p = new Prob2();
    String addr = "서울시,강남구,봉은사로,SSGJavaBackend";
    String[] addrArr = p.split(addr, ',');
    System.out.println("배열 크기 : " + addrArr.length);
    for (int i = 0; i < addrArr.length; i++) {
      System.out.print(addrArr[i] + " ");
    }
  }

  public String[] split(String str, char separator) {
    String[] arr = str.split(String.valueOf(separator));

    return arr;


  }
}



















