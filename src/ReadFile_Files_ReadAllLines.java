import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class ReadFile_Files_ReadAllLines {
	public static void main(String [] pArgs) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "c:\\temp\\2.sample-10KB.txt";
		File file = new File(fileName);

		long startTime = System.currentTimeMillis();
		List <String> fileLinesList = Files.readAllLines(file.toPath());
		long stopTime = System.currentTimeMillis();

		for(String line : fileLinesList) {
			System.out.println(line);
		}

		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime=" + elapsedTime);
	}
}
