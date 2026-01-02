package com.encapsulation.libraryManagementSystem;

public abstract class LibraryItem {
	
	private int itemId;
	private String title;
	private boolean isIssued;
	
	public LibraryItem(int itemId,String title) {
        this.itemId = itemId;
        this.title = title;
        this.isIssued = false;
	}
	
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return isIssued;
    }
    
    protected void setIssued(boolean issued) {
        this.isIssued = issued;
    }

    public void issueItem() {
        if (!isIssued) {
            isIssued = true;
        }
    }
    
    public void returnItem() {
        isIssued = false;
    }

    // Abstract method
    public abstract double calculateFine(int daysLate);
	
}
