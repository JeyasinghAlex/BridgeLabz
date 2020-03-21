public class Main {

    private static LinkedList list = new LinkedList();
    public static void main(String[] args) {

        list.insert(10);
        list.insert(20);
        list.insert(-1);
        list.insert(-2);
        list.insert(-3);
        /** Print LinkedList Data */
        list.displayData();
        /** Print Reverse LinkedList Data */
        list.reverseLinkedList();
        System.out.println();
        list.displayData();
        /** Print Reverse LinkedList Data Using Recursive */
        list.reverseLinkedListUsingRecursive(list.getHeadNode());
        System.out.println();
        list.displayData();
        list.reverseLinkedListUsingStack();
        System.out.println();
        list.displayData();
    }
}