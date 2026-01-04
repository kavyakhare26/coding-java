public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
        }
    }
    public static class linkedlist{
        Node head =null;
        Node tail =null;
        void insertAtEnd(int val){
            Node temp =new Node(val);
            if(head==null){
                head =temp;
            }
            else{
                tail.next =temp;
            }
            tail =temp;
        }
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head =temp;
                tail =temp;
            }
            
            else{
                temp.next=head;
                head =temp;
            } 
        }
        void insertAt(int idx,int val){
            Node t =new Node(val);
            Node temp =head;
            if(idx==size()){
                insertAtEnd(val);
                return;
                
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }
            else if(idx>size()){
                System.out.println("wrong index");
                return;
            }
            for(int i=1;i<idx-1;i++){
                temp =temp.next;
            }
            t.next=temp.next;
            temp.next = t;
        }
    
        void display(){
            Node temp =head;
            while(temp!=null){
                System.out.print(temp.data +" ");
                temp =temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp =head;
            int count =0;
            while(temp!=null){
                count++;
                temp =temp.next;
            }
            return count;

        }
        void deleteAt(int idx){
            Node temp =head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;

            }
            temp.next=temp.next.next;
            tail =temp;
            
        }
    }
    public static void main(String[] args){
    linkedlist ll =new linkedlist();
    ll.insertAtEnd(4);
    //ll.display();
    ll.insertAtEnd(5);
    ll.display();
    //System.out.println();
    //System.out.println(ll.size());
    ll.insertAtHead(8);
    ll.display();
    ll.insertAt(2,10);
    ll.display();
    ll.deleteAt(3);
    ll.display();
    System.out.println(ll.tail.data);

    }
}
