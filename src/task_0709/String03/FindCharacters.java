package task_0709.String03;

public class FindCharacters {


  public static void main(String[] args) {
    FindCharacters fc = new FindCharacters();
    int count = fc.countChar("Boys, be ambitious", 'b');
    System.out.println(count);

  }

  public int countChar(String str, char c) {
    String[] arr = str.split("");
    int count = 0;
    for(int i = 0 ; i<str.length();i++){
      if(arr[i].equals(String.valueOf(c))){
        count++;
      }
    }return count;
  }
}
