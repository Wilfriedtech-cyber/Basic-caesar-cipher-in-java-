import java.util.Scanner; 

public class System_ED {

	public static void main (String[] args) {
		// call the scanner packet 
		Scanner input  = new Scanner (System.in);
		
		// The while loop helps to keep the program running until the user exit 
	    
		int choice;
		//declare choice variable 
	
		do {
			System.out.println("\n Text Encryption and Decryption System");
			System.out.println("1. Encrypt the text");
			System.out.println("2. Decrypt the text");
			System.out.println("3. Exit the program");
			
			System.out.print("Choose an option: ");
		    // declare the variable choice 
			choice = input.nextInt();
			
			input.nextLine();  //consume the newline character
			
			if (choice == 1) {
				System.out.print("Enter the text to encrypt: ");
				
				String plainText = input.nextLine();
				
				//Enter the shift value to encrypt
				System.out.print("Enter shift value:");
				int shift = input.nextInt();
				
				//Use the encryption method
				
				Encrypt(plainText, shift);
				
				//Consume the next line
				input.nextLine();
				
			
				
			} else if (choice == 2) {
				System.out.print("Enter the text to Decrypt: ");
				
				String cipherText = input.nextLine();
				
				//Enter the shift value to decrypt
				System.out.print("Enter shift value:");
				int shift = input.nextInt();
				
				//Use the decryption method 
				Decrypt(cipherText, shift);
				
				
				input.nextLine();
				
				//Consume the next line
				
			} else if (choice == 3) {
			
				System.out.print("\n Exiting.....");
				
			} else {
				System.out.println("Incorrect number!! :(  Please Try again.");
			}
			
		} while  (choice != 3);
		    
	}
	
	// Method function encryption
	 public static String Encrypt(String plaintext, int shift) {
	        StringBuilder result = new StringBuilder(); 
	        
	        for (char c : plaintext.toCharArray()) {
	            if (Character.isLetter(c)) {
	                char base;
	                // Using if-else instead of ternary operator
	                if (Character.isLowerCase(c)) {
	                    base = 'a'; // for lowercase letters
	                } else {
	                    base = 'A'; // for uppercase letters
	                } // used for ACSII value 
	                
	                // Encrypt the character
	            char encryptedChar = (char) ((c - base + shift) % 26 + base);// encryption function 
	                result.append(encryptedChar);
	            } 
	             else {
	                result.append(c); // keep non-letter characters as is
	            }
	        }
	        
	        System.out.println("Encrypted text: " + result.toString()); //converts back to string
	        return result.toString();
	    }
	    
	    // Method function decryption 
	    public static String Decrypt(String cipherText, int shift) {
	        // Use the encryption method but reverse the shift (26 - shift)
	        return Encrypt(cipherText, 26 - (shift % 26));
	    }
	}