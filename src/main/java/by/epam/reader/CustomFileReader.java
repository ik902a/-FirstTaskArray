package by.epam.reader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.exception.ArrayException;
import by.epam.validator.ArrayValidator;

public class CustomFileReader {
	static Logger log = LogManager.getLogger();
	
	public String readFromFile (String filename) throws ArrayException {
		log.info("reader action");
		Path path = Paths.get(filename);
		
		if (!Files.exists(path) && Files.isDirectory(path) && !Files.isReadable(path)) {
			log.error("file not read");
			throw new ArrayException("file exception");
		}
		
		List<String> lines = new ArrayList<>();
		try (Stream<String> stream = Files.lines(path)) {
			lines = stream.collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String row = "";
		for (String line : lines) {
			if (ArrayValidator.isRow(line)) {
				row = line;
				break;
			} 
		}
		
		if (row.isEmpty()) {
			log.error("there is no correct line in the file");
			throw new ArrayException("there is no correct line in the file");
		}
		return row;
	}
}
