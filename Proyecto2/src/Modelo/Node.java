package Modelo;


public class Node {
    ClaseVirtual data;
    //Este data2 se usa en otro en el método insert2
    int data2;
    int height;

  
    Node left, right;

    Node(ClaseVirtual data){
        this.data = data;
        height = 1;
    }
    
    //Este constructor se usa en el método insert2:
    Node (int data2) {
        this.data2 = data2;
        height = 1;
    }
}
