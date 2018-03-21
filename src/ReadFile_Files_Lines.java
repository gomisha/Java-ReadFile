import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class ReadFile_Files_Lines {

	public static void main(String[] pArgs) throws IOException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "sample1.txt";
		File file = new File(fileName);

		long startTime = System.currentTimeMillis();
		
		try (Stream<String> stream = Files.lines(file.toPath())) {
		//	stream.forEach(System.out::println);
		}
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("elapsedTime=" + elapsedTime);
	}

}
