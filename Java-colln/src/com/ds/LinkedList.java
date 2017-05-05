package com.ds;

public class LinkedList<E> {

	private Node head = null;

	// add
	public void add(E data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}

	}

	// add by index

	public void add(int idx, E data) {

		Node newNode = new Node(data);

		if (idx == 0) {
			if (head == null) {
				head = newNode;
			} else {
				newNode.setNext(head);
				head = newNode;
			}
		} else {
			Node current = head;
			int i = 0;
			while (i < idx - 1) {
				current = head.getNext();
				i++;
			}
			newNode.setNext(current.getNext());
			current.setNext(newNode);
		}
	}

	// get by index

	// update by index

	// remove element by index
	public void remove(int idx) {

		Node current = head;
		int i = 0;
		while (i < idx - 1) {
			current = head.getNext();
			i++;
		}
		current.setNext(current.getNext().getNext());

	}

	// clear-all

	// iterate/loop
	public void display() {

		Node temp = head;
		do {
			if (temp != null) {
				System.out.println(temp.getData());
			}
			temp = temp.getNext();
		} while (temp != null);

	}

	// count
	public int count() {
		int count = 0;
		if (head != null) {
			count = 1;
		}
		Node last = head;
		while (last.getNext() != null) {
			count += 1;
			last = last.getNext();
		}
		return count;
	}

	// reverse

	private class Node {

		private E data;
		private Node next;

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, Node next) {
			this.data = data;
			this.next = next;
		}

		public E getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
