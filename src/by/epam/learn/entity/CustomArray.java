package by.epam.learn.entity;

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

    public void setElement(int i, int value) {
            array[i] = value;
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
