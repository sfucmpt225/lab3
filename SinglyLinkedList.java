import java.util.NoSuchElementException;

/**
 * A generic singly linked list that keeps references to its first node (head)
 * and its last node (tail).
 *
 * <p>Class invariants, verified by {@link #checkInvariants()}:
 * <ul>
 *   <li>{@code size} equals the number of nodes reachable from {@code head}.</li>
 *   <li>If the list is empty, {@code head == null} and {@code tail == null}.</li>
 *   <li>If the list is non-empty, {@code tail} is the last node and {@code tail.next == null}.</li>
 *   <li>No node stores a {@code null} element.</li>
 * </ul>
 *
 * @param <E> the type of the elements in the list
 */
public class SinglyLinkedList<E> {

    // =====================================================================
    // PROVIDED CODE - DO NOT MODIFY. The grader depends on it.
    // =====================================================================

    /** A node in a singly linked list. */
    private static class Node<E> {
        E element;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node<E> head;   // first node, or null if the list is empty
    private Node<E> tail;   // last node, or null if the list is empty
    private int size;       // number of elements in the list

    /** Creates an empty list. */
    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /** Returns the number of elements in the list. */
    public int size() {
        return size;
    }

    /** Returns true if the list contains no elements. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Returns true if the list contains an element equal to e. Relies on your indexOf. */
    public boolean contains(E e) {
        return indexOf(e) != -1;
    }

    /** Removes every element from the list. */
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    /** Returns the elements from head to tail, formatted like "[a, b, c]" ("[]" if empty). */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> cur = head;
        int count = 0;
        while (cur != null && count <= size) {   // bounded, so a corrupted list cannot loop forever
            if (count > 0) {
                sb.append(", ");
            }
            sb.append(cur.element);
            cur = cur.next;
            count++;
        }
        if (cur != null) {
            sb.append(", ...");                   // more nodes than size says: the list is corrupted
        }
        return sb.append("]").toString();
    }

    /**
     * Verifies the class invariants and throws an IllegalStateException that describes the
     * first violation found. The grader calls this after operations; call it in your own tests too.
     */
    void checkInvariants() {
        if (size < 0) {
            throw new IllegalStateException("size is negative: " + size);
        }
        if (size == 0) {
            if (head != null || tail != null) {
                throw new IllegalStateException("size is 0 but head or tail is not null");
            }
            return;
        }
        if (head == null || tail == null) {
            throw new IllegalStateException("size is " + size + " but head or tail is null");
        }
        Node<E> cur = head;
        for (int i = 0; i < size; i++) {
            if (cur == null) {
                throw new IllegalStateException("size is " + size + " but only " + i
                        + " node(s) are reachable from head");
            }
            if (cur.element == null) {
                throw new IllegalStateException("null element stored at index " + i);
            }
            if (i == size - 1 && cur != tail) {
                throw new IllegalStateException("tail does not refer to the last node");
            }
            cur = cur.next;
        }
        if (cur != null) {
            throw new IllegalStateException("more than " + size + " node(s) are reachable from head"
                    + " (tail.next is not null, or the list has a cycle)");
        }
    }

    // =====================================================================
    // YOUR CODE - implement the methods below. You may add private helper
    // methods, but do not add fields or change any method signature.
    // =====================================================================

    /**
     * Inserts e at the front of the list. Must run in O(1) time.
     *
     * @throws IllegalArgumentException if e is null
     */
    public void addFirst(E e) {
        throw new UnsupportedOperationException("TODO: addFirst");
    }

    /**
     * Inserts e at the end of the list. Must run in O(1) time (use tail).
     *
     * @throws IllegalArgumentException if e is null
     */
    public void addLast(E e) {
        throw new UnsupportedOperationException("TODO: addLast");
    }

    /**
     * Inserts e so that it ends up at position index. Elements previously at index and
     * beyond move back one position. add(size(), e) appends.
     *
     * @throws IndexOutOfBoundsException if index < 0 or index > size()
     * @throws IllegalArgumentException  if e is null
     */
    public void add(int index, E e) {
        throw new UnsupportedOperationException("TODO: add");
    }

    /**
     * Returns the element at position index.
     *
     * @throws IndexOutOfBoundsException if index < 0 or index >= size()
     */
    public E get(int index) {
        throw new UnsupportedOperationException("TODO: get");
    }

    /**
     * Returns the index of the first element equal to e (compared with equals), or -1 if
     * there is none. Returns -1 if e is null. Must make a single pass over the list.
     */
    public int indexOf(E e) {
        throw new UnsupportedOperationException("TODO: indexOf");
    }

    /**
     * Removes and returns the first element. Must run in O(1) time.
     *
     * @throws NoSuchElementException if the list is empty
     */
    public E removeFirst() {
        throw new UnsupportedOperationException("TODO: removeFirst");
    }

    /**
     * Removes and returns the last element.
     *
     * @throws NoSuchElementException if the list is empty
     */
    public E removeLast() {
        throw new UnsupportedOperationException("TODO: removeLast");
    }

    /**
     * Removes and returns the element at position index. Later elements move forward
     * one position.
     *
     * @throws IndexOutOfBoundsException if index < 0 or index >= size()
     */
    public E remove(int index) {
        throw new UnsupportedOperationException("TODO: remove");
    }

    /**
     * Removes the first element equal to e (compared with equals), if there is one.
     * Must make a single pass over the list.
     *
     * @return true if an element was removed; false otherwise, including when e is null
     */
    public boolean removeFirstOccurrence(E e) {
        throw new UnsupportedOperationException("TODO: removeFirstOccurrence");
    }

    /**
     * Reverses the order of the elements in place by re-linking the existing nodes.
     * Must run in O(n) time with O(1) extra space: no new nodes, no arrays or collections,
     * no recursion, and no changes to any node's element.
     */
    public void reverse() {
        throw new UnsupportedOperationException("TODO: reverse");
    }
}
