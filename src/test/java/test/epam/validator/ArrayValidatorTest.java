package test.epam.validator;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.validator.ArrayValidator;

public class ArrayValidatorTest {

	@Test(dataProvider = "arrays_row")
	public void  readFromFileTest(String row) {		
		boolean value = ArrayValidator.isRow(row);
		assertTrue(value);
	}
	
	@DataProvider(name = "arrays_row")
	public Object[] createArraysSort() {
		return new Object[] { "1,5,3,-2,100,900",
							"-43,-21,-43,-54,76,-1" };
	}
}
