/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
      if(head == null){
        return null;
      }
      if(head.next == null){
        return head;
      }
        ListNode prev = null;
        ListNode current = head;
        for(int i=1;i<left;i++){
            prev = current;
            current = current.next;
        }
        ListNode connection = prev;
        ListNode tail = current;
         ListNode nextNode = null;
      for(int j=left;j<=right;j++){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        if(connection!=null){
            connection.next = prev;
        }
        else {
            head = prev;
        }
        tail.next=current;

        return head;
     }
}