package task_0630._2;

public class prob2_professor_task {

  public static void main(String[] args) {

    char[][] alphabet = new char[5][5];
    char start = 'A';

    //1.배열에 알파벳 입력
    for(int i = 0;i<alphabet.length;i++){
      for (int j = 0;j<alphabet[i].length;j++){
        alphabet[i][j] = (char)(start);
        start +=1;
      }
    }

    //2.원본 배열 출력
    System.out.println("원본 배열");
    for(int i = 0;i<alphabet.length;i++){
      for (int j = 0;j<alphabet[i].length;j++){
        System.out.print(alphabet[i][j] +"\t");
      }
      System.out.println("");
    }

    //3. 배열 수정
    for(int i = 0;i<alphabet.length;i++){
      alphabet[i][i] = (char)42;
    }


    //4. 수정된 배열 출력

    System.out.println("수정된 배열");
    for(int i = 0;i<alphabet.length;i++){
      for (int j = 0;j<alphabet[i].length;j++){
        System.out.print(alphabet[i][j] +"\t");
      }
      System.out.println("");
    }

  }
}
