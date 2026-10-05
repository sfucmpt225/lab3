/**
 * A short demonstration of both list classes. Once your methods work, run
 *
 *     javac *.java
 *     java Demo
 *
 * and compare the output with the comments.
 */
public class Demo {
    public static void main(String[] args) {
        SinglyLinkedList<String> s = new SinglyLinkedList<>();
        s.addLast("b");
        s.addFirst("a");
        s.addLast("d");
        s.add(2, "c");
        System.out.println(s);                    // [a, b, c, d]
        System.out.println(s.get(1));             // b
        System.out.println(s.removeLast());       // d
        s.reverse();
        System.out.println(s);                    // [c, b, a]
        s.checkInvariants();                      // throws IllegalStateException if the links are broken

        DoublyLinkedList<Integer> d = new DoublyLinkedList<>();
        d.addLast(1);
        d.addLast(2);
        d.addLast(3);
        d.addLast(2);
        d.addLast(1);
        System.out.println(d.isPalindrome());     // true
        System.out.println(d.remove(3));          // 2
        System.out.println(d);                    // [1, 2, 3, 1]
        System.out.println(d.toReverseString());  // [1, 3, 2, 1]
        System.out.println(d.isPalindrome());     // false
        d.checkInvariants();
    }
}
