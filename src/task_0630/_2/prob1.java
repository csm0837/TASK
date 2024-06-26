package task_0630._2;

public class prob1 {

  public static void main(String[] args) {
    int[] arr1 = new int[]{10, 30, 20, 80, 50};
    int sum = 0;

    for (int i = 0; i < arr1.length; i++) {
      sum += arr1[i];
    }

    double[] arr2 = new double[arr1.length];

    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = (double) arr1[i] / sum * 100;
      arr1[i] = (int) arr2[i];
    }

    for (int i = 0; i < arr1.length; i++) {
      for(int j = 0 ;j<arr1[i];j++){
        System.out.print("*");
      }
      System.out.printf("(" + arr2[i] + "%%)\n");
    }
  }
}