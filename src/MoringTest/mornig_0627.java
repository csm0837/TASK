package MoringTest;

//  참조타입
//  1. (4)
//  2. (3)
//  3. (2)
//  4. (2)
//  5. (3)
//  6. 3 \n 5


import java.util.*;

public class mornig_0627 {

  public static void main(String[] args) {
    test19();   //문제 실행단계 ex) test 07();
  }

  //7번 문제
  public static void test07() {
    int[] array = {1, 5, 3, 8, 2};

    int max = 0;
    for (int i = 0; i < array.length; i++) {
      max = Math.max(array[i], max);
    }
    System.out.println(max);
  }

  //8번 문제
  public static void test08() {
    int[][] aaray = {
        {95, 86},
        {83, 92, 96},
        {78, 83, 93, 87, 88}
    };

    int sum = 0;
    int count = 0;

    for (int i = 0; i < aaray.length; i++) {
      for (int j = 0; j < aaray[i].length; j++) {
        sum += aaray[i][j];
        count++;
      }
    }
    System.out.println(sum);
    System.out.println((double) (sum) / count);
  }

  //9번 문제
  public static void test09() {

    boolean power = false;

    int stuNum = 0;
    int[] score = new int[0];

    while (!power) {
      System.out.println("-------------------------------------------------");
      System.out.println("1. 학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
      System.out.println("-------------------------------------------------");
      System.out.print("선택>");

      Scanner sc1 = new Scanner(System.in);
      int select = Integer.parseInt(sc1.nextLine());

      switch (select) {
        case 1:

          System.out.print("학생수>");
          Scanner sc2 = new Scanner(System.in);
          stuNum = sc2.nextInt();
          System.out.println();
          break;

        case 2:
          score = new int[stuNum];
          Scanner sc = new Scanner(System.in);
          for (int i = 0; i < score.length; i++) {
            System.out.printf("score[%d]> ", i);
            score[i] = sc.nextInt();
          }
          break;

        case 3:
          for (int i = 0; i < stuNum; i++) {
            System.out.printf("scores[%d]: " + score[i] + "\n", i);
          }
          break;

        case 4:
          int sum = 0;
          int max = 0;
          for (int i = 0; i < stuNum; i++) {
            sum += score[i];
            max = Math.max(max, score[i]);
          }
          System.out.println("최고 점수: " + max);
          System.out.println("평균 점수: " + (double) (sum) / stuNum);
          break;

        case 5:
          System.out.println("프로그램 종료");
          power = true;
          break;
      }
    }
  }

//  클래스
//  1. (4)
//  2. (4)
//  3. (4)
//  4. (3)
//  5. (1)
//  6. (4)
//  7. (2)
//  8. (2)
//  9. (2)
//  10.(4)
//  11.(3)
//  12. 필드, 생성자,메서드
//  13. Srting name
//      String id
//      String id
//      String password
//      int age

  public static void test14() {

  }

  public static void test15() {
    MemberService memberservice = new MemberService();
    boolean result = memberservice.login("hong", "12345");
    if (result) {
      System.out.println("로그인 되었습니다");
      memberservice.logout("hong");
    } else {
      System.out.println("아이디나 비밀번호가 맞지 않습니다");
    }
  }

  public static void test16() {    //16, 17번
    Printer printer = new Printer();
    printer.println(10);
    printer.println(true);
    printer.println(5.7);
    printer.println("홍길동");
    Printer.println(20);
  }

  public static void test18() {
    shopService obj1 = shopService.getInstance();
    shopService obj2 = shopService.getInstance();

    if (obj1 == obj2) {
      System.out.println("동일 매장입니다");
    } else {
      System.out.println("서로 다른 매장입니다");
    }
  }

  public static void test19() {
    Account account = new Account();
    account.setBalance(10000);
    System.out.println("현재 잔고는 " + account.getBalance() + "원입니다");
    account.setBalance(-100);
    System.out.println("현재 잔고는 " + account.getBalance() + "원입니다");

    account.setBalance(2000000);
    System.out.println("현재 잔고는 " + account.getBalance() + "원입니다");

    account.setBalance(300000);
    System.out.println("현재 잔고는 " + account.getBalance() + "원입니다");
  }

}