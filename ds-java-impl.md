## Data Structure Impl. on Java

1. Linked List
- Instantiation:
    - `LinkedList<String> ll = new LinkedList<>();`
- Usages:
    - Constant time first element insertions/deletions, and last element insertions
    - Unknown number of elemts
    - Insertion in the middle
- Syntaxes:
    - Insertion:
        - `ll.add("Apple");`	    // O(1)
        - `ll.addFirst("Banana");`  // O(1)
        - `ll.addLast("Cherry")`    // O(1)
    - Deletion:
        - `ll.remove("Banana");`    // O(n)
        - `ll.removeFirst();`	    // O(1), return
        - `ll.removeLast();`	    // O(1), return
    - Getter:
        - `ll.get(1);`				// O(n), return
        - `ll.getFirst();`			// O(1), return
        - `ll.getLast();`			// O(1), return
    - Others:
        - `ll.size();`				// O(1)
        - `ll.isEmpty();`			    // O(1)
        - `ll.clear();`				// O(n)
