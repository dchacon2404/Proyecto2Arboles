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
    
    public Node insert(Node node, ClaseVirtual data){
        //1. Insercion normal en un arbol de busqueda binaria
        if (node == null){
            return (new Node(data));
        }

        if (data.getCodigoCurso() < node.data.getCodigoCurso()){
            node.left = insert(node.left, data);
        } else if (data.getCodigoCurso() > node.data.getCodigoCurso()){
            node.right = insert(node.right, data);
        } else { //Duplicados no son permitidos
            return node;
        }

        //2. Actualizar la altura del nodo
        node.height = 1 + max(height(node.left), height(node.right));

        //3. Obtener el factor de balance del nodo para posteriormente determinar si esta balanceado o no
        int balanceFactor = getBalance(node);

        // Rotacion derecha
        if (balanceFactor > 1 && data.getCodigoCurso() < node.left.data.getCodigoCurso()){
            return rightRotation(node);
        }

        // Rotacion izquierda
        if (balanceFactor < -1 && data.getCodigoCurso() > node.right.data.getCodigoCurso()){
            return leftRotation(node);
        }

        // Rotacion izquierda derecha
        if (balanceFactor > 1 && data.getCodigoCurso() > node.left.data.getCodigoCurso()){
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }

        // Rotacion derecha izquierda
        if (balanceFactor < -1 && data.getCodigoCurso() < node.right.data.getCodigoCurso()){
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
}
