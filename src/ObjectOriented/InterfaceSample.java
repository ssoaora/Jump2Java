/*
난 동물원(zoo)의 사육사(zookeeper)이다.
육식동물(predator)이 들어오면 난 먹이를 던져준다(feed).
호랑이(tiger)가 오면 사과(apple)를 던져준다.
사자(lion)가 오면 바나나(banana)를 던져준다.
*/

package ObjectOriented;

// 인터페이스의 메서드는 메서드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다.
// getFood 메서드는 인터페이스를 implements한 클래스들이 강제적으로 구현해야 하는 규칙이 된다.
// 상속과 달리, 인터페이스는 인터페이스의 메서드를 반드시 구현해야 하는 강제성을 갖는다.
interface Predator {
  String getFood();
}

class Animals {
  String name;

  void setName(String name) {
    this.name = name;
  }
}

class Tiger extends Animals implements Predator {
  // 인터페이스의 메서드는 항상 public으로 구현해야 한다.
  public String getFood() {
    return "apple";
  }
}

class Lion extends Animals implements Predator {
  // 인터페이스의 메서드는 항상 public으로 구현해야 한다.
  public String getFood() {
    return "banana";
  }
}

// ❗Zookeeper 클래스가 Animals 클래스에 의존적인 클래스에서 Animals 클래스와 상관없는 독립적인 클래스가 되었다.
class Zookeeper {
  void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }
}

public class InterfaceSample {
  public static void main(String[] args) {
    Zookeeper zookeeper = new Zookeeper();
    Tiger tiger = new Tiger();  // tiger: Tiger 클래스의 객체이자 Predator 인터페이스의 객체
    Lion lion = new Lion();  // lion: Lion 클래스의 객체이자 Predator 인터페이스의 객체

    zookeeper.feed(tiger);
    zookeeper.feed(lion);
  }

}
