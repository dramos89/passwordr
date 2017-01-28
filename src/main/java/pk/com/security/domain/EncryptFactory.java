package pk.com.security.domain;

import org.primefaces.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncryptFactory {


    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = "ADBSJHJS12547896".getBytes();

    public static void main(String args[]) throws Exception {
        String encriptValue = encrypt("dude5");
        decrypt(encriptValue);

    }

    /**
     * @param args
     * @throws Exception
     */

    public static String encrypt(String valueToEnc) throws Exception {

    	SecretKeySpec key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.ENCRYPT_MODE, key);

        System.out.println("valueToEnc.getBytes().length "+valueToEnc.getBytes().length);
        byte[] encValue = c.doFinal(valueToEnc.getBytes("UTF-8"));
        System.out.println("encValue length" + encValue.length);
		byte[] encryptedByteValue = encValue;
        String encryptedValue = encryptedByteValue.toString();
        System.out.println("encryptedValue " + encryptedValue);

        return encryptedValue;
    }

    public static String decrypt(String encryptedValue) throws Exception {
    	SecretKeySpec key = generateKey();
        Cipher c = Cipher.getInstance(ALGORITHM);
        c.init(Cipher.DECRYPT_MODE, key);

        System.out.println("encryptedValue.getBytes()"+encryptedValue.getBytes("UTF-8").length);
        byte[] enctVal = c.doFinal(encryptedValue.getBytes("UTF-8"));
        System.out.println("enctVal length " + enctVal.length);

		byte[] decordedValue = enctVal;

        return new String (decordedValue);
    }

    private static SecretKeySpec generateKey() throws Exception {
    	SecretKeySpec key = new SecretKeySpec(keyValue, ALGORITHM);
        return key;
    }

}
