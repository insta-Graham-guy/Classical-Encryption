# Classical-Encryption
Examples of classical encryption techniques.  These are not good for practical use of protecting digital data, but they are examples of how encryption can work.

**Disclaimer** This code should not be used for encrypting sensitive data.  This project serves to implement code of various ciphers, some of which are pre-digital age methods.  For more information on more secure methods, users should look at something like AES-256 (https://www.nist.gov/publications/advanced-encryption-standard-aes). 

1) Vigenere_cipher.java
  -> This is a Java file, meaning that you will need to run 'javac Vigenere_cipher.java' to compile the code, and then you can run it.
  
  When ready to run, users are prompted (via a Scanner) the following prompt.  'e' or 'encrypt' will trigger a prompt to enter plaintext. 
  <img width="352" alt="image" src="https://user-images.githubusercontent.com/70147377/109210310-a7364800-777a-11eb-98bf-75374ff836d3.png">
  
  Similarly, 'd' or 'decrypt' will trigger a prompt to enter ciphertext.  The key should be the same in each case.  
  <img width="364" alt="image" src="https://user-images.githubusercontent.com/70147377/109210360-b5846400-777a-11eb-96d9-8927c44893ef.png">

  Finally, this code does not accept numerical values or special values, and it will convert all capital letters to lowercase.  
  It also will replace spaces entered into the text with alternative characters. 

  To test that your program gives the correct output and is working correctly, take your ciphertext output from encryption and reenter it when you type 'decrypt' or 'd'.  You should get the plaintext you started with.
