import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile_FileInputStream {
	public static void main(String [] pArgs) throws FileNotFoundException, IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "sample1.txt";
		File file = new File(fileName);
		
		try (FileInputStream fileInputStream = new FileInputStream(file)) {
			long startTime = System.currentTimeMillis();

			int singleCharInt;
			char singleChar;

			while((singleCharInt = fileInputStream.read()) != -1) {
				singleChar = (char) singleCharInt;
				//System.out.println(singleChar);
			}
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.println("elapsedTime=" + elapsedTime);
		}
	}
}
