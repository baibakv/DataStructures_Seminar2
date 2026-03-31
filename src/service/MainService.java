package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		MyLinkedList<Character> symbols = new MyLinkedList<Character>();
		
		try {
			System.out.println(" ========== DARBS AR SAISTĪTO SARAKSTU ========== ");
		symbols.add('A');
		symbols.add('B');
		symbols.add('C');
		
		System.out.println();
		System.out.println("Izvadīt izveidoto sarakstu:");
		symbols.print();
		
		System.out.println();
		System.out.println("Pievienot Z un izvadīt izveidoto sarakstu: ");
		symbols.add('Z');
		symbols.print();
		
		
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
