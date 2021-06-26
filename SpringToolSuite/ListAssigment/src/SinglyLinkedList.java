
public class SinglyLinkedList {

	public Node head;
	public Node anterior;
	
	//constructor
	public SinglyLinkedList() {		
		
	}
	
	public void add(int value) {
		
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;			
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;				
			}
			runner.next = newNode;
		}
	}
	
	public void printValues() {
		if(head == null) {
			System.out.println("lista vacia");
		} else {
			Node node1 = head;
			while (node1.next != null) {
				System.out.println(node1.value);
				node1 = node1.next;
			}			
			System.out.println(node1.value);
		}		
	}
	
	public void remove() {
		if(head == null) {
			System.out.println("lista vacia");
		} else {
			Node node1 = head;
			while (node1.next != null) {
				anterior = node1;
				node1 = node1.next;
			}			
			anterior.next=null;
		}
	}
	
}
