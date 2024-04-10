package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListSample {

  public static void main(String[] args) {
    /*
    ArrayList<String> pitches = new ArrayList<>();
    pitches.add("143");
    pitches.add("152");
    pitches.add("119");

    System.out.println(pitches.get(1));
    System.out.println(pitches.size());
    System.out.println(pitches.contains("119"));

    System.out.println(pitches.remove("143"));
    System.out.println(pitches.remove(1));
     */

    /*
    String[] data = {"138", "129", "117"};
    ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
    이미 존재하는 data 배열로 ArrayList 를 만들 수 있다.
    또는 String 배열 대신, String 자료형을 여러개 전달하여 생성할 수도 있다:
    ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    */

    ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
    /*
    String result = "";
    for (int i = 0; i < pitches.size(); i++) {
      result += pitches.get(i);
      result += ", ";
    }
    result = result.substring(0, result.length() - 2);
     */
    // String.join("구분자", 리스트객체) 를 사용해 리스트의 각 요소에 구분자를 넣어 하나의 문자열로 만들 수 있다.
    String result = String.join(", ", pitches);
    System.out.println(result);

    ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList("138", "129", "142"));
    pitches2.sort(Comparator.naturalOrder());
    System.out.println(pitches2);
  }

}
