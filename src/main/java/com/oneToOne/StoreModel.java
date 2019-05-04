package com.oneToOne;

public class StoreModel {
	
	BookModel book_id;
	private int store_id;
	
	int no_of_copies_avail;

	

	public int getNo_of_copies_avail() {
		return no_of_copies_avail;
	}

	public void setNo_of_copies_avail(int no_of_copies_avail) {
		this.no_of_copies_avail = no_of_copies_avail;
	}

	public BookModel getBook_id() {
		return book_id;
	}

	public void setBook_id(BookModel book_id) {
		this.book_id = book_id;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}
}
