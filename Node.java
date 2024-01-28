public class Node {

    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {
        Node sb = new Node("bt");
        Node b = new Node("b");
        Node c = new Node("c");

        sb.setNextNode(b);
        b.setNextNode(c);

        Node currentNode = sb;

        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode.setNextNode(currentNode.next);
            currentNode = currentNode.getNextNode();
        }

    }

}