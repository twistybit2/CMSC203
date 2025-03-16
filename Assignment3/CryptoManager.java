package Assignment3;
/**
 * This is a utility class that encrypts and decrypts a phrase using two
 * different approaches. The first approach is called the Caesar Cipher and is a
 * simple �substitution cipher� where characters in a message are replaced by a
 * substitute character. The second approach, due to Giovan Battista Bellaso,
 * uses a key word, where each character in the word specifies the offset for
 * the corresponding character in the message, with the key word wrapping around
 * as needed.
 * 
 * @author Farnaz Eivazi
 * @version 7/16/2022
 */
public class CryptoManager {
	
	private static final char LOWER_RANGE = ' ';
	private static final char UPPER_RANGE = '_';
	private static final int RANGE = UPPER_RANGE - LOWER_RANGE + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_RANGE and UPPER_RANGE characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean isStringInBounds (String plainText) {
		
		for (int i = 0; i < plainText.length(); i++) {

			
			if (plainText.charAt(i) < LOWER_RANGE || UPPER_RANGE < plainText.charAt(i)) { //if check is less than the lower range, or greater than the upper range, kill it
				return false;
			}
		}
			
			
			
		
		return true; //will only reach this point once each for loop successfully passes
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String caesarEncryption(String plainText, int key) {
		
		if (!isStringInBounds(plainText)) {
			return "The selected string is not in bounds, Try again."; //Failure condition
		}
		
		key = key % RANGE; //make sure key is in range	
		
		String encryptedString = "";
		
		char encryptedChar;
		
		for(int j = 0; j < plainText.length(); j++) {
			
			encryptedChar = (char) (plainText.charAt(j) + key);
			
			if (encryptedChar > UPPER_RANGE) { //APPARENTLY you need to wrap it around when it hits the upper range
				encryptedChar = (char) (LOWER_RANGE + (encryptedChar - UPPER_RANGE - 1)); //However much the char goes over the range, add it to the lower range
			}
			
			encryptedString += encryptedChar;
			
		}
		
		return encryptedString;
		
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String bellasoEncryption (String plainText, String bellasoStr) {
		
		if (!isStringInBounds(plainText)) {
			return "The selected string is not in bounds, Try again."; //Failure condition
		}
		
		String encryptedString = "";
		
		int keyLength = bellasoStr.length();
		
		char encryptedChar;
		
		char keyChar;
		
		for (int i = 0; i < plainText.length(); i++) {
			
			keyChar = bellasoStr.charAt(i % keyLength); //Get chars one by one, modulo will ensure it's within range
				
			encryptedChar = (char) ((plainText.charAt(i) + keyChar));
			
			if (encryptedChar > UPPER_RANGE) { //Copying from the caesar encryption
				encryptedChar = (char) ((encryptedChar - LOWER_RANGE) % RANGE + LOWER_RANGE); //However much the char goes over the range, add it to the lower range
			}
			
			encryptedString += encryptedChar;
		}
		
		
		return encryptedString;
	}
	
	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String caesarDecryption (String encryptedText, int key) {
		
		//Mostly the same as the encryption
		
		key = key % RANGE; //make sure key is in range	
		
		String decryptedString = "";
		
		char decryptedChar;
		
		for (int k = 0; k < encryptedText.length(); k++) {
	        decryptedChar = (char) (encryptedText.charAt(k) - key); //HIT THE REVERSE

	        if (decryptedChar < LOWER_RANGE) { // Wrap around if it goes below LOWER_RANGE
	            decryptedChar = (char) (UPPER_RANGE - (LOWER_RANGE - decryptedChar - 1)); //Get difference like before but subtract from the upper range this time
	        }

	        decryptedString += decryptedChar;
	    }

	    return decryptedString;
		
		
		
		
		
		
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String bellasoDecryption(String encryptedText, String bellasoStr) {
	    
		String decryptedString = "";
		
		char decryptedChar;
		
		char keyChar;
		
		int keyLength = bellasoStr.length();
		
		
		for (int i = 0; i < encryptedText.length(); i++) {
	        keyChar = bellasoStr.charAt(i % keyLength); // Repeat key if shorter
	        decryptedChar = (char) (encryptedText.charAt(i) - keyChar);
	        
		    
	        
	        decryptedChar = (char) ((decryptedChar - LOWER_RANGE + RANGE) % RANGE + LOWER_RANGE); //Get the difference, make sure it's in range, then add it to the lower range
	        

	        decryptedString += decryptedChar;
	    }

	    return decryptedString;
	}

}
