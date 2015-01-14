
package in.icake.practice;

public class BinarySearchTreeGeneric<T extends Comparable<T>> {
    Node<T> root;

    public void addAll(T[] array) {
        for (T a : array)
            add(a);
    }

    public void add(T element) {
        if (null == root) {
            root = new Node<T>(null, element, null);
        } else {
            add(root, element);
        }
    }

    private void add(Node<T> node, T element) {
        // TODO Auto-generated method stub
        if (element.compareTo(node.item) < 0) {
            if (node.left == null)
                node.left = new Node<T>(null, element, null);
            else
                add(node.left, element);
        } else if (element.compareTo(node.item) > 0) {
            if (node.right == null)
                node.right = new Node<T>(null, element, null);
            else
                add(node.right, element);
        }
    }

    public class Node<T> {
        Node<T> left, right;

        public Node<T> getLeft() {
            return left;
        }

        public void setLeft(Node<T> left) {
            this.left = left;
        }

        public Node<T> getRight() {
            return right;
        }

        public void setRight(Node<T> right) {
            this.right = right;
        }

        public T getItem() {
            return item;
        }

        public void setItem(T item) {
            this.item = item;
        }

        T item;

        Node(Node<T> left, T item, Node<T> right) {
            this.left = left;
            this.item = item;
            this.right = right;
        }

    }

    @Override
    public String toString() {
        return toString(root);
    }

    private String toString(Node<T> node) {
        if (node == null) {
            return null;
        }
        return "[" + toString(node.left) + "," + node.item.toString() + "," + toString(node.right)
                + "]";
    }

    public Node<T> getSecondLarge() {
        // TODO Auto-generated method stub
        Node<T> result = null;
        Node temp = null;
        if (root == null)
            return null;
        else
        {
            temp = root;
            while (temp.right != null)
            {
                result = temp;
                temp = temp.right;
            }
        }
        return temp.left != null ? temp.left : result;
    }
}
