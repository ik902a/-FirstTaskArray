package test.epam.parser;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import by.epam.entity.CustomArray;
import by.epam.parser.CustomParser;

public class CustomParserTest {
	CustomParser parser;
	
	@BeforeClass
	public void setUp() {	
		parser = new CustomParser();
	}
	
	@AfterClass
	public void tierDown(){
		parser = null;		
	}
	
	@Test(dataProvider = "arrays_parse")
	public void parseArrayTest(String row, int[] array) {
		CustomArray expected = new CustomArray(array);
		CustomArray actual = parser.parseArray(row);           		
		Assert.assertEquals(actual, expected);
	}	
	
	@DataProvider(name = "arrays_parse")
	public Object[] createArraysSort() {
		return new Object[][] { { "1,2,3,-1" , new int[] { 1, 2, 3, -1} },
			                    { "9,2,-42,-100" , new int[] { 9, 2, -42, -100} },
			                    { "-300,-500,900,0" , new int[] { -300, -500, 900, 0} }};
	}
}
