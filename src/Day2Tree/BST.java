package Day2Tree;

public class BST {
    Node root;
    BST() {this.root = null;}

    public void insert(int data){
        root = insertData(root, data);
    }

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
        bst.searchBST(bst.root,5);
    }
}
