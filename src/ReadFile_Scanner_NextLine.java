import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile_Scanner_NextLine {
	public static void main(String [] pArgs) throws FileNotFoundException {
		System.out.println("javaVersion=" + System.getProperty("java.version"));

		String fileName = "sample1.txt";
		File file = new File(fileName);
		
		try (Scanner scanner = new Scanner(file)) {
			long startTime = System.currentTimeMillis();
			String line;
			boolean hasNextLine = false;
			while(hasNextLine = scanner.hasNextLine()) {
				line = scanner.nextLine();
				//System.out.println(line);
			}
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.println("elapsedTime=" + elapsedTime);
		}
	}
}
