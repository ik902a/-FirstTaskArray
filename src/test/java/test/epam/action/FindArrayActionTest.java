package test.epam.action;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.action.FindArrayAction;
import by.epam.action.FindArrayActionStream;
import by.epam.entity.CustomArray;

public class FindArrayActionTest {
	FindArrayAction findArray;
	FindArrayActionStream findArrayStream;
	CustomArray customArray;
	
	@BeforeClass
	public void setUp() {
		customArray = new CustomArray();
		findArray = new FindArrayAction();
		findArrayStream = new FindArrayActionStream();
	}
	
	@AfterClass
	public void tearDown() {
		customArray = null;
		findArray = null;
		findArrayStream = null;
	}
	
	@Test (dataProvider = "arrays_min")
	public void testMin(int[] array, int expected) {
		customArray.setArray(array);
		int actual = findArray.min(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_min")
	public void testMinStream(int[] array, int expected) {
		customArray.setArray(array);
		int actual = findArrayStream.minStream(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_max")
	public void testMax(int[] array, int expected) {
		customArray.setArray(array);
		int actual = findArray.max(customArray);
		assertEquals(actual, expected);
	}
	
	@Test (dataProvider = "arrays_max")
	public void testMaxStream(int[] array, int expected) {
		customArray.setArray(array);
		int actual = findArrayStream.maxStream(customArray);
		assertEquals(actual, expected);
	}
	
	@DataProvider(name = "arrays_min")
	public Object[] createArrayMin() {
		return new Object[][] { { new int[] { 1, 2, -42, -5 } , -42 },
			                    { new int[] { 1, 2, -7, 5, 10 } , -7 } };
	}
	
	@DataProvider(name = "arrays_max")
	public Object[] createArrayMax() {
		return new Object[][] { { new int[] { 1, 2, 42, -5 } , 42 },
			                    { new int[] { 1, 2, -20, 5, 7 } , 7 } };
	}
}
