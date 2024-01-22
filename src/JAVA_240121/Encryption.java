package JAVA_240121;

public interface Encryption { // 암호화

	String encrypt(String message);

//	 if (Character.isLetter(c)) {
//         c =char) (((c - 'a' - 3 + 26) % 26) + 'a');

}

interface Decryption { // 암호 해독

	String decrypt(String message);

}