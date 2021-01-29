package by.epam.learn.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.CustomArray;

public class FindArrayAction {
	static Logger log = LogManager.getLogger();
	
	public int min(CustomArray array){
		log.error("Min");
		int min = array.getElement(0);
		int size = array.getSize();
		for (int i = 1; i < size; i++) {
			int elem = array.getElement(i);
			if (elem < min) {
				min = elem;
			}
		}
		return min;
	}
	
	public int max(CustomArray array) {
		int max = array.getElement(0);
		int size = array.getSize();
		for (int i = 1; i < size; i++) {
			int elem = array.getElement(i);
			if (elem < max) {
				max = elem;
			}
		}
		return max;
	}

}
