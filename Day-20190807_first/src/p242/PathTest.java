package p242;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {

	public static void main(String[] args) {
		Path path = Paths.get("C:/DEV/WorkSpace_JAVA/sample.txt");
		
		try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)){
			reader.lines()
				.forEach(System.out::println);
		
		}catch (IOException ex) {
			System.err.println(ex);			
			
		}		
		
	}			

}
