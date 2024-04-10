package ObjectOriented;

public class BasicMethodSample2 {

  // 여기서 쓰인 return은 메서드를 호출한 곳에 리턴값을 돌려주는 역할이 아니라 메서드를 즉시 빠져나가는 역할을 한다.
  // 이 메서드는 입력값으로 ‘바보’라는 값이 들어오면 문자열을 출력하지 않고 메서드를 즉시 빠져나간다.
  void sayNick(String nick) {
    if ("바보".equals(nick)) {
      return;
    }
    System.out.printf("저의 별명은 %s 입니다.\n", nick);
  }

  public static void main(String[] args) {
    BasicMethodSample2 sample2 = new BasicMethodSample2();

    sample2.sayNick("야호");
    sample2.sayNick("바보");
  }
}
