public class DoublyLinkedList {
    private static class Item {
        String value;
        Item next;
        Item prev;

        Item (String value, Item prev, Item next) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private Item head;
    private Item tail;
    private int length;

    public DoublyLinkedList() {
        head = tail = null;
        length = 0;
    }

    public boolean isEmpty() {
        if (length == 0) {
            return true;
        } else {
            return false;
            }// placeholder -- you'll need to return the right value
    }

    public int length() {
        return length;// placeholder -- you'll need to return the right value
    }

    public static DoublyLinkedList getOneTwoThreeList() {
        DoublyLinkedList list = new DoublyLinkedList();

        Item  one1 = new Item("One", null, null);
        Item two2 = new Item("Two", one1, null);
        Item three3 = new Item("Three", two2, null);

        one1.next = two2;
        two2.next = three3;

        list.head = one1;
        list.tail = three3;
        list.length = 3;

        return list; // placeholder -- you'll need to return something else
    }

    public boolean contains(String s) {
        while (head != null) {
            if (head.value.equals(s)) {
                return true;
            } else {
                head = head.next;
        }
        }// placeholder -- you'll need to return the correct value
        return false;
        }

    public String toString() {
        StringBuilder str = new StringBuilder();
        if (isEmpty()) {
            return "";
        } else {
            str.append("");
            Item curr = head;
            while (curr != null) {
                str.append(curr.value);
                curr = curr.next;
                if (curr != null) {
                    str.append(",");
                }
            }
        }
        return str.toString(); // placeholder -- you'll need to return the correct value
    }

    public String halfToString() {
        StringBuilder str = new StringBuilder();
        Item curr = head;
        int count = 0;

        while (curr != null) {
            if (count % 2 == 0) {
                str.append(curr.value);
                if (curr.next != null) {
                    str.append(",");
                }
            }
            curr = curr.next;
            count ++;
        }
        return str.toString(); // placeholder -- you'll need to return the correct value
    }

// =============================================================================
// Do not modify the code below
// =============================================================================

    public String fullToString() {
        String s = "head=" + itemValue(head)
                + ", tail=" + itemValue(tail)
                + ", length=" + length + "\n";

        Item cur = head;
        int index = 0;
        while (cur != null) {
            s += index + ": " + cur.value + ", prev=" + itemValue(cur.prev)
                    + ", next=" + itemValue(cur.next) + "\n";
            cur = cur.next;
            index++;
        }
        return s;
    }

    private String itemValue(Item e) {
        return (e == null) ? "[null]" : e.value;
    }
}