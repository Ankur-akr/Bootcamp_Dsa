package Day2Tree;

public class BST {
    Node root;
    BST() {this.root = null;}

    public void insert(int data){
        root = insertData(root, data);
    }
    public void delete(int data) {root = deleteNode(root, data);}
    public Node insertData(Node node, int data){
        if(node == null){
            node = new Node(data);
        } else if (data< node.data) {
            node.left = insertData(node.left ,data);
        } else if (data> node.data) {
            node.right = insertData(node.right ,data);
        }
        return node;
    }
    public void inorderTraversal (Node node){
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(node.data + " -->");
            inorderTraversal(node.right);
        }
    }
    public Node searchBST(Node root, int val) {
        if(root == null) return null;
        else if(root.data > val){
            root = searchBST(root.left, val);
        }else if(root.data < val){
            root = searchBST(root.right, val);
        }
        return root;
    }
    public Node deleteNode(Node root, int key) {

        if (root == null)
            return root;

        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        }
        else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        }
        else {
            // Node found

            // Case 1: No right child
            if (root.right == null)
                return root.left;

                // Case 2: No left child
            else if (root.left == null)
                return root.right;

                // Case 3: Two children
            else {
                root.data = findSuccessor(root.right);
                root.right = deleteNode(root.right, root.data);
            }
        }

        return root;
    }
//    public int findSuccessor(Node root) {
//        while (root.left != null) {
//            root = root.left;
//        }
//        return root.data;
//    }
public int findSuccessor(Node root){
    int successor = -1;
    Node temp = root;
    while (temp != null){
        successor = temp.data;
        temp = temp.left;
    }
    return successor;
}

    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(20);
        bst.insert(49);
        bst.insert(18);
        bst.insert(5);
        bst.insert(10);
        bst.insert(17);
        bst.insert(27);
        bst.insert(32);
        bst.insert(46);
        bst.insert(25);
        bst.inorderTraversal(bst.root);
        System.out.println(" ");
        bst.delete(32);
        bst.inorderTraversal(bst.root);
    }
}
