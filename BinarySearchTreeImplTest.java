
import org.junit.Test;

/**
 * This testing class will test the methods for BinarySearchTreeImpl
 * @author nicole
 *
 */
public class BinarySearchTreeImplTest {

	BinarySearchTreeImpl<Integer> testBST = new BinarySearchTreeImpl<Integer>();
	
	/**
	 * This tester will test the functionality of the operation insert()
	 */
	@Test 
	public void insertTest() {
		//test insert() method
		testBST.insert(testBST.getRoot(), 5);

		//if this method works, should print out success to terminal
		if (testBST.getRoot().getData().compareTo(5) == 0)
			System.out.println("insertTest() passes");
		else
			System.out.println("insertTest() fails");
	}
	
	@Test
	public void insertTestL() {
		//insert node to root
		testBST.insert(testBST.getRoot(), 5);
		//test insert() method again
		testBST.insert(testBST.getRoot(), 2);
		
		//if method works it should print out successful to terminal
		if (testBST.getRoot().getLeft().getData().compareTo(2) == 0)
			System.out.println("insertTestL() passes");
		else
			System.out.println("insertTestL() fails");
	}
	
	@Test
	public void insertTestR() {
		//insert node to root
		testBST.insert(testBST.getRoot(), 5);
		//test insert() method again
		testBST.insert(testBST.getRoot(), 9);
		
		//if method works it should print out successful to terminal
		if (testBST.getRoot().getRight().getData().compareTo(9) == 0)
			System.out.println("insertTestR() passes");
		else
			System.out.println("insertTestR() fails");
				
	}
	
	/**
	 * This tester will test the functionality of the query search()
	 */
	@Test
	public void searchTest() {
		//build a tree using insert()
		testBST.insert(testBST.getRoot(), 5);
		testBST.insert(testBST.getRoot(), 2);
		testBST.insert(testBST.getRoot(), 6);
		
		//assign to temporary values
		Integer actual = testBST.getRoot().getRight().getData();
		Integer test = testBST.search(testBST.getRoot(), 6).getData();
		
		//if actual and test integers are equal, print out success
		if (test.compareTo(actual)==0)
			System.out.println("searchTest() passes");
		else
			System.out.println("searchTest() fails");
			
	}
	
	/**
	 * This tester will also test the functionality of the query search()
	 */
	@Test
	public void searchTestNotInTree() {
		//build a tree using insert()
		testBST.insert(testBST.getRoot(), 5);
		testBST.insert(testBST.getRoot(), 2);
		testBST.insert(testBST.getRoot(), 6);
		
		//assign to temporary values
		Integer actual = null;
		Integer test = testBST.search(testBST.getRoot(), 1).getData();
		
		//if actual and test integers are equal, print out success
		if (test == null && actual == null)
			System.out.println("searchTestNotInTree() passes");
		else
			System.out.println("searchTestNotInTree() fails");
			
	}
	
	/**
	 * This tester will test the functionality of the query getMin()
	 */
	@Test
	public void getMinTest() {
		//build a tree using insert()
		testBST.insert(testBST.getRoot(), 5);
		testBST.insert(testBST.getRoot(), 2);
		testBST.insert(testBST.getRoot(), 6);
		//Test for the Min, which is 2
		if (testBST.getMin(testBST.getRoot()).compareTo(2) == 0)
			System.out.println("getMinTest() passes");
		else
			System.out.println("getMinTest() fails");
	}
	
	/**
	 * This tester will also test the functionality of the query getMin()
	 */
	@Test
	public void getMinTestAgain() {
		//build a tree using insert()
		testBST.insert(testBST.getRoot(), 5);
		testBST.insert(testBST.getRoot(), 2);
		testBST.insert(testBST.getRoot(), 6);
		testBST.insert(testBST.getRoot(), 0);
		testBST.insert(testBST.getRoot(), 1);
		//Test for the Min, which is 2
		if (testBST.getMin(testBST.getRoot()).compareTo(0) == 0)
			System.out.println("getMinTestAgain() passes");
		else
			System.out.println("getMinTestAgain() fails");
	}
	
	/**
	 * This tester will test the functionality of the query getMax()
	 */
	@Test 
	public void getMaxTest() {
		//build a tree using insert()
		testBST.insert(testBST.getRoot(), 5);
		testBST.insert(testBST.getRoot(), 2);
		testBST.insert(testBST.getRoot(), 6);
		//Test for the Max, which is 6
		if (testBST.getMax(testBST.getRoot()).compareTo(6) == 0)
			System.out.println("getMaxTest() passes");
		else
			System.out.println("getMaxTest() fails");
	}
	/**
	 * This tester will also test the functionality of the query getMax()
	 */
	@Test 
	public void getMaxTestAgain() {
		//build a tree using insert()
		testBST.insert(testBST.getRoot(), 5);
		testBST.insert(testBST.getRoot(), 2);
		testBST.insert(testBST.getRoot(), 6);
		testBST.insert(testBST.getRoot(),100);
		testBST.insert(testBST.getRoot(), 94);
		//Test for the Max, which is 6
		if (testBST.getMax(testBST.getRoot()).compareTo(100) == 0)
			System.out.println("getMaxTestAgain() passes");
		else
			System.out.println("getMaxTestAgain() fails");
	}
	
//	/**
//	 * Test Binary Tree by using inorder traversal
//	 */
//	@Test
//	public void inorderBSTtraversalTest()
//	{
//		//build a tree using insert()
//		testBST.insert(testBST.getRoot(), 5);
//		testBST.insert(testBST.getRoot(), 2);
//		testBST.insert(testBST.getRoot(), 6);
//		testBST.insert(testBST.getRoot(), 0);
//		testBST.insert(testBST.getRoot(), 1);
//		testBST.insert(testBST.getRoot(),100);
//		testBST.insert(testBST.getRoot(), 94);
//		
//		System.out.println(testBST.inorderTraversalBST(testBST.getRoot()).toString());
//			
//	}
	
}
