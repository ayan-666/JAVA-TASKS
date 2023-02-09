//Encrypt word when A=F
//Input: Apple
//Output: Fuuqj
public class EncryptWord {
    public static void main(String[] args) {

        String str="Apple";
        System.out.println("Before Encrypt: "+str);
        System.out.print("After Encrypt: ");
        int key=5;
        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
            int ascii=ch+key;
            char c=(char)ascii;//After Encrypt
            System.out.print(c);
        }
    }
}
