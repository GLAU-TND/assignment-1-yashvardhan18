package Node;

public class Node<n> {
    private n details;
    private Node<n> next;

    public n getData() {
        return details;
    }

    public void setData(n data) {
        this.details = data;
    }

    public Node<n> getNext() {
        return next;
    }

    public void setNext(Node<n> next) {
        this.next = next;
    }

    @Override
    public String toString(){
        return "Node.Node{"+
                "data="+ details+"}";
    }
}
