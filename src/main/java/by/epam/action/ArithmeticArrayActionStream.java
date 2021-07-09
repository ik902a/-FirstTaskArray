package by.epam.action;

import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.entity.CustomArray;

public class ArithmeticArrayActionStream {
	static Logger log = LogManager.getLogger();
	
	public int[] replacementNegativeNumbersStream (CustomArray array) {
		log.info("replacement stream action");
		int [] localArray = array.getArray();
		return IntStream.of(localArray)
					.map(value -> {
						if (value < 0) {
							return value = 0;
						} else {
							return value;
						}})
					.toArray();
	}

	public double averageStream (CustomArray array) {
		log.info("average stream action");
		int [] localArray = array.getArray();
		return IntStream.of(localArray)
							.average()
							.getAsDouble() ;
	}
	
	public int sumStream (CustomArray array) {
		log.info("sum stream action");
		int [] localArray = array.getArray();
		return IntStream.of(localArray)
							.sum();
	}
	
	public int determinationNumberOfPositiveElementStream (CustomArray array) {
		log.info("positive stream action");
		int [] localArray = array.getArray();
		return (int) IntStream.of(localArray)
				.filter(value -> value > 0)
				.count();
	}

	public int determinationNumberOfNegativeElementStream (CustomArray array) {
		log.info("negative stream action");
		int [] localArray = array.getArray();
		return (int) IntStream.of(localArray)
				.filter(value -> value < 0)
				.count();
	}
}
