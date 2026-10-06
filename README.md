# lab3
CMPT 225's Lab3

## Overview
You will implement two generic list classes from scratch, `SinglyLinkedList<E>` and `DoublyLinkedList<E>`. The lab is graded out of 25 points: 10 points for the `SinglyLinkedList<E>` class, 11 points for the `DoublyLinkedList<E>` class, and 4 points for code quality. 

Both classes store elements in `Node` objects and keep three fields: `head` (the first node), `tail` (the last node), and `size`. A singly linked node points only to the next node. A doubly linked node also points back to the previous one, which changes the cost of several operations.

## Objectives
* Understanding singly linked lists.
* Understanding doubly linked lists.

## Repo Structure
The repo contains three files: `SinglyLinkedList.java`, `DoublyLinkedList.java`, and `Demo.java`. You SHOULD NOT edit `Demo.java`. 

|              File       |                                        Contents                                              |
| ----------------------- | -------------------------------------------------------------------------------------------- |
| `SinglyLinkedList.java` | The `Node` class, the fields, the provided methods, and 10 method stubs for you to implement |
| `DoublyLinkedList.java` | The `Node` class, the fields, the provided methods, and 11 method stubs for you to implement |
| `Demo.java`             | A short program that uses both classes, with its expected output in comments                 |

You are supposed to implement each given stubs in `SinglyLinkedList.java` and `DoublyLinkedList.java`. 
Each stub throws `UnsupportedOperationException` exception until you replace/implement its method body.

Some methods of `SinglyLinkedList.java` and `DoublyLinkedList.java` are already implemented for you. Do NOT change them, otherwise marks will be docked. These methods are as follows:

| Provided method |                        What it does                                                           |
| --------------------- | --------------------------------------------------------------------------------------- |
| `size()`              | Returns the element count.                                                                |
| `isEmpty()`           | Returns true if the list is empty.
| `contains(E e)`       | Returns the result of `indexOf(e) != -1`, so it works once you implement `indexOf()`.        |
| `clear()`             | Empties the list.                                                                        |
| `toString()`          | Returns the elements from head to tail, formatted like `[a, b, c]` (`[]` when empty).    |
| `toReverseString()`   | Doubly linked list only. Returns the elements from tail to head, found by following `prev` links |
| `checkInvariants()`   | Throws `IllegalStateException` naming the first broken invariant, such as a wrong `size`, a `tail` that is not the last node, or a broken `prev` link |

## Lab Rules & Suggestions
| Rule | Details |
| --- | --- |
| Keep the provided code | Do not change the `Node` class, the fields, the provided methods, or any method signature. Do not add fields or a `package` statement. You may add private helper methods. |
| Use Node objects only | Store elements only in Node objects. Do not use arrays or any `java.util` collection (e.g., `ArrayList`, `LinkedList`, `ArrayDeque`, and so on). The only allowed imports are `java.util.NoSuchElementException` and `java.util.Objects`. |
| Loops, not recursion | Some checks use lists of up to 300,000 elements, and deep recursion overflows the call stack and your program will crash |
| No null elements | `addFirst`, `addLast`, and `add` throw `IllegalArgumentException` for `null`. `indexOf(null)` returns -1 and `removeFirstOccurrence(null)` returns `false`. |
| Exceptions | Bad index: `IndexOutOfBoundsException`. Removing from an empty list: `java.util.NoSuchElementException`. Null element: `IllegalArgumentException`. |
| Validate first | Check arguments before changing anything. A method call that throws an exception must leave the list exactly as it was before the method call. |
| Compare with `equals` | Compare elements with `equals()`, never with `==`. |

## Part A: SinglyLinkedList (10 points)
Implement the 10 stubs in `SinglyLinkedList.java` as stated below. 

### SinglyLinkedList Stub 1
`void addFirst(E e)` inserts `e` at the front with the time complexity of O(1). It throws `IllegalArgumentException` if `e` is null.

### SinglyLinkedList Stub 2
`void addLast(E e)` inserts `e` at the end using `tail` with the time complexity of O(1). It throws `IllegalArgumentException` if `e` is null.

### SinglyLinkedList Stub 3
`void add(int index, E e)` inserts `e` so that `e` ends up at `index` with the time complexity of O(n); later elements move back one place. And `add(size(), e)` basically appends to the list. It throws `IndexOutOfBoundsException` if `index < 0` or `index > size()` and `IllegalArgumentException` if `e` is null. 

### SinglyLinkedList Stub 4
`E get(int index)` returns the element at `index` with the time complexity of O(n). It throws `IndexOutOfBoundsException` if `index < 0` or `index >= size()`. 

### SinglyLinkedList Stub 5
`int indexOf(E e)` returns the index of the first occurrence of `e`, or -1 if there is none with the time complexity of O(n). Only one pass through the list is allowed.

### SinglyLinkedList Stub 6
`E removeFirst()` | Removes the first element of the list and returns its value (returns the node value not the index) with the time complexity of O(1). It throws `NoSuchElementException` if the list is empty.

### SinglyLinkedList Stub 7
`E removeLast()` removes the last element of the list and returns its value (returns the value not the index) with the time complexity of O(n). It throws `NoSuchElementException` if the list is empty. 

### SinglyLinkedList Stub 8
`E remove(int index)` removes and returns the element at `index` with the time complexity of O(n); later elements move forward one place. It returns `IndexOutOfBoundsException` if `index < 0` or `index >= size()`.

### SinglyLinkedList Stub 9
`boolean removeFirstOccurrence(E e)` removes the first occurrence of `e`, and it returns true if `e` is successfully removed. The time complexity of it is O(n). Only one pass through the list is allowed.

