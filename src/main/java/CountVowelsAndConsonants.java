//Count Vowels and consonants from a word
//Input: Dhaka
//Output:
//Vowel: 2
//Consonant: 3

public class CountVowelsAndConsonants {
    void count(String str){
        int vowels=0;
        int consonent=0;
        str=str.toUpperCase();
        for(int i=0 ; i<str.length() ; i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vowels++;
                }
                else{
                    consonent++;
                }
            }
        }
        System.out.println("Number of Vowels: "+vowels);
        System.out.println("Number of Consonents: "+consonent);
    }

    public static void main(String[] args) {
        CountVowelsAndConsonants cv=new CountVowelsAndConsonants();
        String str="Dhaka";
        cv.count(str);
    }
}
