// 클래스의 분류가 용이하다(비슷한 것끼리 묶는다).
// 패키지가 다르다면 동일한 클래스명을 사용할 수 있다.

package house;

public class HouseLee {

  protected final static String lastName = "Lee";
  public String info = "This is Lee's House.";

  public static void main(String[] args) {
    HouseKim LeaderKim = new HouseKim();  // 같은 패키지 안에 있으므로, import 필요 없음.
    System.out.println(LeaderKim.lastName);
  }
}
