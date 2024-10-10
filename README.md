# CE204-lab1

Below is the code for the DoublyLinkedList class from lecture 1. The outlines of some extra methods have been added. Complete each of the methods. Note that the methods all have return statements that return a dummy value so that the code compiles. As you write each method, you'll need to replace the dummy return statement with a correct one.

Click the Check button to test your code. You can check as many times as you want, with no penalty. So feel free to solve part of the exercise, test it, and then solve some more. Use the "finish attempt" button when you've finished. I believe I've correctly set up the quiz so you can use this button as many times as you want, too (until the deadline), and your best mark will be taken.

The methods should behave as follows:

isEmpty() should return true if the list is empty, and false if it is not.
length() should return the list's length.
getOneTwoThreeList() should return a DoublyLinkedList object that stores the strings "One", "Two" and "Three", in that order. Since we've not written the insert() method yet, you'll need to do all the work "by hand". getOneTwoThreeList() is static, so you'll first need to create a DoublyLinkedList object to work with. Then, create three Item objects to store the Strings, and correctly set their next and prev references, along with the fields of the list object, and return the list you've made.
contains(String s) should return true if the String s is in the list, and false if it is not.
toString() should produce a String representation of the list. If the list is empty, the output should be the empty String. Otherwise, the output should be the Strings stored by the list, in order, separated by commas. So the result of calling getOneTwoThreeList().toString() should be exactly the String "One,Two,Three" (without the quotation marks).
halfToString() should return a String in the same format as toString(), but only including the first, third, fifth, etc. elements of the list. So getOneTwoThreeList().halfToString() should return "One,Three".
There are six tests in total that will be run on your code. Test 3-6 are hidden until tests 1 and 2 are passed, because they won't work if test 2 doesn't work.
