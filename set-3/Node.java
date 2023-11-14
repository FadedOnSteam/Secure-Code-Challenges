public class Node {
    String data;
    Node next;

    public Node(String data, Node next){
        this.data = data;
        this.next = null;
    }
    public Node(String data){
        this(data, null);
    }
}
