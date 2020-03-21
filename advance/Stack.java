public class Stack implements StackInterface {
    private static LinkedList list = new LinkedList();

    @Override
    public void push(int data) {
        list.insert(data);
    }

    @Override
    public void pop() {
        list.remove();
    }

    @Override
    public int top() {
        return list.peek();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
