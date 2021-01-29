package by.epam.learn.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import by.epam.learn.exception.ArrayException;

public class CustomFileReader {
	public List<String> readFromFile (String filename) throws ArrayException {
	
	Path path = Paths.get(filename);
	
	if (Files.exists(path) && !Files.isDirectory(path) && Files.isReadable(path)) {
		throw new ArrayException("file exception");
	}
	
	List<String> lines = new ArrayList<>();
	try (Stream<String> stream = Files.lines(path)) {
		lines = stream.collect(Collectors.toList());
	} catch (IOException e) {
		e.printStackTrace();
	}
	return lines;
	}
}
