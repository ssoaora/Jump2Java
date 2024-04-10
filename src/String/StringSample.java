package String;

public class StringSample {
  public static void main(String[] args) {
/*
    String a = "hello";
    String b = "java";
    String c = "hello";
*/
    String a = "Hello Java";

    System.out.println(a.indexOf("Java"));
    System.out.println(a.contains("Java"));
    System.out.println(a.charAt(6));
    System.out.println(a.replaceAll("Java", "World"));
    System.out.println(a.substring(0, 4)); // 시작위치 <= a < 끝위치
    System.out.println(a.toUpperCase());

    String b = "a:b:c:d:e:f:g:h";
    String[] result = b.split(":");
    for (int i = 0; i < result.length; i++) {
      System.out.print(result[i]);
    }
    System.out.println();

    int num = 15;
    String day = "three";
    System.out.println(String.format("I eat %d apples.", 3));
    System.out.println(String.format("I eat %s apples.", "five"));
    System.out.println(String.format("I eat %d apples.", num));
    System.out.println(String.format("I eat %d apples. So I was sick for %s days.", num, day));
    System.out.println(String.format("I have %s apples.\nRate is %s", 3, 3.234));

  }
}
