package com.employee;

// ************************************ TODO F1 ************************************
/*
 * Implement a Singly linkedList
 *
 */
// ************************************ SOLUTION F1 BEGIN ************************************


public class SingleLinkedList {


    Node head = null;
    Node tail = null;


    public void addNode(PermanentEmployee employeeAdd) {
        // Allocate the node and set next as Null
        Node newNode = new Node(employeeAdd);

        //Make New node as head on empty linked list
        if(head == null) {
            head = newNode;
            tail = newNode;
        }else {
            tail.next =newNode;
            tail = newNode;

        }


    }



}

class Node{
    public PermanentEmployee employee;
    Node next;

    Node(PermanentEmployee employee){
        this.employee=employee;
        this.next = null;
    }

}
// ************************************ SOLUTION F1 END ************************************