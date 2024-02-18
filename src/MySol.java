class MySol {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fakeHead = new ListNode(0, head);

        ListNode left = fakeHead;
        ListNode right = fakeHead.next.next;
        while (right != null) {
            if (left.next.val == right.val) {
                while (right != null && left.next.val == right.val) {
                    right = right.next;
                }
                left.next = right;
                if (right == null) return fakeHead.next;
                right = right.next;
            } else {
                left = left.next;
                right = right.next;
            }
        }
        return fakeHead.next;
    }
}