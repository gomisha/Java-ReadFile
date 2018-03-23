import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile_BufferedFileReader_ReadLine_Encoding {
	public static void main(String [] args) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "c:\\temp\\2.sample-10KB.txt";

		FileInputStream fileInputStream = new FileInputStream(fileName); 
		
		//specify UTF-8 encoding explicitly
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
		
		try (BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
			long startTime = System.currentTimeMillis();
			String line;
			while((line = bufferedReader.readLine()) != null) {
				//comment out next line for performance tests
				System.out.println(line);
			}
			long stopTime = System.currentTimeMillis();
			
			long elapsedTime = stopTime - startTime;
			System.out.println("elapsedTime=" + elapsedTime);
		}
	}
}
