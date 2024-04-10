package ObjectOriented;

class Animal {
  String name;  // instance variable

  public void setName(String name) {
    this.name = name;
  }
}

class Dog extends Animal {
  void sleep() {
    System.out.println(this.name + " is sleeping.");
  }
}

class HouseDog extends Dog {

  @Override // 부모 클래스의 메서드를 자식 클래스가 동일한 형태로 또다시 구현하는 행위
  void sleep() {
    System.out.println(this.name + " is sleeping in her house.");
  }

  // 입력 항목이 다른 경우 동일한 이름의 메서드를 생성
  void sleep(int hour) {
    System.out.println(this.name + " is sleeping for " + hour + " hours.");
  }
}

public class BasicClassSample {

  public static void main(String[] args) {
    // Animal dog = new Dog();  Dog is an Animal, sleep() method 사용 불가.

    /*
    Dog dog = new Dog();
    dog.setName("Friend");

    System.out.println(dog.name);
    dog.sleep();
     */

    HouseDog houseDog = new HouseDog();
    houseDog.name="Tomodachi";

    houseDog.sleep();
    houseDog.sleep(3);
  }
}
