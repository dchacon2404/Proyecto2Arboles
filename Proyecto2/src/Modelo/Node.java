package Modelo;


public class Node {
    ClaseVirtual data;
    int height;

  
    Node left, right;

    Node(ClaseVirtual data){
        this.data = data;
        height = 1;
    }
}
