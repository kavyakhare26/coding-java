class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Solution {

    // Function to check if cycle exists
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {        // cycle detected
                return true;
            }
        }

        return false; // no cycle
    }

    public static void main(String[] args) {

        // Creating nodes
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        // Linking nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        // Making a cycle
        e.next = c;   // cycle here

        Solution obj = new Solution();
        boolean result = obj.hasCycle(a);

        System.out.println(result ? "Cycle detected" : "No cycle");
    }
}
