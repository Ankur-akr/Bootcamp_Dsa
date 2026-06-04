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

    public static void main(String[] args) {

        Tree tree1 = new Tree();
        System.out.println(tree1.root);
        tree1.root=new Node(10);  // because of using new keyword so the node have physical address also
        System.out.println(tree1.root);
        tree1.root.left=new Node(20);
        tree1.root.right=new Node(30);
        tree1.root.left.left=new Node(40);
        tree1.root.left.right=new Node(50);
    }
}
//null is not applied to primitive datatype
