package String;

public class StringBufferSample {

  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer();

    /*
    sb.append("hello");
    sb.append(" ");
    sb.append("jump to java");

    sb.append("jump to java");
    sb.insert(0, "hello ");
    String result = sb.toString();
    */

    sb.append("hello jump to java");
    System.out.println(sb.substring(0, 4));
  }

}
