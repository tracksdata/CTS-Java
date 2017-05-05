package org.example.java8;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Path path = FileSystems.getDefault().getPath("files", "hamlet.txt");
		System.out.println(path.toAbsolutePath());
		String searchTerm = "A";

		try (Stream<String> lines = Files.lines(path)) {
			
			Optional<String> line = lines.filter(l -> l.contains(searchTerm)).findFirst();
			
			if (line.isPresent()) {
				System.out.println("Found :" + line.get());
			} else {
				System.out.println("Not Found");
			}

		} catch (Exception e) {
			System.out.println("There was an error:" + e.getMessage());
		}

	}

}
