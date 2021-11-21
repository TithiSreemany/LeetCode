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
class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {
        if (head == null)
            return null;
        if (head.next==null || k==0)
            return head;
        ListNode p = head;
        int count  = 0;
        while (p.next!=null)
        {
            count++;
            p=p.next;
        }
        ListNode p2=head;
        k=k%(count+1);
        if (k==0)
            return head;
        for(int i=0;i<count-k;i++)
        {
            p2=p2.next;
        }
        ListNode dummy = p2.next;
        p2.next = null;
        p.next=head;
        return dummy;
        
    }
}