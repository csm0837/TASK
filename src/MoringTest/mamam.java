//package MoringTest;
//
//import java.util.Scanner;
//
//public class mamam {
//
//  public static void main(String[] args) {
//    boolean power = false;
//
//    int stuNum = 0;
//    int[] score = new int[0];
//
//    while (!power) {
//
//      menuOption();
//
//      Scanner sc1 = new Scanner(System.in);
//      int select = Integer.parseInt(sc1.nextLine());
//
//      switch (select) {
//        case 1:
//          selectMenu();
//          break;
//
//        case 2:
//          setscore();
//          break;
//
//        case 3:
//          scorelist();
//          break;
//
//        case 4:
//          maxAvg();
//          break;
//
//        case 5:
//          quit();
//          break;
//      }
//    }
//  }
//  public static void menuOption(){
//    System.out.println("-------------------------------------------------");
//    System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
//    System.out.println("-------------------------------------------------");
//    System.out.print("선택>");
//  }
//
//  public static void selectMenu() {
//    System.out.print("학생수>");
//    Scanner sc2 = new Scanner(System.in);
//    stuNum = sc2.nextInt();
//    System.out.println();
//  }
//
//  public static void setscore() {
//    score = new int[stuNum];
//    Scanner sc = new Scanner(System.in);
//    for (int i = 0; i < score.length; i++) {
//      System.out.printf("score[%d]> ", i);
//      score[i] = sc.nextInt();
//    }
//  }
//
//  public static void scorelist() {
//    for (int i = 0; i < stuNum; i++) {
//      System.out.printf("scores[%d]: " + score[i] + "\n", i);
//    }
//  }
//
//  public static void maxAvg() {
//    int sum = 0;
//    int max = 0;
//    for (int i = 0; i < stuNum; i++) {
//      sum += score[i];
//      max = Math.max(max, score[i]);
//    }
//    System.out.println("최고 점수: " + max);
//    System.out.println("평균 점수: " + (double) (sum) / stuNum);
//  }
//
//  public static void quit() {
//    System.out.println("프로그램 종료");
//    power = true;
//  }
//}
//
//
