

import java.security.*;
import java.io.*;

public class SHA1 {
public static void main(String args[]) {
	
	System.out.println("First SHA Code");

	try {
		   String data = "Practical Cryptography";
		   byte dataBytes[] = data.getBytes();

		   MessageDigest md1 = MessageDigest.getInstance("SHA");
		   md1.update(dataBytes);
		   byte digest1[] = md1.digest();

		   System.out.println("Orig. digest: ");
		   for(byte b:digest1) System.out.format("%02x",b);
		   System.out.println("");

		   String data2 = "Practical Cryptography";
		   MessageDigest md2 = MessageDigest.getInstance("SHA");
		   md2.update(data2.getBytes());
		   byte digest2[] = md2.digest();

		   System.out.println("New digest: ");
		   for(byte b:digest2) System.out.format("%02x",b);
		   System.out.println("");

		   if(MessageDigest.isEqual(digest1,digest2))
		     System.out.println("Digest Verified");
		   else
		     System.out.println("Digest Verification failed!");



		  } catch (Exception e) {
		     System.out.println(e);
		  }
	
	System.out.println("Second SHA Code");
	
	try {
		   String data = "Sujan Lamichhane";
		   byte dataBytes[] = data.getBytes();

		   MessageDigest md1 = MessageDigest.getInstance("SHA");
		   md1.update(dataBytes);
		   byte digest1[] = md1.digest();

		   System.out.println("Orig. digest: ");
		   for(byte b:digest1) System.out.format("%02x",b);
		   System.out.println("");

		   String data2 = "Sujan Lamichhane";
		   MessageDigest md2 = MessageDigest.getInstance("SHA");
		   md2.update(data2.getBytes());
		   byte digest2[] = md2.digest();

		   System.out.println("New digest: ");
		   for(byte b:digest2) System.out.format("%02x",b);
		   System.out.println("");

		   if(MessageDigest.isEqual(digest1,digest2))
		     System.out.println("Digest Verified");
		   else
		     System.out.println("Digest Verification failed!");



		  } catch (Exception e) {
		     System.out.println(e);
		  }

 }

}