### SinglyLinkedList Stub 10
`void reverse()` reverses the list in place by re-linking the existing nodes with the time complexity of O(n) time and space complexity of O(1) extra space. You only need a few temporary references, regardless of the number of nodes. 

**Note 1**: "One pass" means a single walk down the list. Calling `get(i)` inside a loop makes a method O(n<sup>2</sup>), and the timed checks will fail it.

**Note 2**: `reverse()` should NOT create nodes, change any node's element, or use an array, a collection, or recursion. The marker will check that the reversed list is made of the original node objects in the opposite order. That is, the identify of the elements will be checked. 

**Note 3**: Every method must keep all invariants true in the edge cases too: an empty list, a one-element list, and changes at the first or last node. Forgetting to update `tail` is the most common bug in this part.

| SinglyLinkedList Stubs                          |   Pass?      |
| ----------------------------------------------  | ------------ |
| Stub1:  `void addFirst(E e)`                    |              |
| Stub2:  `void addLast(E e)`                     |              |
| Stub3:  `void add(int index, E e)`              |              |                  
| Stub4:  `E get(int index)`                      |              |
| Stub5:  `int indexOf(E e)`                      |              |
| Stub6:  `E removeFirst()`                       |              |
| Stub7:  `E removeLast()`                        |              |
| Stub8:  `E remove(int index)`                   |              |
| Stub9:  `boolean removeFirstOccurrence(E e)`    |              |
| Stub10: `void reverse()`                        |              |



## Part B: DoublyLinkedList (11 points)
Implement the 11 stubs in `DoublyLinkedList.java`. Methods shared with `SinglyLinkedList.java` keep the same behavior and exceptions; what changes is the time bounds, the `prev` links, and one new method.

### DoublyLinkedList Stub 1
`addFirst` with the time complexity of O(1). Also set the `prev` links of the new node and its neighbour.

### DoublyLinkedList Stub 2
`addLast` with the time complexity of O(1). Also set the `prev` links of the new node and its neighbour.

### DoublyLinkedList Stub 3
`add(int index, E e)` with the time complexity of O(min(index, n - index)). Walk from whichever end is closer to `index`.

### DoublyLinkedList Stub 4
`get(int index)` with the time complexity of O(min(index, n - index)). Walk from whichever end is closer to `index`.

### DoublyLinkedList Stub 5
`indexOf(E e)` with the time complexity of O(n). Only one one pass is allowed.

### DoublyLinkedList Stub 6
`removeFirst()` with the time complexity of O(1). The new first node's `prev` must become null.

### DoublyLinkedList Stub 7
`removeLast()` with the time complexity of O(1). No traversal: the node before the tail is `tail.prev`, and it becomes the new tail. 

### DoublyLinkedList Stub 8
`remove(int index)` with the time complexity of O(min(index, n - index)). Walk from whichever end is closer to `index`.

### DoublyLinkedList Stub 9
`removeFirstOccurrence(E e)` with the time complexity of O(n). Only one pass is allowed.

### DoublyLinkedList Stub 10
`reverse()` with the time complexity of O(n) and the space complexity of O(1). Re-link the existing nodes in place. 

### DoublyLinkedList Stub 11
`boolean isPalindrome()` returns `true` when the list reads the same forward and backward, such as `[r, a, c, e, c, a, r]` or `[1, 2, 2, 1]`. Empty and one-element lists are palindromes. Move one reference forward from `head` and one backward from `tail`, comparing elements with `equals()`, without modifying or copying the list. The time complexity if O(n) time, and the space complexity is O(1).

| DoublyLinkedList Stubs                          |   Pass?      |
| ----------------------------------------------  | ------------ |
| Stub1:  `void addFirst(E e)`                    |              |
| Stub2:  `void addLast(E e)`                     |              |
| Stub3:  `void add(int index, E e)`              |              |                  
| Stub4:  `E get(int index)`                      |              |
| Stub5:  `int indexOf(E e)`                      |              |
| Stub6:  `E removeFirst()`                       |              |
| Stub7:  `E removeLast()`                        |              |
| Stub8:  `E remove(int index)`                   |              |
| Stub9:  `boolean removeFirstOccurrence(E e)`    |              |
| Stub10: `void reverse()`                        |              |
| Stub11: `boolean isPalindrome()`                |              |

## Part C: Code quality (4 points)
The marker will your code and awards up to 10 points on three criteria.
| Criterion | Points | What earns full marks |
| --- | --- | --- |
| Readability | 1 | Clear names, consistent formatting, and short comments on where nodelinks change in a non-obvious way |
| Structure | 1 | Shared private helpers, such as one method that finds the node at an index, instead of repeated traversal code |
| Robustness | 2 | Arguments checked before the list changes, exceptions with informative messages, and no leftover debug printing |

## Program Output
When you have implemented all the stubs of `SinglyLinkedList.java` and `DoublyLinkedList.java`, run `Demo.java`, and your output should look like the following: 
```
[a, b, c, d]
b
d
[c, b, a]
true
2
[1, 2, 3, 1]
[1, 3, 2, 1]
false
```

The expected output is based on the following:
```java
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
```

## Rubric
Before submitting, check that both classes compile with the unmodified `Demo.java` and that its output matches the expected output. 

| Component | Points | 
| --- | --- |
| Part A: SinglyLinkedList | 10 |
| Part B: DoublyLinkedList | 11 |
| Part c: Code quality | 4 | 
| Total | 25 |  


## Submission
Zip the project directory along with your answers in a PDF document, and submit the ZIP file to Canvas.
**Please do not remove any of the build artifacts or the manifest files. Zip the project directory as is.**
**Your program must compile and run successfully. If your program does not compile or crashes during execution, it will receive a grade of zero.**

## Deadline
Sunday, October 11, 2026, at 11:59 PM PDT