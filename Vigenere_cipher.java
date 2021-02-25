import java.util.Scanner;

public class Vigenere_cipher {
    
    public static String get_plaintext() {
        //Get plaintext from input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter plaintext to encrypt: ");
        String my_response = sc.nextLine();
        return my_response;
    }
    
    public static String get_key() {
        //Get key from input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key to use for encryption AND decryption: ");
        String my_key = sc.nextLine();
        return my_key;
    }
    
    public static String encrypt(String plaintext, String my_key, char[] alphabet_chars) {
        //Encrypt the plaintext with the key
        plaintext = plaintext.toLowerCase();
        my_key = my_key.toLowerCase();

        
        
        int counter = 0;
        int current_val, key_val, product_val;
        String ciphertext = "";
        char current, curr_key, product;
        //Main loop to encrypt
        for (int i = 0; i < plaintext.length(); i++) {
            current = plaintext.charAt(i);
            //System.out.println(current);
            current_val = (int)current;
            curr_key = my_key.charAt(counter);
            //System.out.println(curr_key);
            key_val = (int) curr_key;
            product_val = key_val + current_val;
            product_val = product_val - 96;
            if (product_val > 122) {
                product_val = product_val - 26;
            }
            product = (char) product_val;
            counter++;
            ciphertext = ciphertext + product;
            if (counter >= my_key.length()) {
                counter = 0;  
            }
        }
        System.out.println(ciphertext); 
        return ciphertext;
    }

    public static String get_ciphertext() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ciphertext to decrypt:");
        String my_response = sc.nextLine();
        return my_response;
    }
    
    public static String decrypt(String ciphertext, String key, char[] alphabet_chars) {
        //Decrypt ciphertext using same key to encrypt
        ciphertext = ciphertext.toLowerCase();
        key = key.toLowerCase();
        int j, counter = 0; 
        int current_val, key_val, product_val;
        String plaintext = "";
        char current, curr_key, product;
        //Main loop to decrypt
        for (int i=0; i < ciphertext.length(); i++) {
            current = ciphertext.charAt(i);
            current_val = (int)current;
            curr_key = key.charAt(counter);
            key_val = (int)curr_key;
            product_val = current_val - key_val;
            product_val = product_val + 96;
            if (product_val < 97) {
                product_val = product_val + 26;
            }
            product = (char)product_val;
            counter++;
            plaintext = plaintext + product;
            if (counter >= key.length()) {
                counter = 0;
            }
        }
        System.out.println(plaintext);
        return plaintext;
    }
    public static void main(String[] args) {

        //Set up letter system
        char[] alphabet_chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        Scanner sc = new Scanner(System.in);  
        System.out.println("Would you like to encrypt or decrypt?");
        String cmd = sc.nextLine();
        cmd = cmd.toLowerCase();
        //System.out.println(cmd);
        if (cmd.equals("encrypt") | cmd.equals("e")) {
            String my_plaintext = get_plaintext();
            String my_key = get_key();
            encrypt(my_plaintext, my_key, alphabet_chars);

        } else if (cmd.equals("decrypt") | cmd.equals("d")) {
            String my_ciphertext = get_ciphertext();
            String my_key = get_key();
            decrypt(my_ciphertext, my_key, alphabet_chars);
        }

    }
}
