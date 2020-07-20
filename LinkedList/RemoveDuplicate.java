 /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

        if(head == null) return head;

        SinglyLinkedListNode temp = head;
        while(temp != null && temp.next != null)
        {
            if(temp.data == temp.next.data)
            temp.next = temp.next.next;

            else
            temp = temp.next;
        }

        return head;
    }
