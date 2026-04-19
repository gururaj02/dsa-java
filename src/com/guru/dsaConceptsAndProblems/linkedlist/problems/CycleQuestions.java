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

    // Middle of the LL
    // https://leetcode.com/problems/middle-of-the-linked-list/
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    private int findSquare(int number) {
        int ans = 0;

        while(number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }

        return ans;
    }


    // Inplace reversal of LL
    // https://leetcode.com/problems/reverse-linked-list/description/
    public ListNode reverseInplace(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present != null) {
            present.next = prev;
            prev = present;
            present = next;

            if(next != null) {
                next = next.next;
            }
        }
        head = prev;
        return head;
    }


    // Reverse LL - 2
    // https://leetcode.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        // skip the first left-1 nodes
        ListNode current = head;
        ListNode prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }

        ListNode last = prev;
        ListNode newEnd = current;

        // reverse between left and right
        ListNode next = current.next;
        for(int i = 0; current != null && i < right - left + 1; i++) {
            current.next = prev;
            prev = current;
            current = next;

            if(next != null) {
                next = next.next;
            }
        }

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;

        return head;

    }


    // Palindrome LL
    // https://leetcode.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode secondHead = reverseInplace(mid);
        ListNode rereverseHead = secondHead;

        // compare both the halves
        while (head != null && secondHead != null) {
            if (head.val != secondHead.val) {
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverseInplace(rereverseHead);

        // if you are able to traverse the entire list without breaking then it's palindrome
        if (head == null || secondHead == null) {
            return true;
        }
        return false;
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
