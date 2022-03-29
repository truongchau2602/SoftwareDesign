package BinarySearch;

public class BST {
    static class Node{
        private int data;
        Node(int data){
            this.data=data;
        }
        public int getData(){
            return data;
        }
    }
    Node root=null;
    BST leftTree=null;
    BST rightTree=null;
    public void insert(Node x){
        if(root==null){
            root=x;
            return;
        }
        if(root.data>x.data){
            if(leftTree==null) {
                leftTree = new BST();
            }
            leftTree.insert(x);
        }
        if(root.data<x.data ){
            if(rightTree==null) {
                rightTree = new BST();
            }
            rightTree.insert(x);
        }
        return;
    }
    public void printTree(){
        if(this.leftTree!=null){
            this.leftTree.printTree();
        }
        if(this.rightTree!=null){
            this.rightTree.printTree();
        }
        System.out.println(this.root.getData());
        return;
    }
    public static void main(String[]args){
        BST tree = new BST();

        tree.insert(new Node(4));
        tree.insert(new Node(5));
        tree.insert(new Node(6));
        tree.insert(new Node(7));
        tree.insert(new Node(2));
        tree.insert(new Node(3));
        tree.insert(new Node(1));
        //tree.insert(new Node(0));

         tree.printTree();
    }
}
