import java.io.*;

public class ReadSecretFile {
	public static void main(String[] args) {
		FileReader in = null;
		try {
			in = new FileReader("C:\\windows\\system.ini");
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("파일을 열 수 없습니다");
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
