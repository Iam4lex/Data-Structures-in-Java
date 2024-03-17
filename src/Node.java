
public class Node{
	
	private String data;
	private Node link;
	
	// constructor
	public Node() {
		data = null;
		link = null;
	}
	
	public String getData() {
		return data;
	}
	public void setData(String d) {
		data = d;
	}
	
	public Node getNext() {
		return link;
	}
	public void setNext(Node n) {
		link = n;
	}
	
	public void display() {
		System.out.print("Hello, World!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Node node = new Node();
	node.setData("Helo");
	node.getData();
	node.display();
	}

}
