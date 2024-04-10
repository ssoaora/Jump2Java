// LinkedHashMap: 입력된 순서대로 데이터 저장
// TreeMap: 입력된 key의 오름차순으로 데이터를 저장

package Map;

import java.util.HashMap;

public class HashMapSample {

  public static void main(String[] args) {
    HashMap<String, String> hashMap = new HashMap<>();
    hashMap.put("people", "사람");
    hashMap.put("baseball", "야구");

    System.out.println(hashMap.get("people"));

    // .getOrDefault method
    System.out.println(hashMap.get("java"));  // null 표시
    System.out.println(hashMap.getOrDefault("java", "자바"));

    // .containsKey method
    System.out.println(hashMap.containsKey("people"));

    // .remove method
    System.out.println(hashMap.remove("people"));  // "사람" 출력

    // .size method
    System.out.println(hashMap.size());  // hashMap.remove("people") 로 없앴으므로 1 출력

    // .keySet method
    hashMap.put("people", "사람");
    System.out.println(hashMap.keySet());  // [baseball, people] 출력

  }
}
