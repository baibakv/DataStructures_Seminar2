package datastr;

public class MyNode <Ttype> {
	// --- MAINIGIE --------------------------------------------------------
	private Ttype element;
	private MyNode<Ttype> nextNode = null;
	private MyNode<Ttype> previousNode = null;
	
	
	// --- GETTERI --------------------------------------------------------
	public Ttype getElement() {
		return element;
	}
	public MyNode<Ttype> getNextNode() {
		return nextNode;
	}
	public MyNode<Ttype> getPreviousNode() {
		return previousNode;
	}
	
	
	// --- SETTERI --------------------------------------------------------
	public void setElement(Ttype inputElement) {
		if(inputElement != null) {
			element = inputElement;
		}
		else {
			element = (Ttype)new Object();
		}
	}
	
	//nav jāveic not null pārbaudes, jo var būt gadījumi, ka ir null viens vai otrs - ja pēdjeais bloks vai pirmais
	public void setNextNode(MyNode<Ttype> nextNode) {
		this.nextNode = nextNode;
	}
	
	public void setPreviousNode(MyNode<Ttype> previousNode) {
		this.previousNode = previousNode;
	}
	
	
	// --- BEZARGUMENTU KONSTRUKTORS ----------------------------------------
	//bez argumenta konstruktors nav vajadzīgs, jo vienmēr lietotjam būs jāpadod elements
	
	
	// --- ARGUMENTU KONSTRUKTORS -------------------------------------------
	public MyNode(Ttype inputElement) {
		setElement(inputElement);
	};
	
	
	// --- TO STRING --------------------------------------------------------
	public String toString() {
		return "" + element;
	}
	
}
