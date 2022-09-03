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
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
                
        int length = findLength(head);
        
        if (n==length)
            return head.next;
        
        int index = length-n;
        ListNode prev = head;
        ListNode cur = prev.next;
        ListNode next = cur.next;
        
        for (int i=1; i<length; i++){
            if (i==index){
                prev.next = next;
                break;
            }
            prev = prev.next;
            cur = prev.next;
            next = cur.next;
        }
        
        return head;
        
    }
    
    public int findLength(ListNode node){
        if (node==null)
            return 0;
        return findLength(node.next)+1;
    }
    
}