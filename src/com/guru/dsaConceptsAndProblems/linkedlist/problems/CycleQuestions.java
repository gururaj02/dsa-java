package com.guru.dsaConceptsAndProblems.linkedlist.problems;

public class CycleQuestions {

    // https://leetcode.com/problems/linked-list-cycle/
    public boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }

        return false;
    }

    // find length of the cycle
    public int lengthCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                // calculate the length
                ListNode temp = slow;
                int length = 0;

                do {
                    temp = temp.next;
                    length++;
                } while(temp != slow);

                return length;
            }
        }

        return 0;
    }

    // start of the cycle
    // https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        int length = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // Now we have the cycle, find the start
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }

        return s;
    }


    // Happy Number
    // https://leetcode.com/problems/happy-number/description/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }

        return false;
    }

    // TODO: Middle of the LL

    private int findSquare(int number) {
        int ans = 0;

        while(number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }

        return ans;
    }


    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
