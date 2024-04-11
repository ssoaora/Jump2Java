package InputOutput;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileSample {

  public static void main(String[] args) throws IOException {

    // FileOutputStream 클래스는 객체를 생성할 때 생성자의 입력으로 파일명을 넘겨주어야 한다.
    FileOutputStream output = new FileOutputStream("assets/out.txt");

    for (int i = 1; i < 11; i++) {
      String data = i + " 번째 줄입니다.\r\n";  // 유닉스에서는 \n만 있으면 되지만 윈도우에서는 \r\n으로 작성해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시된다.
      output.write(data.getBytes());
    }
    output.close();


    // true: 파일을 추가 모드로 연다.
    FileWriter fw = new FileWriter("assets/out2.txt", true);
    for (int i = 1; i < 11; i++) {
      String data = i + "번째 줄입니다.\r\n";
      fw.write(data);
    }
    fw.close();


    PrintWriter pw = new PrintWriter(new FileWriter("assets/out3.txt"));
    for (int i = 1; i < 11; i++) {
      String data = i + "번째 줄입니다!";
      pw.println(data);
    }
    pw.close();


    byte[] b = new byte[1024];
    FileInputStream input = new FileInputStream("assets/out.txt");
    input.read(b);
    System.out.println(new String(b));
    input.close();

    BufferedReader br = new BufferedReader(new FileReader("assets/out.txt"));
    while (true) {
      String line = br.readLine();
      if (line == null)  // BufferedReader의 readLine() 메서드는 더 이상 읽을 라인이 없을 경우 null을 리턴한다.
        break;
      System.out.println(line);
    }
    br.close();
  }
}
