/**
 * Created by classuser29 on 30.06.2017.
 */
import java.util.Scanner;


public class WordMaker {
    public String getWord(){
        Scanner inputWord = new Scanner(System.in);
        System.out.println("Input your word");
        String word;
        word = inputWord.nextLine();
        return word;
    }
    public void printWord(String word){
        System.out.println("Your word is :" );
        for(int i=0;i< word.length(); i++ ){
            if(word.charAt(i) == 'j' || word.charAt(i)== 'J')
                printJ();
            else if (word.charAt(i) == 'a' || word.charAt(i)== 'A')
                printA();
            else
                        printV();
        }
    }
    public void printA(){
        System.out.println("       A");
        System.out.println("      AA");
        System.out.println("     A A");
        System.out.println("    A  A");
        System.out.println("   AAAAA");
        System.out.println("  A    A");

    }
    public void printJ(){
        System.out.println("       J");
        System.out.println("       J");
        System.out.println("       J");
        System.out.println("       J");
        System.out.println("JJ    J ");
        System.out.println("  JJJJ  ");

    }
    public void printV(){
        System.out.println("V      V");
        System.out.println("V      V");
        System.out.println("V      V");
        System.out.println(" V    V ");
        System.out.println("  V  V  ");
        System.out.println("    V   ");

    }

    public static void main(String[] args) {
        WordMaker wordMaker = new WordMaker();
        String word = wordMaker.getWord();
        wordMaker.printWord(word);
    }
}
