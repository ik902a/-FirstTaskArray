package by.epam.action;

import java.util.stream.IntStream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.entity.CustomArray;

public class FindArrayActionStream {
	static Logger log = LogManager.getLogger();
	
	public int minStream(CustomArray array){
		log.info("min stream!!!");
		
		int [] localArray = array.getArray();
		return IntStream.of(localArray)
							.min()
							.getAsInt();
	}
	
	public int maxStream(CustomArray array) {
		log.info("max stream!!!");
		
		int [] localArray = array.getArray();
		return IntStream.of(localArray)
							.max()
							.getAsInt();
	}
}
