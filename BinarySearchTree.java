/**
 * This is the interface for BinarySearchTree.
 * This interface extends the BinaryTree interface
 * @author nicole
 *
 */
public interface BinarySearchTree<T extends Comparable<T>> extends BinaryTree<T>
{
	/**
	 * Operation to insert number.
	 */
	public void insert(BinaryTreeNodeImpl<T> currentNode, T paramData);
	
	/**
	 * Query to search within BinarySearchTree.
	 * Will return node which matches search.
	 */
	public BinaryTreeNodeImpl<T> search(BinaryTreeNodeImpl<T> currentNode, T paramData);
	
	/**
	 * Query to getMin value of tree.
	 */
	public T getMin(BinaryTreeNodeImpl<T> currentNode);
	
	/**
	 * Query to getMax value of tree
	 */
	public T getMax(BinaryTreeNodeImpl<T> currentNode);
	
}
