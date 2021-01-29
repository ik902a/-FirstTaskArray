package by.epam.learn.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.learn.entity.CustomArray;

public class ArithmeticArrayAction {
	
	static Logger log = LogManager.getLogger();
		
	public int[] replacementNegativeNumbers (CustomArray array) {
		int[] localArray = array.getArray();
		int size = array.getSize();
		for (int i = 0; i < size; i++) {
			if (localArray[i] < 0) {
				localArray[i] = 0;
			}
		}
		return localArray;
	}
	
	public int average (CustomArray array) {
		int sum = 0;
		int size = array.getSize();
		for (int i = 1; i < size; i++) {
			sum += array.getElement(i); 
		}
		
		return sum / size;
	}
	
	public int sum (CustomArray array) {
		int sum = 0;
		int size = array.getSize();
		for (int i = 1; i < size; i++) {
			sum += array.getElement(i); 
		}
		
		return sum;
	}
	
	public int determinationNumberOfPositiveElement (CustomArray array) {
		int size = array.getSize();
		int number = 0;
		for (int i = 0; i < size; i++) {
			if (array.getElement(i) > 0) {
				number++;
			}
		}
		
		return number;
	}

	public int determinationNumberOfNegativeElement (CustomArray array) {
		int size = array.getSize();
		int number = 0;
		for (int i = 0; i < size; i++) {
			if (array.getElement(i) < 0) {
				number++;
			}
		}

		return number;
	}

}
