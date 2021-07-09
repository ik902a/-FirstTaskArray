package by.epam.entity;

import java.util.Arrays;

public class CustomArray {
	private int[] array;
    
    public CustomArray() {
    }
    
    public CustomArray(int[] array) {
        this.array = array;
    }

    public CustomArray(int n) {
        array = new int[n];
    }
    
    public int[] getArray() {
    	return array;
    }
    
    public int getSize() {
        return array.length;
    }

    public int getElement(int i) {
            return array[i];
    }

    public void setArray(int[] array) {
        this.array = array;
        }
    
    public void setElement(int i, int value) {
            array[i] = value;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((array != null) ? Arrays.hashCode(array) : 0);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		CustomArray customArray = (CustomArray) obj;
		if (array == null) {
			if (customArray.array != null) {
				return false;
			}
		} else if (!Arrays.equals(customArray.array, this.array)) {
			return false;
		}
		return true;
	}

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("\nArray : " + array.length + "\n");
            for (int elem : array) {
                string.append(elem + " ");
            }
        return string.toString();
    }
}
