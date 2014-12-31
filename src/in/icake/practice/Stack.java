
package in.icake.practice;

class Stack<T> {
    Node<T> top;

    public Stack()
    {
        top = null;
    }

    public void push(T data)
    {
        top = new Node<T>(data, top);
    }

    public T pop()
    {
        if (top == null)
            throw new NullPointerException();
        T result = top.data;
        top = top.last;
        return result;

    }

    public T peek()
    {
        if (top == null)
            throw new NullPointerException();
        return top.data;

    }

    private class Node<T> {
        T data;
        Node<T> last;

        Node(T data, Node<T> next)
        {
            this.data = data;
            this.last = next;
        }
    }

    public static void main(String[] string)
    {
        Stack<String> stack = new Stack<String>();
        stack.push("Year");
        stack.push("New");
        stack.push("Happy");
        for (int i = 0; i < 3; i++)
            System.out.println(stack.pop());
    }

    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return top == null;
    }
}
