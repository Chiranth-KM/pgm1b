package LABpack;

public class doublell {
    class Node {     // Represent a node of the doubly linked list
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
        }
    }

    // Represent the head and tail of the doubly linked list  
    Node head, tail = null;

    public void insert_node(int data) {    //  addNode() will add a node to the list
        Node newNode = new Node(data);     // Create a new node  
        if (head == null) {                // If list is empty  
            head = tail = newNode;         //Both head and tail will point to newNode  
            head.prev = tail.next = null;  //head's & tail's previous will point to null  
        }
        else {
            tail.next = newNode; //newNode will be added after tail such that tail's next will point to newNode
            newNode.prev = tail; //newNode's previous will point to tail   
            tail = newNode;      //newNode will become new tail
            tail.next = null;    //As it is last node, tail's next will point to null  
        }
    }

    public int minNode() {      // Find the minimum node
        Node temp = head;       // Node temp will point to head  
        int min;
        if (head == null) {     //Checks if list is empty  
            System.out.println("List is empty");
            return 0;
        }
        else {
            min = head.data;      //Initially, min will store the value of head's data  
            while (temp != null) {
                if (min > temp.data) // If value of min greater than temp data
                    min = temp.data; // then replace value of min with temp node's data  
                temp = temp.next;
            }
        }
        return min;
    }

    public int maxNode() {      // Find the maximum node
        Node temp = head;       // Node temp will point to head 
        int max;
        if (head == null) {     //Checks if list is empty  
            System.out.println("List is empty");
            return 0;
        }
        else {
            max = head.data;         //Initially, max will store the value of head's data
            while (temp != null) {
                if (max < temp.data) //If value of max is lesser than temp data  
                    max = temp.data; //Then replace value of max with temp node's data
                temp = temp.next;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        doublell dList = new doublell();
        dList.insert_node(5);      //Add nodes to the list  
        dList.insert_node(7);
        dList.insert_node(9);
        dList.insert_node(1);
        dList.insert_node(2);
        System.out.println("Minimum value node in the list: " + dList.minNode());
        System.out.println("Maximum value node in the list: " + dList.maxNode());
    }
}