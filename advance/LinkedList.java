public class LinkedList {

    private Node headNode = null;
    private int listSize = 0;

    public void insert(int data) {
        Node node = new Node(data);
        if(headNode == null) {
            headNode = node;
        } else {
            node.next = headNode;
            headNode = node;
        }
        ++listSize;
    }

    public int remove() {
        if(headNode == null) {
            return -1;
        }
        int data = headNode.data;
        headNode = headNode.next;
        --listSize;
        return data;
    }

    public void displayData() {
        Node tempNode = headNode;
        while(tempNode !=  null) {
            System.out.print(tempNode.data + " ");
            tempNode = tempNode.next;
        }
    }

    public void reverseLinkedList(){
        //Only value change :- Address not change :-
        int start = 0, end = listSize, cnt = 0;
        Node firstNode = headNode;
        Node lastNode = headNode;
        while (start < end) {
            cnt = 0;
            while (cnt < end-1) {
                lastNode = lastNode.next;
                ++cnt;
            }
            int temp = firstNode.data;
            firstNode.data = lastNode.data;
            lastNode.data = temp;
            firstNode = firstNode.next;
            lastNode = headNode;
            ++start;
            --end;
        }
    }

    public Node getHeadNode() {
        return headNode;
    }

    //Node head = null;
    public void reverseLinkedListUsingRecursive(Node startNode) {
        if(startNode.next == null){
            headNode = startNode;
            return;
        }
        reverseLinkedListUsingRecursive(startNode.next);
        Node endNode = startNode.next;
        endNode.next = startNode;
        startNode.next = null;
    }

    public int peek() {
        if (headNode != null) {
            return headNode.data;
        }
        return -1;
    }

    public boolean isEmpty() {
        return headNode != null;
    }

    public void reverseLinkedListUsingStack() {
        if (headNode == null) {
            return;
        }

        Stack stack = new Stack();
        Node temp = headNode;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

         temp = headNode;
        while (stack.isEmpty()) {
            temp.data = stack.top();
            stack.pop();
            temp = temp.next;
        }
    }
}
