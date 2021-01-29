package by.epam.learn.parser;

import java.util.ArrayList;
import java.util.List;

import by.epam.learn.entity.CustomArray;

public class CustomParser {
	private static final String DELIMETER ="\\s";
	
	public List<CustomArray> parseArray(List<String> arrays) {
		List<CustomArray> newArrays = new ArrayList<>();
		
		for(String elem : arrays) {
			String [] row = elem.split(DELIMETER);
			int [] array = new int[row.length];
			for (int i = 0; i < row.length; i++) {
				array[i] = Integer.parseInt(row[i]);
			}
			CustomArray customArray = new CustomArray(array);
			newArrays.add(customArray);
		}
		return newArrays;
	}
}