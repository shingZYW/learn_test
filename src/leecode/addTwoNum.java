package leecode;

/**
 * ass we can!
 * created by shing
 * 2019-10-08 21:08
 */
public class addTwoNum {

    public ListNode addTwoNumber(ListNode l1,ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while(l1 != null && l2 != null){

            int dig = l1.val + l2.val +carry;
            int var =dig%10;
            carry = dig/10;
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){

            int val =(l1.val + carry)%10;
            carry = (l1.val +carry)/10;
            current = current.next;
            l1 = l1.next;
        }
        while(l2 != null){
            int val = (l2.val +carry)%10;

            carry = (l2.val + carry)/10;
            current = current.next;
            l2 = l2.next;
        }
        /**
         * l1 =
         */
        if(carry != 0) current.next=new ListNode(carry);

        return dummy.next;





    }
}
