package task_0630._1;

public class Prob2 {

  public static void main(String[] args) {
    int[] arr = new int[5];

    for (int i = 0; i < 5; i++) {
      arr[i] = (int) (Math.random() * 100 + 1);
      System.out.printf(arr[i] + " ");
    }

  }
}

