// Java program to implement
// the above approach

class CircularLinkedList
{

    // node
    static class Node
    {
        int data;
        Node next;
    };

    /* Insertion of a node at the beginning of a Circular linked list */
    static Node push(Node head_ref,
                     int data)
    {
        Node ptr1 = new Node();
        Node temp = head_ref;
        ptr1.data = data;
        ptr1.next = head_ref;

    /* If linked list is not empty, set the next of last node */
        if (head_ref != null)
        {
            while (temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        }
        else
            ptr1.next = ptr1;

        head_ref = ptr1;

        return head_ref;
    }

    /* Function to print nodes in a given Circular linked list */
    static void printList(Node head)
    {
        Node temp = head;
        if (head != null)
        {
            do
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            while (temp != head);
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        /* Initialize lists as null */
        Node head = null;

    /* Created linked list will
       be 11.2.56.12 */
        head = push(head, 12);
        head = push(head, 56);
        head = push(head, 2);
        head = push(head, 11);
        head = push(head, 15);
        head = push(head, 14);
        head = push(head, 24);
        head = push(head, 1);

        System.out.println(" The Contents of Circular " + "Linked List:");
        printList(head);
    }
}