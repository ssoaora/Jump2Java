package While;

public class WhileSample {

  public static void main(String[] args) {
    int treeHit = 0;
    while (treeHit < 10) {
      treeHit++;
      System.out.printf("나무를 %d번 찍었습니다.\n", treeHit);
      if (treeHit  == 10) {
        System.out.println("나무 넘어갑니다.");
      }
    }
  }

}
