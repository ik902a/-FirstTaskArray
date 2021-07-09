package by.epam.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.entity.CustomArray;

public class CustomParser {
	static Logger log = LogManager.getLogger();
	private static final String DELIMETER =",";
	
	public CustomArray parseArray(String row) {
		String [] rowArray = row.split(DELIMETER);
		int [] array = new int[rowArray.length];
		for (int i = 0; i < rowArray.length; i++) {
			array[i] = Integer.parseInt(rowArray[i]);
		}
		
		CustomArray customArray = new CustomArray(array);
		log.info("parser action");
		return customArray;
	}
}
