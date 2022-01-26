import java.util.Scanner;

import javax.crypto.Cipher;

public class App {

	public static void main(String[] args) {
		//quick and dirty user input to visually check cipher functionality
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter in the text you would like to encrypt: ");
		String toEncrypt = scanner.nextLine();
		System.out.println("Now, please enter in the shiftkey. This is the numerical (alphabetical) distance between the original string and the encrypted text: ");
		int shifter = scanner.nextInt();
		System.out.println("After applying the cipher, your text is as follows:");
		//you can't just do RC.rotate(toEncrypt) because w/out instantiating the RC class, you would be statically calling a non-static method.
		RotationalCipher caesar = new RotationalCipher(shifter); 
		String answer = caesar.rotate(toEncrypt);
		System.out.println(answer);
	}

}
