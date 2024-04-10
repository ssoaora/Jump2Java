package ObjectOriented;

public class BasicMethodSample {

  int sum(int a, int b) {  // a, b는 매개변수(parameter)
    return a + b;
  }

  public static void main(String[] args) {
    int a = 3;
    int b = 4;

    BasicMethodSample sample = new BasicMethodSample();
    int c = sample.sum(3, 4);  // 3, 4는 인수(arguments)

    System.out.println(c);
  }

}
