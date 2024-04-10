package ObjectOriented;

class Updater {
  void update(Counter counter) {
    counter.count++;
  }
}

class Counter {
  int count = 0;
}

public class MethodCallSample {

  public static void main(String[] args) {
    Counter myCounter = new Counter();
    System.out.println("Before Update: " + myCounter.count);

    Updater myUpdater = new Updater();
    myUpdater.update(myCounter);

    System.out.println("After Update: " + myCounter.count);
  }
}
