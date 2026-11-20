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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode cu=null;
        ListNode pev=null;
        while(temp!=null){
            cu=temp.next;
            temp.next=pev;
            pev=temp;
            temp=cu;
            
        }
        // ListNode pre=null;
        // ListNode cu=null;
        // while(temp!=null){
        //     temp=temp.next;
        // }
        // cu=temp; 
        // // while(temp.pre!=null){
        // //     temp=temp.pre;
        // // }  
        // pre=head;
        // while(cu!=pre){
        //     cu.next=pre;
        //     pre=pre.next;
        // }
        return pev;
    }
}