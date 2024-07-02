package task_0701.polymorphism_practice_02.No_02;

public class Video extends Content {
  private String genre;

  public Video(String title, String genre) {
    super(title);
    this.genre = genre;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  @Override
  public void totalPrice() {
    switch (genre) {
      case "new":
        price = 2000;
        break;
      case "comic":
        price = 1500;
        break;
      case "child":
        price = 1000;
        break;
      default:
        price = 500;
        break;
    }
  }
}
