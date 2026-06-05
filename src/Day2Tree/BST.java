package Day2Tree;

public class BST {
    Node root;
    BST() {this.root = null;}

    public void insert(int data){
        root = insertData(root, data);
    }
    public Node insertData(Node root, int data){
        if(root == null){
            root = new Node(data);
        } else if (data< root.data) {
            root.left = insertData(root.left ,data);
        } else if (data> root.data) {
            root.right = insertData(root.right ,data);
        }
        return root;
    }
    public void inorderTraversal (Node node){
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(node.data + " -->");
            inorderTraversal(node.right);
        }
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
    }
}
