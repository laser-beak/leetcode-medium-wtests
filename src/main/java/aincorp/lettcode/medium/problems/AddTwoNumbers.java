package aincorp.lettcode.medium.problems;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        int ostatok = 0;

        ListNode currentNode = result;
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;

        while (pointer1 != null || pointer2 != null) {

            int pointer1Val = pointer1 == null ? 0 : pointer1.val;
            int pointer2Val = pointer2 == null ? 0 : pointer2.val;

            int sum = pointer1Val + pointer2Val + ostatok;
            ostatok = sum / 10;
            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            if (pointer1 != null) {
                pointer1 = pointer1.next;
            }

            if (pointer2 != null) {
                pointer2 = pointer2.next;
            }
        }

        if (ostatok > 0) {
            currentNode.next = new ListNode(ostatok);
        }

        return result.next;
    }
}
