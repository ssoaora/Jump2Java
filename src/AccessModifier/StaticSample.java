/*
특히 스태틱 메서드는 유틸리티성 메서드를 작성할 때 많이 사용된다.
예를 들어 ‘오늘의 날짜 구하기’, ‘숫자에 콤마 추가하기’ 등의 메서드를 작성할 때 스태틱 메서드를 사용하는 것이 유리하다.

유틸리티성 메서드는 특정 클래스나 인스턴스에 종속되지 않고, 재사용이 가능하고 범용 기능을 제공하는 스태틱 메서드를 말한다.
이 메서드들은 코드의 중복을 줄이고 가독성을 향상시킨다
*/

package AccessModifier;

import java.text.SimpleDateFormat;
import java.util.Date;

class Counter {
  static int count = 0;

  Counter () {
    count++;
    System.out.println(count);
  }

  // 객체 생성 없이도 클래스를 통해 메서드를 직접 호출할 수 있다.
  public static int getCount() {
    // 스태틱 메서드 안에서는 객체 변수 접근이 불가능하다.
    // 이 예에서는 count 변수가 static 변수이기 때문에 스태틱 메서드에서 접근이 가능하다.
    return count;
  }
}

class Util {
  public static String getCurrentDate(String fmt) {
    SimpleDateFormat sdf = new SimpleDateFormat(fmt);
    return sdf.format(new Date());
  }
}

public class StaticSample {
  public static void main(String[] args) {
    Counter c1 = new Counter();
    Counter c2 = new Counter();

    System.out.println(Counter.getCount());

    System.out.println(Util.getCurrentDate("yyyyMMdd"));
  }

}
