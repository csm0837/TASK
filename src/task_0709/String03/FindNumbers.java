package task_0709.String03;

public class FindNumbers {

  public static void main(String[] args) {
    FindNumbers fn = new FindNumbers();

    long number = 228754462;
    System.out.println("입력 숫자 = " + number);
    System.out.println("2 횟수 => " + fn.countNumber(number, 2));//3을 리턴
    System.out.println("4 횟수 => " + fn.countNumber(number, 4));//2를 리턴
  }

  public static int countNumber(long number, int i) {
    String strNum = String.valueOf(number);
    String[] arr = strNum.split("");
    int count = 0;

    for (int j = 0; j < arr.length; j++) {
      if (arr[j].equals(String.valueOf(i))) {
        count++;
      }

    }
    return count;

  }

}


