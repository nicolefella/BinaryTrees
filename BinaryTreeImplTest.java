import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This testing class will test the methods for BinaryTreeImpl
 * @author nicole
 *
 */
public class BinaryTreeImplTest {

	BinaryTreeImpl<String> testTree = new BinaryTreeImpl<String>();
	
	/**
	 * This test will test the functionality of the getRoot() method
	 */
	@Test
	public void getRootTest() {
		//use assertEquals to test functionality
		assertEquals("The correct return for this method is null",
				null,
				testTree.getRoot());
	}
	
	/**
	 * This test will test the functionality of the setRoot() method
	 */
	@Test
	public void setRootTest() {
		//try assigning the root to be "root" using desired method
		testTree.setRoot("root");
		//use assertEquals to test functionality
		assertEquals("The correct return for this method should be 'root'",
				"root",
				testTree.getRoot().getData());
	}
	
	/**
	 * This test will test the functionality of the getLeftChild() method
	 */
	@Test
	public void getLeftChildTest() {
		//set there to be a root node
		testTree.setRoot("root");
		//use assertEquals to test functionality
		assertEquals("The correct return for this method should be null",
				null,
				testTree.getLeftChild(testTree.getRoot()));
	}
	
	/**
	 * This test will test the functionality of the getRoot() method
	 */
	@Test
	public void insertLeftTest() {
		//set there to be a root node
		testTree.setRoot("root");
		//try method to insert left child
		testTree.insertLeft(testTree.getRoot(), "left");
		//use assertEquals to test functionality
		assertEquals("The correct return for this method should be 'left'",
				"left",
				testTree.getLeftChild(testTree.getRoot()).getData());
	}
	/**
	 * This method will test the functionality of the getRightChild method
	 */
	@Test
	public void getRightChildTest(){
		//set there to be a root node
		testTree.setRoot("root");
		//use assertEquals to test functionality
		assertEquals("The correct return for this method should be null",
				null,
				testTree.getRightChild(testTree.getRoot()));
	}
	
	/**
	 * This test will test the functionality of the insertRight() method
	 */
	@Test
	public void setLeftChildTest() {
		//set there to be a root node
		testTree.setRoot("root");
		//try method to insert right child
		testTree.insertRight(testTree.getRoot(), "right");
		//use assertEquals to test functionality
		assertEquals("The correct return for this method should be 'right'",
				"right",
				testTree.getRightChild(testTree.getRoot()).getData());
	}
	
	/**
	 * This test method will test the functionality of inorderTraversal()
	 */
	@Test 
	public void inorderTraversalTest(){
		//set up a tree with a root, a left child, and a right child
		testTree.setRoot("root");
		testTree.insertLeft(testTree.getRoot(),"left");
		testTree.insertRight(testTree.getRoot(), "right");
		//use assertEquals to test functionality
		assertEquals("This method should return a linkedList of size 4",
				4, //there is one additional node since the head node will be the type of traversal
				testTree.inorderTraversal(testTree.getRoot(), "In-order Traversal").size());
		System.out.println(testTree.inorderTraversal(testTree.getRoot(), "In-order Traversal").toString());
	}

	/**
	 * This test method will test the functionality of preorderTraversal()
	 */
	@Test 
	public void preorderTraversalTest(){
		//set up a tree with a root, a left child, and a right child
		testTree.setRoot("root");
		testTree.insertLeft(testTree.getRoot(),"left");
		testTree.insertRight(testTree.getRoot(), "right");
		//use assertEquals to test functionality
		assertEquals("This method should return a linkedList of size 4",
				4, //there is one additional node since the head node will be the type of traversal
				testTree.preorderTraversal(testTree.getRoot(), "Pre-order Traversal").size());
		System.out.println(testTree.preorderTraversal(testTree.getRoot(), "Pre-order Traversal").toString());
	}
	

	/**
	 * This test method will test the functionality of postorderTraversal()
	 */
	@Test 
	public void postorderTraversalTest(){
		//set up a tree with a root, a left child, and a right child
		testTree.setRoot("root");
		testTree.insertLeft(testTree.getRoot(),"left");
		testTree.insertRight(testTree.getRoot(), "right");
		//use assertEquals to test functionality
		assertEquals("This method should return a linkedList of size 4",
				4, //there is one additional node since the head node will be the type of traversal
				testTree.postorderTraversal(testTree.getRoot(), "Post-order Traversal").size());
		System.out.println(testTree.postorderTraversal(testTree.getRoot(), "Post-order Traversal").toString());
	}
	
	/**
	 * This method will see how an arithmetic expression can be set using BinaryTeeImpl
	 */
	@Test 
	public void arithmeticTest(){
		//set up simple arithmetic expression with root as an operation and children as integers
		testTree.setRoot("+");
		testTree.insertLeft(testTree.getRoot(), "5");
		testTree.insertRight(testTree.getRoot(), "3");
		//show the arithmetic expressing using in-order traversal
		System.out.println(testTree.inorderTraversal(testTree.getRoot(), 
				"Arithmetic Expression Representation, disregard arrows").toString());
	}
	
	/**
	 * This method will test an evaluation of arithmetic expression
	 */
	@Test
	public void arithmeticEvalTest(){
		//set up a simple arithmetic expression with root as operation and children as integers
		testTree.setRoot("+");
		testTree.insertLeft(testTree.getRoot(), "5");
		testTree.insertRight(testTree.getRoot(), "3");
		//use postorder traversal to then evaluate using postorder calculator
		new PostFixCalculator(testTree.postorderTraversal(testTree.getRoot(),
				"").toString()); //should see "8" on a separate line in terminal output
	}
}
