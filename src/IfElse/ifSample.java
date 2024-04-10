package IfElse;

import java.util.ArrayList;

public class ifSample {

  public static void main(String[] args) {
    ArrayList<String> pocket = new ArrayList<>();
    pocket.add("phone");
    pocket.add("gum");
    pocket.add("money");

    if (pocket.contains("money")) {
      System.out.println("택시를 타고 갈 수 있다!");
    }
    else {
      System.out.println("돈이 없으니 걸어가야 한다..");
    }
  }

}
