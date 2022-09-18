
//Joshua Olszewski
//BST 
public class BST
{
    private BSTNode root; 
    
    public BST(BSTNode root)
    {
        this.root = root; 
    }
    
    public BST()
    {
        this.root = null; 
    }
    
    public BSTNode getRoot()
    {
        return this.root; 
    }
    /* Searches the BST for a specific node and returns that node or null if it cant find it 
     
    Precondition: use on a bst object and specify node. 
    Postcondition: none
    return: BSTNode 
    PseudoCode: 
    BSTSearch(tree, key) 
    {
        cur = tree⇢root
        while (cur is not null)
        {
            if (key == cur⇢key) 
            {
                return cur // Found
            }
        }
        else if (key < cur⇢key) 
        {
            cur = cur⇢left
        }
        else 
        {
         cur = cur⇢right
        }
    }
    return null // Not found

    */
    public BSTNode Search(Dollar key) 
    {
        BSTNode cur = this.root; 
        while (cur != null) 
        {
            if(key.getValue() == cur.getData().getValue())
            {
                return cur;
            }
            else if(key.getValue() < cur.getData().getValue()) 
            {
                cur = cur.getLeftChild();
            }
            else 
            {
                cur = cur.getRightChild();
            }
        }
        return null; 
    }
    /* Inserts a node into BST following BST ordering. 
     
    Precondition: use on a bst object and specify node.  
    Postcondition: updates pointers of nodes in BST to new BSTNode 
    return: void
    PseudoCode: 
    BSTInsert(tree, node) {
       if (tree⇢root is null) {
          tree⇢root = node
       }
       else {
          currentNode = tree⇢root
          while (currentNode is not null) {
             if (node⇢key < currentNode⇢key) {
                if (currentNode⇢left is null) {
                   currentNode⇢left = node
                   currentNode = null
                }
                else {
                   currentNode = currentNode⇢left
                }
             }
             else {
                if (currentNode⇢right is null) {
                   currentNode⇢right = node
                   currentNode = null
                }
                else {
                   currentNode = currentNode⇢right
                }
             }
          }
       }
    }
    */
    public void Insert(BSTNode node) 
    {
        if (this.root == null) 
        {
            this.root = node;
        }
        else 
        {
            BSTNode currentNode = this.root; 
            while(currentNode != null) 
            {
                if(node.getData().getValue() < currentNode.getData().getValue()) 
                {
                    if(currentNode.getLeftChild() == null) 
                    {
                        currentNode.setLeftChild(node);
                        currentNode = null; 
                    }
                    else 
                    {
                        currentNode = currentNode.getLeftChild(); 
                    }
                }
                else 
                {
                    if(currentNode.getRightChild() == null) 
                    {
                        currentNode.setRightChild(node);
                        currentNode = null;
                    }
                    else 
                    {
                        currentNode = currentNode.getRightChild(); 
                    }
                }
            }
        }
    }
    /* Removes a node from BST following BST ordering and clears pointers from deleted node.  
     
    Precondition: use on a bst object and specify node.  
    Postcondition: updates pointers of nodes in BST to accomadate for BSTNode removal 
    return: void
    PseudoCode: 
    BSTRemove(tree, key) {
       par = null
       cur = tree⇢root
       while (cur is not null) { // Search for node
          if (cur⇢key == key) { // Node found 
             if (cur⇢left is null && cur⇢right is null) { // Remove leaf
                if (par is null) // Node is root
                   tree⇢root = null
                   cur.clear(); 
                   cur = null; 
                else if (par⇢left == cur) 
                   par⇢left = null
                   cur.clear(); 
                   cur = null; 
                else
                   par⇢right = null
                   cur.clear(); 
                   cur = null;
             }
             else if (cur⇢right is null) {                // Remove node with only left child
                if (par is null) // Node is root
                   tree⇢root = cur⇢left
                   cur.clear(); 
                   cur = null; 
                else if (par⇢left == cur) 
                   par⇢left = cur⇢left
                   cur.clear(); 
                   cur = null; 
                else
                   par⇢right = cur⇢left
                   cur.clear(); 
                   cur = null; 
             }
             else if (cur⇢left is null) {                // Remove node with only right child
                if (par is null) // Node is root
                   tree⇢root = cur⇢right
                   cur.clear(); 
                   cur = null; 
                else if (par⇢left == cur) 
                   par⇢left = cur⇢right
                   cur.clear(); 
                   cur = null; 
                else
                   par⇢right = cur⇢right
                   cur.clear(); 
                   cur = null; 
             }
             else {                                      // Remove node with two children
                // Find successor (leftmost child of right subtree)
                suc = cur⇢right
                while (suc⇢left is not null)
                   suc = suc⇢left
                successorData = Create copy of suc's data
                BSTRemove(tree, suc⇢key)     // Remove successor
                Assign cur's data with successorData
             }
             return // Node found and removed
          }
          else if (cur⇢key < key) { // Search right
             par = cur
             cur = cur⇢right
          }
          else {                     // Search left
             par = cur
             cur = cur⇢left
          }
       }
       return // Node not found
    }
    */
    public void Remove(Dollar key) 
    {
        BSTNode par = null;
        BSTNode cur = this.root; 
        while(cur != null) 
        { 
            if(cur.getData().getValue() == key.getValue()) 
            { 
                if(cur.getLeftChild() == null && cur.getRightChild() == null) 
                { 
                    if(par == null) 
                    {
                        this.root = null;
                        cur.clear(); 
                        cur = null; 
                    }
                    else if(par.getLeftChild() == cur) 
                    {
                        par.setLeftChild(null);
                        cur.clear(); 
                        cur = null; 
                    }
                    else
                    {
                        par.setRightChild(null); 
                        cur.clear(); 
                        cur = null; 
                    }
                }
                else if(cur.getRightChild() == null) 
                {                
                    if(par == null) 
                    {
                        this.root = cur.getLeftChild(); 
                        cur.clear(); 
                        cur = null; 
                    }
                    else if (par.getLeftChild() == cur) 
                    {
                        par.setLeftChild(cur.getLeftChild()); 
                        cur.clear(); 
                        cur = null; 
                    }
                    else
                    {
                        par.setRightChild(cur.getLeftChild()); 
                        cur.clear(); 
                        cur = null; 
                    }
                }
                else if(cur.getLeftChild() == null) 
                {                
                    if(par == null) 
                    {
                        this.root = cur.getRightChild();
                        cur.clear(); 
                        cur = null; 
                    }
                    else if(par.getLeftChild() == cur)
                    {
                        par.setLeftChild(cur.getRightChild());
                        cur.clear(); 
                        cur = null; 
                    }
                    else
                    {
                        par.setRightChild(cur.getRightChild()); 
                        cur.clear(); 
                        cur = null; 
                    }
                }  
                else 
                {                                     
                    BSTNode suc = cur.getRightChild();
                    while(suc.getLeftChild() != null)
                    {
                        suc = suc.getLeftChild();
                    }   
                    BSTNode successorData = suc; 
                    Remove(suc.getData());
                    cur.setData(successorData.getData()); 
                }
            }
            else if (cur.getData().getValue() < key.getValue()) 
            { 
                    par = cur;
                    cur = cur.getRightChild();
            }
            else 
            {                     
                par = cur;
                cur = cur.getLeftChild(); 
            }
        }           
    }
    /* traverse and print through BST in order
     
    Precondition: must use on BST and specify root node  
    Postcondition: none
    return: void
    PseudoCode: 
    PrintInOrder(node) 
    {
        if (node == null)
        {
            return;  
        }
        PrintInOrder(node->Left); 
        print node        
        PrintInOrder(node->Right);
    }
    */
    public void PrintInOrder(BSTNode node) 
    {
        if (node == null)
        {
            return;  
        }
        PrintInOrder(node.getLeftChild()); 
        System.out.println(node.Print());         
        PrintInOrder(node.getRightChild());
    }
    /* traverse and print through BST Post order
     
    Precondition: must use on BST and specify root node  
    Postcondition: none
    return: void
    PseudoCode: 
    PrintPostOrder(node) 
    {
        if (node == null)
        {
            return;  
        }
        PrintPostOrder(node->Left);      
        PrintPostOrder(node->Right);
        print node   
    }
    */
    void PrintPostOrder(BSTNode node) 
    { 
        if (node == null) 
        {
            return; 
        } 
        PrintPostOrder(node.getLeftChild()); 
        PrintPostOrder(node.getRightChild()); 
        System.out.println(node.Print()); 
    } 
    /* traverse and print through BST Pre order
     
    Precondition: must use on BST and specify root node  
    Postcondition: none
    return: void
    PseudoCode: 
    PrintPreOrder(node) 
    {
        if (node == null)
        {
            return;  
        }
        print node   
        PrintPreOrder(node->Left);      
        PrintPreOrder(node->Right);
    }
    */
    void PrintPreOrder(BSTNode node) 
    { 
        if (node == null) 
        {
            return; 
        } 
        System.out.println(node.Print()); 
        PrintPreOrder(node.getLeftChild()); 
        PrintPreOrder(node.getRightChild()); 
    } 
    /* traverse and print through BST with Breadth first order
     
    Precondition: must use on BST and uses printlevel method and get height method
    Postcondition: none
    return: void
    PseudoCode: 
    PrintBreadthFirst(node) 
    {
        h = tree height

        for(int i = 1; i <= h; i++)
        {
            printLevel(root, i);
        }
    }
    */
    void PrintBreadthFirst()
    {
        int h = getHeight(this.root);

        for(int i = 1; i <= h; i++)
        {
            printLevel(root, i);
        }
    }
    /* get height of BST
     
    Precondition: must use on BST and parameter is root node 
    Postcondition: none
    return: int
    PseudoCode: 
    getHeight(node) 
    {
        if (root = null)
        {
            return 0;
        }
        else
        {
            leftHeight = getHeight(root->Left);
            rightHeight = getHeight(root->RightChild);
            
            if (leftHeight > rightHeight)
            {
                return(leftHeight + 1);
            }
            else 
            {
                return(rightHeight + 1); 
            }
        }
    }
    */
    public int getHeight(BSTNode root)
    {
        if (root == null)
        {
            return 0;
        }
        else
        {
            int leftHeight = getHeight(root.getLeftChild());
            int rightHeight = getHeight(root.getRightChild());
            
            if (leftHeight > rightHeight)
            {
                return(leftHeight + 1);
            }
            else 
            {
                return(rightHeight + 1); 
            }
        }
    }
    /* Print nodes on the same level of BST
     
    Precondition: use on BST and parameters are root node and level you want to print
    Postcondition: none
    return: void
    PseudoCode: 
    printLevel(node, level) 
    if(root = null)
        {
            return;
        }
        if(level = 1)
        {
            print root->Data();
        }
        else if(level > 1)
        { 
            printLevel(root->Left, level - 1);
            printLevel(root->Right, level - 1);
        }
    */
    public void printLevel(BSTNode root, int level)
    {
        if(root == null)
        {
            return;
        }
        if(level == 1)
        {
            System.out.println(root.getData().getValue() + " ");
        }
        else if(level > 1)
        {
            System.out.println(); 
            printLevel(root.getLeftChild(), level - 1);
            printLevel(root.getRightChild(), level - 1);
        }
    }
    
    public boolean isEmpty()
    {
        if(this.root == null)
        {
            return true;
        }
        else
        {
            return false; 
        }
    }
    
    
}