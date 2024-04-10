package TypeConversion;

public class TypeSample {

  public static void main(String[] args) {
    // String을 int로 형변환
    String num1 = "123";
    int n1 = Integer.parseInt(num1);
    System.out.println(n1);

    // int를 String으로 형변환
    int n2 = 456;
    String num2 = "" + n2;
    String num3 = String.valueOf(n2);
    String num4 = Integer.toString(n2);

    System.out.println(num2);
    System.out.println(num3);
    System.out.println(num4);
  }

}
