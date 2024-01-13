package com.core.bst;

import java.util.Stack;

public class Node {
    int data;
    Node left,right;

    public Node(int item){
        this.data=item;
        left =right =null;
    }
}

class BTree{

    Node root;

    void inOrder(){
        if(root==null){
            return;
        }
        Stack<Node> stack= new Stack<>();
        Node curr=root;

        while (curr!=null && stack.size()>0){

            while (curr!=null) {

                stack.push(curr);
                curr = curr.left;
            }
            curr=stack.pop();
            System.out.println(curr.data+" ");

            curr=curr.right;
        }

    }

    public static void main(String[] args) {
        BTree b= new BTree();
        b.root=new Node(1);
        b.root.left= new Node(2);
        b.root.right = new Node(3);
        b.root.left.left = new Node(4);
        b.root.left.right = new Node(5);
        b.inOrder();

    }

}
