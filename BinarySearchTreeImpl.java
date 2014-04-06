
/**
 * This class will Implement the BinaryTree ADT
 * @author nicole
 * 
 */
public class BinarySearchTreeImpl<T extends Comparable<T>> extends 
BinaryTreeImpl<T> implements BinarySearchTree<T>
{	
	/**
	 * Constructor, calls superclass constructor
	 */
	public BinarySearchTreeImpl()
	{
		super();
	}
	/**
	 * Operation to insert number.
	 * Left children have data less than current node.
	 * Right children have data greater than or equal to current node.
	 */
	public void insert(BinaryTreeNodeImpl<T> currentNode, T paramData)
	{
		//if the current node is empty and data is trying to be inserted as root
		if(this.root==null)
		{
			this.setRoot(paramData);
		}
		//if the data is less than the current node's data
		else if (paramData.compareTo(currentNode.getData())<0)
		{
			//insert left if possible
			if(currentNode.getLeft() == null)
				this.insertLeft(currentNode, paramData);
			//otherwise the pointer isn't null so you must recurse further
			else
				this.insert(currentNode.getLeft(), paramData);
		}
		//otherwise the data is greater than or equal to the current node's data
		else if (paramData.compareTo(currentNode.getData())>=0)
		{
			//insert right if possible
			if(currentNode.getRight() == null)
				this.insertRight(currentNode, paramData);
			//otherwise the pointer isn't null, so you must recurse further
			else
				this.insert(currentNode.getRight(), paramData);
		}
	}
	
	/**
	 * Query to search within BinarySearchTree.
	 * Will return node which matches search.
	 * If there is no match anywhere, a false node with no data will be returned.
	 */
	public BinaryTreeNodeImpl<T> search(BinaryTreeNodeImpl<T> currentNode, T paramData)
	{
		//create BinaryTreeNodeImpl which will be returned if no matches are found in search
		BinaryTreeNodeImpl<T> falseNode = new BinaryTreeNodeImpl<T>();
		
		//if the current node's data matches and there is no right pointer
		if (paramData.compareTo(currentNode.getData())==0 && currentNode.getRight() == null)
		{
			//match :) return current node
			return currentNode;
		}
		//if the current node's data might be in left child (and able to go to left child)
		else if (paramData.compareTo(currentNode.getData())<0 && currentNode.getLeft() != null)
		{
			//recursively keep searching left child
			return this.search(currentNode.getLeft(), paramData);
		}
		//if current node's data might be in right child (and able to go to right child)
		else if (paramData.compareTo(currentNode.getData())>=0 && currentNode.getRight() != null)
		{
			//recursively keep searching right child
			return this.search(currentNode.getRight(), paramData);
		}
		//if none of the conditions are fulfilled, then return currentNode
		return falseNode;
	}
	
	/**
	 * Query to getMin value of tree.
	 */
	public T getMin(BinaryTreeNodeImpl<T> currentNode)
	{
		//if there is a null pointer to left, you have found your mind
		if(currentNode.getLeft() == null)
			return currentNode.getData();
		//otherwise you must recurse to the left child 
		else
			return getMin(currentNode.getLeft());
	}
	
	/**
	 * Query to getMax value of tree
	 */
	public T getMax(BinaryTreeNodeImpl<T> currentNode)
	{
		//if there is a null pointer to right, you have found your mind
		if(currentNode.getRight() == null)
			return currentNode.getData();
		//otherwise you must recurse to the right child 
		else
			return getMax(currentNode.getRight());	
	}
	
//	/**
//	 * This method will get the inorderTraversal.
//	 * Must recursively traverse left, refer to data, recursively traverse right. 
//	 */
//	public LinkedList<T> inorderTraversalBST(BinaryTreeNodeImpl<T> currentNode)
//	{		
//		//create temporary LinkedList<T> to return
//		LinkedList<T> tempList = new LinkedList<T>();
//		
//		/**base case: if the current node has no children**/
//		if(currentNode.getLeft() == null && currentNode.getRight() == null)
//		{
//			tempList.insertFirst(currentNode.getData());
//			return tempList;
//		}
//		
//		/**recursive case: more tree left**/
//		//recursively traverse left
//		tempList.head.setNext(inorderTraversalBST(getLeftChild(currentNode)).getFirstNode());
//		//refer to data
//		tempList.insertAfter(tempList.getLastNode(),currentNode.getData());
//		//recursively traverse right
//		tempList.getLastNode().setNext(inorderTraversalBST(getRightChild(currentNode)).getFirstNode());
//		//return the temporary LinkeList
//		return tempList;
//	}
		
}