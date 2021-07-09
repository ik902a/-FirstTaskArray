package by.epam.action;

import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.entity.CustomArray;

public class SortArrayActionStream {
	static Logger log = LogManager.getLogger();
	
	public int[] sortStream (CustomArray array) {
		log.info("sort stream action");
		int [] localArray = array.getArray();
		return IntStream.of(localArray)
					.sorted()
					.toArray();
	}
}
