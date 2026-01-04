import org.w3c.dom.Node;

class doublylinkedlist{
    static class Node{
        int data;
        Node prev;
        Node next;
        Node child;
        Node(int data){
            this.data=data;
        }
    }
    public Node flatten(Node head){
        Node temp=head;
        while(temp!=null){
            Node t=temp.next;
            if(temp.child !=null){
                Node c= flatten(temp.child);
                temp.next=c;
                c.prev=temp;
                while(c.next!=null){
                    c=c.next;
                }
                c.next=t;
                if(t!=null){
                    t.prev=c;
                }
                temp.child=null;
                temp=t;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
     public static void main(String[] args) {

        doublylinkedlist dll = new doublylinkedlist();

        // Nodes using a, b, c format
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(8);

        // Main list: 1 <-> 2 <-> 3
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;

        // Child list: 2 -> 7 -> 8
        b.child = d;
        d.next = e;
        e.prev = d;

        // Flatten
        dll.flatten(a);

        // Print flattened list
        Node temp = a;
        System.out.print("Flattened List: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
