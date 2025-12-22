class OtpGenerator {
	
	// Method to generate random 6 digit otp
	public static int generateOtp () {
		int otp = (int)(Math.random() * 900000) + 100000;
		return otp;
	}
	
	// Method to store the otps in an array
	public static int[] storeOtpInArray () {
		int[] otpArray = new int [10];
		for (int i = 0; i < 10; i++) {
			otpArray[i] = generateOtp();
		}
		return otpArray;
	}
	
	// Method to see if all otps are unique
	public static boolean isUnique (int[] otpArray) {
		for (int i = 0; i < otpArray.length; i++) {
			for (int j = i+1; j < otpArray.length; j++) {
				if (otpArray[i] == otpArray[j]) return false;
			}
		}
		return true;
	}
	
	// Main method
	public static void main (String[] args) {
		// Diplay all the otps
		int[] otpArray = storeOtpInArray();
		for (int value : otpArray) {
			System.out.print (value + " ");
		}
		System.out.println();
		// Unique otps check
		System.out.println ("Are all the otps unique: " + (isUnique(otpArray) ? "Yes" : "No"));
	}
}