package task_0709.String01;

import com.sun.jdi.Value;

public class Prob1 {

  public static void main(String args[]) {

    Prob1 prob1 = new Prob1();

    System.out.println(prob1.leftPad("SSG", 6, '#'));
    System.out.println(prob1.leftPad("SSG", 5, '$'));
    System.out.println(prob1.leftPad("SSG", 2, '&'));

  }

  public String leftPad(String str, int size, char padChar) {
    String result;

    if (str.length() > size) {
      result = str;
    } else {
      StringBuilder sb = new StringBuilder(str);
      for (int i = 0; i < size - str.length(); i++) {
        sb.insert(0, String.valueOf(padChar));
      }

      result = String.valueOf(sb);

    }
    return result;
  }

}