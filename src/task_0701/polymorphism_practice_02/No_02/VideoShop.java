package task_0701.polymorphism_practice_02.No_02;

public class VideoShop {
  public static void main(String[] args) {
    Content[] content = new Content[3];
    content[0] = new Video("이클립스", "new");
    content[1] = new Video("체포왕", "comic");
    content[2] = new Video("뽀롱뽀롱뽀로로2", "child");

    for (Content item : content) {
      item.totalPrice();
      item.show();
    }
  }
}
