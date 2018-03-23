import java.io.File;
import java.io.IOException;
import java.util.List;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class ReadFile_Guava_Files_ReadLines {

	public static void main(String[] args) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "c:\\temp\\2.sample-10KB.txt";
		File file = new File(fileName);

		long startTime = System.currentTimeMillis();
		
		List<String> fileLinesList = Files.readLines(file, Charsets.UTF_8);
		
		for(String line : fileLinesList) {
			System.out.println(line);
		}

		long stopTime = System.currentTimeMillis();
		
		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime=" + elapsedTime);
	}
}
