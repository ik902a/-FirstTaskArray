package by.epam.learn.action;

import by.epam.learn.entity.CustomArray;

public class ArithmeticArrayAction {
	
	public int min(CustomArray array){
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
	
	public int max(int[] array) {
		int max = array[0];
		for (int elem : array) {
			if (elem > max) {
				max = elem;
			}
		}
		return max;
	}
	
	public int[] replacementNegativeNumbers (int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] = 0;
			}
		}
		return array;
	}
	
	public int average (int[] array) {
		int sum = 0;
		
		for (int elem : array) {
			sum += elem; 
		}
		
		return sum / array.length;
	}
	
	public int sum (int[] array) {
		int sum = 0;
		
		for (int elem : array) {
			sum += elem; 
		}
		
		return sum;
	}
	
//	public int determinationNumberOfPositiveElement (CustomArray array) {
//		int size = array.getSize();
//		int number = 0;
//		for (int i = 0; i < size; i++) {
//			if (array.getElement(i) > 0) {
//				number++;
//			}
//		}
//		
//		return number;
//	}
//
//	public int determinationNumberOfNegativeElement (CustomArray array) {
//		int size = array.getSize();
//		int number = 0;
//		for (int i = 0; i < size; i++) {
//			if (array.getElement(i) < 0) {
//				number++;
//			}
//		}
//		
//		return number;
//	}
	
	

}
