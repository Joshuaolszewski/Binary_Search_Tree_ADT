
//Joshua Olszewski
//BST 
public class BSTNode
{
    private BSTNode leftChild;
    private BSTNode rightChild;
    private Dollar data; 
    
    public BSTNode(BSTNode leftChild, BSTNode rightChild, Dollar data)
    {
        this.leftChild = leftChild; 
        this.rightChild = rightChild;
        this.data = data; 
    }
    
    public BSTNode()
    {
        this.leftChild = null; 
        this.rightChild = null;
        this.data = null; 
    }
    
    public BSTNode(Dollar data)
    {
        this.leftChild = null; 
        this.rightChild = null;
        this.data = data; 
    }
    
    public BSTNode getLeftChild()
    {
        return this.leftChild; 
    }
    
    public BSTNode getRightChild()
    {
        return this.rightChild; 
    }
    
    public Dollar getData()
    {
        return this.data; 
    }
    
    public void setLeftChild(BSTNode leftChild)
    {
        this.leftChild = leftChild;  
    }
    
    public void setRightChild(BSTNode rightChild)
    {
        this.rightChild = rightChild; 
    }
    
    public void setData(Dollar data)
    {
        this.data = data; 
    }
    
    public void clear()
    {
        setLeftChild(null);
        setRightChild(null);       
    }
    
    public String Print()
    {
        return "" + getData().getValue(); 
    }
}
