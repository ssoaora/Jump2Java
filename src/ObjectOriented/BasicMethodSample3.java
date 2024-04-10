package ObjectOriented;

public class BasicMethodSample3 {

  int varTest(int a) {
    a++;
    return a;
  }

  public static void main(String[] args) {
    BasicMethodSample3 sample3 = new BasicMethodSample3();
    int a = 1;
    a = sample3.varTest(a);

    System.out.println(a);
  }

}
