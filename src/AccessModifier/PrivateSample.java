package AccessModifier;

public class PrivateSample {

  // secret 변수와 getSecret 메서드는 오직 Sample 클래스에서만 접근이 가능하고 다른 클래스에서는 접근이 불가능
  private String secret;
  private int secretNum;

  private String getSecret() {
    return secret;
  }

  private int getSecretNum() {
    return secretNum;
  }

}
