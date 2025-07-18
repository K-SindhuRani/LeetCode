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
    public int getDecimalValue(ListNode head) {
        //ArrayList<Integer> list = new ArrayList<>();
        String s = "";
        ListNode current = head;
        while(current!=null){
            s+=current.val;
           // list.add(current.val);
            current = current.next;
        }
        //int res = Integer.parseInt(s,2);
        int power = 0;
        int res = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1')
                res += Math.pow(2,power);
            power++;
        }
        return res;
    }
}