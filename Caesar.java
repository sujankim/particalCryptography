//A Java Program to illustrate Caesar Cipher Technique
class Caesar {
    // Encrypts text using a shift od s

    public static StringBuffer encrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        char ch;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
            } else {
                ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
            }

            result.append(ch);

        }
        return result;
    }

    public static StringBuffer decrypt(String text, int s) {
        StringBuffer result = new StringBuffer();
        char ch;
        for (int i = 0; i < text.length(); i++) {
            int x = -1;
            if (Character.isUpperCase(text.charAt(i))) {
                x = (((int) text.charAt(i) - 65));
                if (x == 0) {
                    x = 26 + 65 - s;
                } else if ((x+65)==(-65+s)%26+97) {
                    x = 32;
                } else {
                    x += 65;
                    x -= s;
                }

            } else {
                x = (((int) text.charAt(i) - 97));
                if (x == 0) {
                    x = 26 + 97 - s;
                } else {
                    x += 97;
                    x -= s;
                }
            }
            ch = (char) x;
            result.append(ch);

        }
        return result;
    }

    // Driver code
    public static void main(String[] args) {
        String text = "Hello KASUN";
        int s = 5;
        System.out.println("Text : " + text);
        System.out.println("Shift : " + s);
        String encrypt = encrypt(text, s).toString();
        System.out.println("Cipher: " +encrypt );
        System.out.println("Decrypt: "+decrypt(encrypt, s));

    }
}
