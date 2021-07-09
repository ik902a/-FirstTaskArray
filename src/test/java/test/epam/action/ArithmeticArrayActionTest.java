package test.epam.action;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.action.ArithmeticArrayAction;
import by.epam.action.ArithmeticArrayActionStream;
import by.epam.entity.CustomArray;

public class ArithmeticArrayActionTest {
	ArithmeticArrayAction arifmeticArray;
	ArithmeticArrayActionStream arifmeticArrayStream;
	CustomArray customArray;
	
	@BeforeClass
	public void setUp() {
		customArray = new CustomArray();
		arifmeticArray = new ArithmeticArrayAction();
		arifmeticArrayStream = new ArithmeticArrayActionStream();
	}
	
	@AfterClass
	public void tearDown() {
		customArray = null;
		arifmeticArray = null;
		arifmeticArrayStream = null;
	}
	
	@Test (dataProvider = "arrays_replacement")
	public void testReplacementNegativeNumbers(int[] array, int[] expected) {
		customArray.setArray(array);
		int[] actual = arifmeticArray.replacementNegativeNumbers(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_replacement")
	public void testReplacementNegativeNumbersStream(int[] array, int[] expected) {
		customArray.setArray(array);
		int[] actual = arifmeticArrayStream.replacementNegativeNumbersStream(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_average")
	public void testAverage(int[] array, double expected) {
		customArray.setArray(array);
		double actual = arifmeticArray.average(customArray);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test (dataProvider = "arrays_average")
	public void testAverageStream(int[] array, double expected) {
		customArray.setArray(array);
		double actual = arifmeticArrayStream.averageStream(customArray);
		assertEquals(actual, expected, 0.0001);
	}
	
	@Test (dataProvider = "arrays_sum")
	public void testSum(int[] array, int expected) {
			customArray.setArray(array);
			int actual = arifmeticArray.sum(customArray);
			assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_sum")
	public void testSumStream(int[] array, int expected) {
			customArray.setArray(array);
			int actual = arifmeticArrayStream.sumStream(customArray);
			assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_positive")
	public void testDeterminationNumberOfPositiveElement(int[] array, int expected) {
			customArray.setArray(array);
			int actual = arifmeticArray.determinationNumberOfPositiveElement(customArray);
			assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_positive")
	public void testDeterminationNumberOfPositiveElementStream(int[] array, int expected) {
			customArray.setArray(array);
			int actual = arifmeticArrayStream.determinationNumberOfPositiveElementStream(customArray);
			assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_negative")
	public void testDeterminationNumberOfNegativeElement (int[] array, int expected) {
		customArray.setArray(array);
		int actual = arifmeticArray.determinationNumberOfNegativeElement (customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_negative")
	public void testDeterminationNumberOfNegativeElementStream (int[] array, int expected) {
		customArray.setArray(array);
		int actual = arifmeticArrayStream.determinationNumberOfNegativeElementStream (customArray);
		assertEquals(actual, expected);
	}
	
	@DataProvider(name = "arrays_replacement")
	public Object[] createArrayReplacement() {
		return new Object[][] { { new int[] { 1, -7, 5, -1 } , new int[] { 1, 0, 5, 0 }},
								{ new int[] { -9, 8, -42, 20 , 0} , new int[] { 0, 8, 0, 20, 0 }} };
	}
	
	@DataProvider(name = "arrays_average")
	public Object[] createArrayAverage() {
		return new Object[][] { { new int[] { 1, 2, 42, -5 } , 10.0 },
			                    { new int[] { 1, 3, -20, 5, 7 } , -0.8 } };
	}
	
	@DataProvider(name = "arrays_sum")
	public Object[] createArraySum() {
		return new Object[][] { { new int[] { 1, 2, 42, -5 } , 40 },
			                    { new int[] { 1, 3, -20, 5, 7 } , -4 } };
	}
	
	@DataProvider(name = "arrays_positive")
	public Object[] createArrayPositive() {
		return new Object[][] { { new int[] { 1, 2, 42, -5 } , 3 },
			                    { new int[] { -1, -3, 0, -5, -7 } , 0 } };
	}
	
	@DataProvider(name = "arrays_negative")
	public Object[] createArrayNegative() {
		return new Object[][] { { new int[] { 1, 2, 42, -5 } , 1 },
			                    { new int[] { 1, 0, -20, 5, -7 } , 2 } };
	}
}
