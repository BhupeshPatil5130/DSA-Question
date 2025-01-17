class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2, t3=null, head=null;
        int sum=0;
        while(t1 != null || t2 != null || sum!=0){
            if(t1 != null){
                sum += t1.val;
                t1 = t1.next;
            }if(t2 != null){
                sum += t2.val;
                t2 = t2.next;
            }
            ListNode newNode = new ListNode(sum%10);
            sum /= 10;
            if(head!=null){
                t3.next = newNode;
                t3 = t3.next;
            }else
                head = t3 = newNode;
        }
        return head;
    }
    }