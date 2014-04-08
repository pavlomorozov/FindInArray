package dp.ua.pavelmorozov.archer;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Tests class FindInArrray function: findIndex(int[], int) 
 * @author P
 *
 */

public class FindInArrayTest {
	private static final int VALUE_TO_SEARCH_FOUND = 114;
	private static final int INT_ARRAY_EMPTY [] = null;
	private static final int INT_ARRAY_ONE [] = {114};
	private static final int POSITION_IN_ONE_ELEMENT_ARRAY = 0;
	private static final int INT_ARRAY_ODD [] = {9797, 3597, 257, 135, 114, 97, 11, 2, 0, -12, -178, -367, -495};
	private static final int INT_ARRAY_EVEN [] = {9797, 3597, 257, 135, 114, 97, 11, 2, 0, -12, -178, -367};
	private static final int POSITION_IN_MULTI_ELEMENT_ARRAY = 4;
	private static final int VALUE_TO_SEARCH_NOT_FOUND = 100;
	private static final int POSITION_NOT_FOUND = -1;
	
	/**
	 *Number exist in array 
	 */
	@Test
	public void testNumberExist() {
		
		int index;
		
		//1 element array
		index = FindInArray.findIndex(INT_ARRAY_ONE, VALUE_TO_SEARCH_FOUND);
		assertEquals(index,POSITION_IN_ONE_ELEMENT_ARRAY);
		
		//odd element array
		index = FindInArray.findIndex(INT_ARRAY_ODD, VALUE_TO_SEARCH_FOUND);
		assertEquals(index,POSITION_IN_MULTI_ELEMENT_ARRAY);
		
		//even element array
		index = FindInArray.findIndex(INT_ARRAY_EVEN, VALUE_TO_SEARCH_FOUND);
		assertEquals(index,POSITION_IN_MULTI_ELEMENT_ARRAY);
	}
	
	@Rule public ExpectedException thrown = ExpectedException.none();
	
	/**
	 *Number not exist in array 
	 */
	@Test
	public void testNumberNotExist() {
		
		int index;
		
		//1 element array
		index = FindInArray.findIndex(INT_ARRAY_ONE, VALUE_TO_SEARCH_NOT_FOUND);
		assertEquals(index,POSITION_NOT_FOUND);
		
		//odd element array
		index = FindInArray.findIndex(INT_ARRAY_ODD, VALUE_TO_SEARCH_NOT_FOUND);
		assertEquals(index,POSITION_NOT_FOUND);

		//even element array
		index = FindInArray.findIndex(INT_ARRAY_EVEN, VALUE_TO_SEARCH_NOT_FOUND);
		assertEquals(index,POSITION_NOT_FOUND);

		//0 element array
		thrown.expect(NullPointerException.class);
		thrown.expectMessage("The first argument should be not empty array.");
		index = FindInArray.findIndex(INT_ARRAY_EMPTY, VALUE_TO_SEARCH_NOT_FOUND);
		assertEquals(index,POSITION_NOT_FOUND);
	}
}
	

