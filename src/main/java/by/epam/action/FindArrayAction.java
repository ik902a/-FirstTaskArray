package by.epam.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.entity.CustomArray;

public class FindArrayAction {
	static Logger log = LogManager.getLogger();
	
	public int min(CustomArray array){
		log.info("min action");
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
		log.info("max action");
		int max = array.getElement(0);
		int size = array.getSize();
		for (int i = 1; i < size; i++) {
			int elem = array.getElement(i);
			if (elem > max) {
				max = elem;
			}
		}
		return max;
	}
}
