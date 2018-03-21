import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile_BufferedFileReader_ReadLine {
	public static void main(String [] args) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "sample1.txt";
		FileReader fileReader = new FileReader(fileName);
		
		try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			long startTime = System.currentTimeMillis();
			String line;
			while((line = bufferedReader.readLine()) != null) {
				//System.out.println(line);
			}
			long stopTime = System.currentTimeMillis();
			
			long elapsedTime = stopTime - startTime;
			System.out.println("elapsedTime=" + elapsedTime);
		}
	}
}
