public class BinarySearchTree {
    /* Class containing left
   and right child of current node
 * and key value*/
    class Node {

        Employee employee;
        Node left, right;

        public Node(Employee employee)
        {
            this.employee= employee;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() { root = null; }

    BinarySearchTree(Employee employee) { root = new Node(employee); }

    // This method mainly calls insertRec()
    void insert(Employee employee) { root = insertRec(root, employee); }

    /* A recursive function to
       insert a new key in BST */
    Node insertRec(Node root, Employee employee)
    {

        /* If the tree is empty,
           return a new node */
        if (root == null) {
            root = new Node(employee);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (employee.getPriority() < root.employee.getPriority())
            root.left = insertRec(root.left, employee);
        else if (employee.getPriority() > root.employee.getPriority())
            root.right = insertRec(root.right, employee);

        /* return the (unchanged) node pointer */
        return root;
    }

    // This method mainly calls InorderRec()
    void inorder() { inorderRec(root); }

    // A utility function to
    // do inorder traversal of BST
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.employee);
            inorderRec(root.right);
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();


        tree.insert(new Employee("president",1));
        tree.insert(new Employee("dean",2));
        tree.insert(new Employee("lecture",3));
        tree.insert(new Employee("assistant",4));


        // print inorder traversal of the BST
        tree.inorder();
    }
}
