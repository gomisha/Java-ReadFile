import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile_BufferedInputStream_Read {
	public static void main(String [] pArgs) throws FileNotFoundException, IOException {
		System.out.println("Hello ReadFile_BufferedInputStream");
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "sample1.txt";
		File file = new File(fileName);
		FileInputStream fileInputStream = new FileInputStream(file);
		
		try (BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
			long startTime = System.currentTimeMillis();

			int singleCharInt;
			char singleChar;
			while((singleCharInt = bufferedInputStream.read()) != -1) {
				singleChar = (char) singleCharInt;
				//System.out.println(singleChar);
			}
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.println("elapsedTime=" + elapsedTime);
		}
	}
}
