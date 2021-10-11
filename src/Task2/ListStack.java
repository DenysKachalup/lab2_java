package Task2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListStack<E> implements Iterable<E> {
    private Node<E> head;

    public ListStack(Node<E> head) {
        this.head = head;
    }

    public ListStack() {
    }

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    public void add(E value) {
        Node<E> temp = new Node<>();
        temp.setValue(value);
        temp.setNext(head);
        head = temp;
    }


    public void delete() {
        if (head == null)
            throw new NoSuchElementException();
        Node<E> temp = head.getNext();
        head = temp;
    }

    public void clean() {
        if (head == null)
            throw new NoSuchElementException();
        while (head != null) {
            Node<E> temp = head.getNext();
            head = temp;

        }
    }

    public void print() {
        Node<E> headPointer = head;

        while (headPointer != null) {
            System.out.print(headPointer.getValue() + "  ");
            headPointer = headPointer.getNext();
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new ListStackIterator();
    }

    private class ListStackIterator implements Iterator<E> {
        Node<E> next = head;

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public E next() {
            E value = next.getValue();
            next = next.getNext();
            return value;
        }
    }
}
