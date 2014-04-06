/**
 * This is the interface for BinaryTreeNode.
 * BinaryTreeNodes have data, a left child and a right child.
 * @author nicole
 */
public interface BinaryTreeNode<T> 
{
	/**
	 * This method will get the data in the node 
	 */
	public T getData();
	
	/**
	 * This method will get the pointer to the left child
	 */	
	public BinaryTreeNode<T> getLeft();
	
	/**
	 * This method will get the pointer to the right child
	 */
	public BinaryTreeNode<T> getRight();	
	
	/**
	 * This method will set the data for the node
	 */
	public void setData(T paramData);
	
	/**
	 * This method will set the data for the left child
	 */
	public void setLeft(T paramData);
	
	/**
	 * This method will set the data for the right child
	 */
	public void setRight(T paramData);
	
}
