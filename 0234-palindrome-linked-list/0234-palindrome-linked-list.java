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
 import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    ListNode current = head;
    while(current!=null){
        list.add(current.val);
        current = current.next;
    }
    int i = 0;
    int j = list.size()-1;
    while(i<j){
      if(list.get(i++)!=list.get(j--)){
        return false;
      }
    }
  return true;
    }
}
