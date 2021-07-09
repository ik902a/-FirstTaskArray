package by.epam.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.epam.entity.CustomArray;

public class SortArrayAction {
	static Logger log = LogManager.getLogger();
	
	public int[] bubbleSort(CustomArray array) {
		log.error("bubble sort action");
		int box;
		int size = array.getSize();
		int [] bubbleArray = array.getArray();
		
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size; j++) {
				if (bubbleArray[j] < bubbleArray[j -1]) {
					box = bubbleArray[j];
					bubbleArray[j] = bubbleArray[j - 1]; 
					bubbleArray[j-1] = box;
				}
			}
		}
		return bubbleArray;
	}
	
	public int[] insertionSort(CustomArray array) {
		log.error("insertion sort action");
		int box;
		int size = array.getSize();
		int [] insertionArray = array.getArray();

        for (int i = 1; i < size; i++) {
            box = insertionArray[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if ( box < insertionArray[j]) {
                	insertionArray[j + 1] = insertionArray[j];
                } else {
                	break;
                }
            }
            insertionArray[j + 1] = box;   
        }
		return insertionArray;
	}
	
	public int[] selectionSort(CustomArray array) {
		log.error("selection sort action");
		int box;
		int size = array.getSize();
		int [] selectionArray = array.getArray();

        for (int i = 0; i < size; i++) {
            int cursor = i;
            for (int j = i; j < size; j++) {
                if ( selectionArray[j] < selectionArray[cursor]) {
                	cursor = j;
                }
            }
            box = selectionArray[i];
            selectionArray[i] = selectionArray[cursor]; 
            selectionArray[cursor] = box;  
        }
		return selectionArray;
	}
}
