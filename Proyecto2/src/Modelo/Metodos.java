package Modelo;


public class Metodos {
    
    Node root;
    
    public int height(Node node){
        if (node == null){
            return 0;
        }
        return node.height;
    }

    public int max(int num1, int num2){
        return (num1 > num2) ? num1 : num2;
    }

    public Node rightRotation(Node root){
        Node newRoot = root.left;
        Node nodeTemp2 = newRoot.right;

        newRoot.right = root;
        root.left = nodeTemp2;

        root.height = max(height(root.left), height(root.right)) + 1;
        newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1;

        return newRoot;
    }

    public Node leftRotation(Node root){
        Node newRoot = root.right;
        Node nodeTemp2 = newRoot.left;

        newRoot.left = root;
        root.right = nodeTemp2;

        root.height = max(height(root.left), height(root.right)) + 1;
        newRoot.height = max(height(newRoot.left), height(newRoot.right)) + 1;

        return newRoot;
    }

    public int getBalance(Node node){
        if (node == null){
            return 0;
        }
        return height(node.left) - height(node.right);
    }
    
    
    /*public Node insert(Node node, ClaseVirtual data){
        if(node == null) return (new Node(data));
        if (data < node.data){
            node.left = insert(node.left, data);
        } else if (data > node.data){
            node.right = insert(node.right, data);
        } else { 
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));

        int balanceFactor = getBalance(node);

        if (balanceFactor > 1 && data < node.left.data){
            return rightRotation(node);
        }

        if (balanceFactor < -1 && data > node.right.data){
            return leftRotation(node);
        }

        if (balanceFactor > 1 && data > node.left.data){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }

        if (balanceFactor < -1 && data < node.right.data){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }

        return node;
    }*/
}
