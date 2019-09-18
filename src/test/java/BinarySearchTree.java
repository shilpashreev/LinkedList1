
class DeleteLinkedListNode
{
    Node head;
    public static void main(String[] args) {
        Node root = new Node(10);
        root.next = new Node(20);
        root.next.next = new Node(30);
          root.next.next.next = new Node(40);
        root.next.next.next.next = new Node(50);

        DeleteLinkedListNode linkedListNode = new DeleteLinkedListNode();
        Node head = linkedListNode.deleteNode(root, 4);

      while(head!=null){
          System.out.println(head.data);
          head = head.next;
      }

    }

    private Node deleteNode(Node root, int pos) {
        head = root;
        Node temp = head;

        if(root==null) return null;

        if(pos ==0){
            root = temp.next;
            return root;
        }

        for(int i =0;temp!=null && i<pos-1 ;i++){
            temp = temp.next;
        }

        Node next = temp.next.next;
        temp.next = next;
        System.out.println(temp.data);
        return root;
    }
}

class Node{
    int data;
    Node next;


    Node(int data){
        this.data= data;
    }
}


