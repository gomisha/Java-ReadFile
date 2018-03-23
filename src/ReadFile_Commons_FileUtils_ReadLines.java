import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class ReadFile_Commons_FileUtils_ReadLines {
	public static void main(String [] pArgs) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "c:\\temp\\2.sample-10KB.txt";
		File file = new File(fileName);

		long startTime = System.currentTimeMillis();
		
		List<String> fileLinesList = FileUtils.readLines(file, "UTF-8");

		for(String line : fileLinesList) {
			System.out.println(line);
		}

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime=" + elapsedTime);
	}
}
