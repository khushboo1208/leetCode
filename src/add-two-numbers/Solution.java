/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        String n1 = "";
        String n2 = "";
        
        while(l1 != null || l2 != null) {
            if(l1 != null) {
                n1 = l1.val + n1;
                l1 = l1.next;
            }
            
            if(l2 != null) {
                n2 = l2.val + n2;
            l2 = l2.next;
            }
        }
        
        BigInteger b1 = new BigInteger(n1);
        BigInteger b2 = new BigInteger(n2);
        
        String sum = b1.add(b2).toString();
        
        ListNode l3 = null;
        
        for(int i=0; i<sum.length(); i++) {
            
            ListNode temp = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(i))));
            
            if(i == 0) {
                l3 = temp;
            } else {
                temp.next = l3;
                l3 = temp;
            }
        }
        return l3;
    }
}
