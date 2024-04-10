package ObjectOriented;

public class BasicMethodSample4 {

  int a;  // 객체변수 a

  void varTest(BasicMethodSample4 sample4) {
    sample4.a++;
  }

  public static void main(String[] args) {
    BasicMethodSample4 sample4 = new BasicMethodSample4();
    sample4.a = 1;
    sample4.varTest(sample4);

    System.out.println(sample4.a);
  }

}
