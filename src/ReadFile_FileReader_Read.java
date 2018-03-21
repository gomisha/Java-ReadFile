import java.io.FileReader;
import java.io.IOException;

public class ReadFile_FileReader_Read {
	public static void main(String [] pArgs) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "sample1.txt";
		
		try (FileReader fileReader = new FileReader(fileName);) {
			long startTime = System.currentTimeMillis();
			int singleCharInt;
			char singleChar;
			while((singleCharInt = fileReader.read()) != -1) {
				singleChar = (char) singleCharInt;
				//System.out.println(singleChar);
			}
			long stopTime = System.currentTimeMillis();
			
			long elapsedTime = stopTime - startTime;
			System.out.println("elapsedTime=" + elapsedTime);
		}
	}
}

