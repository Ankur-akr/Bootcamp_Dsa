package Day2Tree;

class Node{
    int data;
    Node left;// in cpp Node* left;
    Node right;
    Node( int value) {
        data = value;
        left = null;
        right = null;
    }

}
public class Tree {
    Node root;// store the address of first node of tree
    Tree(){
        root = null;
    }
    public void inorderTraversal (Node node){
        if(node != null){
            inorderTraversal(node.left);
            System.out.print(node.data + " -->");
            inorderTraversal(node.right);
        }
    }
    public void preOrder(Node node){
        if(node != null){
            System.out.print(node.data + " -->");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public void postOrder(Node node){
        if(node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " -->");
        }
    }
    public static void main(String[] args) {

        Tree tree1 = new Tree();
        System.out.println(tree1.root);
        tree1.root=new Node(10);  // because of using new keyword so the node have physical address also
        System.out.println(tree1.root);
        tree1.root.left=new Node(20);
        System.out.println(tree1.root.left.data);
        tree1.root.right=new Node(30);
        tree1.root.left.left=new Node(40);
        tree1.root.left.right=new Node(50);
        tree1.root.right.left = new Node(60);
        tree1.root.right.right = new Node(70);
        tree1.inorderTraversal(tree1.root);
        System.out.println(" ");
        System.out.println("preorder");
        tree1.preOrder(tree1.root);
        System.out.println(" postorder");
        tree1.postOrder(tree1.root);
    }
}
//null is not applied to primitive datatype
//lc 94,144,145,104