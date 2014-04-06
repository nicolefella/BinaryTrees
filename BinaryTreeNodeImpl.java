/**
 * This class will Implement the BinaryTreeNode ADT
 * @author nicole
 *
 */
public class BinaryTreeNodeImpl<T> implements BinaryTreeNode<T> 
{
	T data;
	BinaryTreeNodeImpl<T> left;
	BinaryTreeNodeImpl<T> right;
	
	/**
	 * Constructor
	 */
	public BinaryTreeNodeImpl()
	{
		data = null;
		left = null;
		right = null;
	}
	
	/**
	 * This method will get the data in the node 
	 */
	public T getData()
	{
		return this.data;
	}
	
	/**
	 * This method will get the pointer to the left child
	 */	
	public BinaryTreeNodeImpl<T> getLeft()
	{
		return this.left;
	}
	
	/**
	 * This method will get the pointer to the right child
	 */
	public BinaryTreeNodeImpl<T> getRight()
	{
		return this.right;
	}
	
	/**
	 * This method will set the data for the node
	 */
	public void setData(T paramData)
	{
		this.data = paramData;
	}
	
	/**
	 * This method will set the data for the left child
	 */
	public void setLeft(T paramData)
	{
		//create new temporary BinaryTreeNode
		BinaryTreeNodeImpl<T> tempNode = new BinaryTreeNodeImpl<T>();
		//set the temporary node's data to have paramData
		tempNode.setData(paramData);
		//assign the pointer of the left node to this temporary node
		this.left = tempNode;
	}
	
	/**
	 * This method will set the data for the right child
	 */
	public void setRight(T paramData)
	{
		//create new temporary BinaryTreeNode
		BinaryTreeNodeImpl<T> tempNode = new BinaryTreeNodeImpl<T>();
		//set the temporary node's data to have paramData
		tempNode.setData(paramData);
		//assign the pointer of the left node to this temporary node
		this.right = tempNode;
	}

}
