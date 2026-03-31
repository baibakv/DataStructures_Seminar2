package datastr;

public class MyLinkedList <Ttype> {
	// --- MAINIGIE --------------------------------------------------------
	private MyNode<Ttype> firstNode = null;
	private MyNode<Ttype> lastNode = null;
	private int howManyElements = 0;
	
	
	// --- GETTERI ---------------------------------------------------------
	public int getHowManyElements() {
		return howManyElements;
	}
	
	
	// --- SETTERI ----------------------------------------------------------
	//nevajag, jo lietotajs nevar pats mainit elementu skaitu
	
	
	// --- BEZARGUMENTU KONSTRUKTORS ----------------------------------------
	//nevajag, jo bezargumentu kontruktors nak no object klases
	
	
	// --- CITAS FUNKCIJAS --------------------------------------------------
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	
	public boolean isFull() {
		try {
			new MyNode<Character>('A'); //Meginu RAM atmina rezervet vietu
			return false;
		}
		catch (OutOfMemoryError e) {
			return true;
		}
	}
	
	
	public void add(Ttype element) throws Exception {
		if(isFull()) {
			throw new Exception("Saraksts ir pilns un nav iespējams pievienot elementu!");
		}
		if(element == null) {
			throw new Exception("Pievienotais elements nav norādīts!");
		}
		
		//ja bus pievienots pirmais bloks
		if(isEmpty()) {
			MyNode<Ttype> newNode = new MyNode<Ttype>(element);
			lastNode = newNode;
			firstNode = newNode;
			howManyElements++;
		}
		else { //ja jau ir izveidots viens bloks ieks saraksta
			MyNode<Ttype> newNode = new MyNode<Ttype>(element);
			lastNode.setNextNode(newNode);
			newNode.setPreviousNode(lastNode);
			lastNode = newNode;
			howManyElements++;
		}
	}
	
	public void print(Ttype element) throws Exception {
		if(isEmpty()) {
			throw new Exception("Saraksts ir tukss un nav iespējams printēt elementus!");
		}
		
		MyNode<Ttype> currentNode = firstNode;
		while(currentNode != null) {
			System.out.print(currentNode.getElement() + " ");
			currentNode = currentNode.getNextNode();
		}
		System.out.println();
	}
	
	
}
