class NullPointerExceptionDemonstration {
	
	// Method to generate the exception
	public static void generateException () {
		String text = null; // The text varible doesnt point to anything
		text.length(); // This will generate an error
	}
	
	// Method to handle the exception
	public static void handleException () {
		String text = null;
		try {
			text.length();
		} catch (NullPointerException e) {
			System.out.println("Error message: " + e);
			System.out.println ("NullPointerException handled");
		}
	}		
	
	// Main method
	public static void main (String[] args) {
		// generateException();
		handleException();
	}
}