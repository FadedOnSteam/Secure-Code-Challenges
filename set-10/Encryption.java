public class Encryption{
//**Most common encryption protocals**
/*
1. Triple DES(data encryption algorithm): designed to replace the original DES algorithm which hackers eventually learned to 
break rather easily. At one point, triple DES was the industry standard and the most widely used algorithm, 
uses three individual keys with 56 bits each.

2. AES(advanced encryption standard): algorithm tusted as the standard by the U.S government. 
Considered to be impervious to all attacks. 
AES uses keys of 192 and 256 bits for heavy-duty encryption purposes

3. RSA: considered the standard for encrpyting data sent over the internet.
Considered to be an asymmetric algorithm (unlike triple DES) because it uses a public key to encrypt a message and a private key to decrypt

4.Blowfish: another algorithm designed to replace DES. This algorithm is a symmetric cipher that splits messages into blocks of 64 bits and

encrypts them individually. Known for its speed and effectivness. Found in softwares such as e commerce platforms for securing payments 
and also used in password management tools.

*/
SecretKeySpec key = new SecretKeySpec("password".getBytes(), "DES");
Cipher cipher = Cipher.getInstance("DES");
cipher.init(Cipher.ENCRYPT_MODE, key);
byte[] encrypted = cipher.doFinal("secret data".getBytes());
}
