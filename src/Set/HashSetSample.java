package Set;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetSample {
  public static void main(String[] args) {
    /*
    HashSet<String> set = new HashSet<String>(Arrays.asList("H", "e", "l", "l", "o"));
    System.out.println(set);
     */

    HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
    System.out.println(s1 + "(s1집합)");
    System.out.println(s2 + "(s2집합)");

    // 교집합 구하기
    HashSet<Integer> intersection = new HashSet<>(s1);
    intersection.retainAll(s2);  // 교집합 수행
    System.out.println(intersection + " (교집합)");  // [4, 5, 6] 출력

    // 합집합 구하기
    HashSet<Integer> union = new HashSet<>(s1);
    union.addAll(s2);  // 합집합 수행
    System.out.println(union + " (합집합)");  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력

    // 차집합 구하기
    HashSet<Integer> subtract = new HashSet<>(s1);
    subtract.removeAll(s2);  // 차집합 수행
    System.out.println(subtract + " (차집합)");  // [1, 2, 3] 출력



  }
}
