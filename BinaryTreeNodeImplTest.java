import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This testing class will test the methods for BinaryTreeNodeImpl
 * @author nicole
 *
 */
public class BinaryTreeNodeImplTest {

	BinaryTreeNodeImpl<String> testNode = new BinaryTreeNodeImpl<String>();
	
	/**
	 * This will test the getData() method
	 */
	@Test
	public void getDataTest() {
		//use assertEquals to test functionality 
		assertEquals("The correct return for this test is null",
				null,
				testNode.getData());
	}

	/**
	 * This method will test the setData() method, using getData() method to test if correct.
	 * The getDataTest() has been checked and runs properly which is why I will use it in this test.
	 */
	@Test
	public void setDataTest() {
		//must try to set the data using the method being tested
		testNode.setData("a");
		//now do assertEquals to test functionality 
		assertEquals("The correct return for this test will be 'a'",
				"a",
				testNode.getData());
	}

	/** 
	 * This testing method will see if getLeft() is functional.
	 * This test should return null if the test runs as expected.
	 */
	@Test
	public void getLeftTest() {
		//use assertEquals to test functionality
		assertEquals("The correct return for this test should be null",
				null,
				testNode.getLeft());
	}

	/**
	 * This method will test the functionality of setLeft() method.
	 * Because the getLeftTest() and the getData() methods are functional, 
	 * we can use it in this testing method.
	 */
	@Test
	public void setLeftTest() {
		//try setting data using the setLeft() method
		testNode.setLeft("l");
		//use assertEquals to test functionality 
		assertEquals("The correct return for this test should be 'l'",
				"l",
				testNode.getLeft().getData());
	}

	/**
	 * This method will test the functionality of the getRight() method
	 */
	@Test
	public void getRightTest() {
		assertEquals("The correct return for this test should be null",
				null,
				testNode.getRight());
	}
	/**
	 * This method will test the functionality of setLeft() method.
	 * Because the getLeftTest() and the getData() methods are functional functional, 
	 * we can use it in this testing method.
	 */
	@Test
	public void setRightTest() {
		//perform the method we wish to test: setRight()
		testNode.setRight("r");
		//use assertEquals to test functionality
		assertEquals("The correct return for this method should be 'r'",
				"r",
				testNode.getRight().getData());
	}


}
