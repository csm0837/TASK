package task_0625.task0625_1;

public class Movie {

  private String title;
  private String genre;
  String a;

  public String getTitle(){
    return title;
  }
  public String getGenre(){
    return genre;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setGenre(String genre){
    this.genre = genre;
  }

  public String play() {
    System.out.println(title+"("+genre+") 상영중입니다.");
    return "";
  }
}
