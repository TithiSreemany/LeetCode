/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

// Time complexity : O(2*n)
// Space complexity = O(1)

public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode d1 = headA;
        ListNode d2 = headB;
        while(d1!=d2)
        {
            d1=d1==null?headB : d1.next;
            d2=d2==null?headA : d2.next;
        }
        return d1;
    }
}