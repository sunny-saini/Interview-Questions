package com.core.dsalgo;

public class LinkedListCreation {
    class Node{
        int data;
        Node nexNode;

        Node(int data){
            this.data=data;
            this.nexNode=null;
        }
    }

    Node tail=null;
    Node head=null;

    void addNode(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.nexNode=newNode;
            tail=newNode;
        }

    }

    void printNode(){
        Node current=head;
        if(current==null){
            System.out.println("LinkedListEMpty");
            return;
        }
        while (current!=null){

            System.out.println(" "+current.data);
            current=current.nexNode;
        }
        System.out.println();
    }




    int  countNode(){
        int count=0;

        Node countNode=head;
        while (countNode!=null){
            count++;
           countNode= countNode.nexNode;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedListCreation ld= new LinkedListCreation();
        ld.addNode(2);
        ld.addNode(7);
        ld.addNode(10);
        ld.addNode(12);
        ld.printNode();


        System.out.println("Tree Nodes: "+ld.countNode());
    }

}
