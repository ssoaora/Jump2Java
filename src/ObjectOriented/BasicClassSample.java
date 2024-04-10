package ObjectOriented;

class Animal {
  String name;  // instance variable

  public void setName(String name) {
    this.name = name;
  }
}

public class BasicClassSample {

  public static void main(String[] args) {
    Animal cat = new Animal();
    Animal dog = new Animal();

    cat.setName("Amigo");
    dog.setName("Tomodachi");

    System.out.println(cat.name);
    System.out.println(dog.name);
  }

}
