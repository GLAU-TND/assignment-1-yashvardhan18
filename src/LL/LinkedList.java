package LL;

import Node.Node;

public class LinkedList<n extends Comparable<n>> {
    private Node<n> head;
    private Node<n> start;

    public Node<n> getHead() {
        return head;
    }

    public void setHead(Node<n> node) {
        this.head = node;
        this.start=head;
    }

    public Node<n> getStart() {
        return start;
    }

    public void setStart(Node<n> start) {
        this.start = start;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void insertion(Node<n> node){
        if(getHead()==null){
            setHead(node);
        }
        else
            {
            Node<n> temp = head;
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
    public Node<n> deletion(){
        if(isEmpty()){
            System.out.println("Underflow");
            return null;
        }
        Node<n> temp = getHead();
        setHead(getHead().getNext());
        return temp;
    }
    public Node<n>deletion_at_required_position(int i){
        Node deletedNode;
        Node temp=getHead();
        if(isEmpty()){
            System.out.println("Underflow");
            return temp;
        }
        if(i==1){
            deletedNode=getHead();
            setHead(null);
        }
        else{
            for(int k=1;k<i-1;k++){
                temp = temp.getNext();
            }
            deletedNode=temp.getNext();
            temp.setNext(temp.getNext().getNext());
        }
        return deletedNode;
    }
    public Node fetch(){
        Node temp;
        if(getStart()==null&&getHead()==null){
            System.out.println("List is empty");
            return null;
        }
        temp=getStart();
        setStart(getStart().getNext());
        return temp;
    }
    public void sort(){
        Node<n> s1=getHead();
        Node<n> s2=getHead().getNext();

        while(s1!=null){
            while(s2!=null){
                if(s1.getData().compareTo(s2.getData())>0){
                    n temp=s1.getData();
                    s1.setData(s2.getData());
                    s2.setData(temp);
                }
                s2=s2.getNext();
            }
            s1=s1.getNext();
        }
    }
}

