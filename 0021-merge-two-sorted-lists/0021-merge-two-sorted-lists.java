import java.util.*;
class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 public static ListNode deserialize(String data) {
data = data.replaceAll("\\[|\\]|\\s", "");
if (data.isEmpty()) return null;
String[] parts = data.split(",");
ListNode dummy = new ListNode(0);
ListNode current = dummy;
for (String part : parts) {
current.next = new ListNode(Integer.parseInt(part));
current = current.next;
        }
 return dummy.next;
    }
public static void printList(ListNode head) {
while (head != null) {
 System.out.print(head.val + " ");
 head = head.next;
        }
        System.out.println();
    }
}

public class Solution {
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
ListNode dummy = new ListNode(0);
ListNode current = dummy;
 while (l1 != null && l2 != null) {
if (l1.val < l2.val) {
current.next = l1;
 l1 = l1.next;
 } else {
 current.next = l2;
 l2 = l2.next;
 }
current = current.next;
        }
current.next = (l1 != null) ? l1 : l2;
 return dummy.next;
    }
public static void main(String[] args) {
String input1 = "[1,2,4]";
 String input2 = "[1,3,4]";
ListNode l1 = ListNode.deserialize(input1);
ListNode l2 = ListNode.deserialize(input2);
Solution sol = new Solution();
ListNode result = sol.mergeTwoLists(l1, l2);
 System.out.print("Merged List: ");
 ListNode.printList(result);
    }
}

