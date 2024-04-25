package Apr24;

public class BinarySearchTree {
    public static Node root;
    public BinarySearchTree(){
        this.root = null;

    }
    //Insert a node
    public void insert(int id){
        //Traversing
        Node newNode = new Node(id);
        if(root == null){
            root = newNode;
            return;
        }
        Node current = root;
        Node parent = null;
        while(true){
            parent = current;
            if(id<current.data){
                current = current.left;
                if(current == null){
                    parent.left = newNode;
                    return;
                }
            } else{current = current.right;
                if(current == null){
                    parent.right = newNode;
                }
        }
    }
}
    //display our tree
public void display(Node root){
    if(root != null){
        //If root isn't null, there are values to be traversed
        //We will traverse in order
        display(root.left);
        System.out.println(" " + root.data);
        display(root.right);
    }


    }
}

    class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data = data;
        right = null;
        left = null;
    }
}
