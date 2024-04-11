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

  default void printFood() {
    System.out.printf("my food is %s\n", getFood());
  }
}

interface Barkable {
  void bark();
}

// 인터페이스는 일반 클래스와는 달리 extends를 이용하여 여러 개의 인터페이스를 동시에 상속할 수 있다.
// 즉, 다중 상속이 지원된다.
// 자식 인터페이스로 생성한 객체의 자료형은 부모 인터페이스로 사용하는 것이 가능하다.
interface BarkablePredator extends Predator, Barkable {
}

class Animals {
  String name;

  void setName(String name) {
    this.name = name;
  }
}

// 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 객체 지향 세계에서는 다형성이라고 한다.
class Tiger extends Animals implements Predator, Barkable {
  // ❗인터페이스의 메서드는 항상 public으로 구현해야 한다.
  public String getFood() {
    return "apple";
  }

  public void bark() {
    System.out.println("어흥");
  }
}

// 하나의 객체가 여러 개의 자료형 타입을 가질 수 있는 것을 객체 지향 세계에서는 다형성이라고 한다.
class Lion extends Animals implements BarkablePredator {
  // ❗인터페이스의 메서드는 항상 public으로 구현해야 한다.
  public String getFood() {
    return "banana";
  }

  public void bark() {
    System.out.println("으르렁");
  }
}

// ❗Zookeeper 클래스가 Animals 클래스에 의존적인 클래스에서 Animals 클래스와 상관없는 독립적인 클래스가 되었다.
class Zookeeper {
  void feed(Predator predator) {
    System.out.println("feed " + predator.getFood());
  }
}

/*
동물 클래스가 추가될 때마다 분기문이 추가되어야 하므로 좋지 않다.
class Bouncer {
  void barkAnimal(Animals animals) {
    if (animals instanceof Tiger) {
      System.out.println("어흥");
    }
    else if (animals instanceof Lion) {
      System.out.println("으르렁");
    }
  }
}
 */

class Bouncer {
  void barkAnimal(Barkable animals) {
    animals.bark();
  }
}

public class InterfaceSample {
  public static void main(String[] args) {
    Zookeeper zookeeper = new Zookeeper();
    Tiger tiger = new Tiger();  // tiger: Tiger 클래스의 객체이자 Predator 인터페이스의 객체
    Lion lion = new Lion();  // lion: Lion 클래스의 객체이자 Predator 인터페이스의 객체

    zookeeper.feed(tiger);
    zookeeper.feed(lion);

    Bouncer bouncer = new Bouncer();
    bouncer.barkAnimal(tiger);
    bouncer.barkAnimal(lion);
  }

}
