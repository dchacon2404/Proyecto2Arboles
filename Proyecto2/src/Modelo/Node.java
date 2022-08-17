/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author dchac
 */
public class Node {
    ClaseVirtual data;
    int height;

  
    Node left, right;

    Node(ClaseVirtual data){
        this.data = data;
        height = 1;
    }
}
