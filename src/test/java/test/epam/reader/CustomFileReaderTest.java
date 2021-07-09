package test.epam.reader;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import by.epam.exception.ArrayException;
import by.epam.reader.CustomFileReader;

public class CustomFileReaderTest {
	static final String TEST_FILE = "src\\main\\resources\\arrays.txt";
	CustomFileReader reader;
	
	@BeforeClass
	public void setUp() {
		reader = new CustomFileReader();
	}
	
	@AfterClass
	public void tierDown(){
		reader = null;
	}
	
	@Test
	public void  readFromFileTest() throws ArrayException {		
		
		String actual = reader.readFromFile(TEST_FILE);
		String expected = "1,-5,-3,2,100,-900";
		assertEquals(actual, expected);
	}	
}
