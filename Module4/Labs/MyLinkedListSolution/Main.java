package MyLinkedListSolution;

public class Main {
    public static void main(String[] args){

        //Setting up Nodes manually
        Node first = new Node(10);
        Node second  = new Node(20);
        Node third = new Node(30);

        first.next = second;

        second.next = third;

        System.out.println("First node data: " + first.data);
        System.out.println("Second node data (via first): " + first.next.data);
        System.out.println("Third node data (via first): " + first.next.next.data);

        System.out.println("\nWalking the list:");
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next "house"
        }
        System.out.println("null");
    }
}
