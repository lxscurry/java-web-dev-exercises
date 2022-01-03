package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, \n and of having nothing to do: once or twice she had peeped into the book her sister \n was reading, but it had no pictures or conversations in it, 'and what is the use of a book,'\n thought Alice 'without pictures or conversation?";
        System.out.println(sentence);
        System.out.println("Enter a term to search:");
        String term = input.nextLine();
        String sentenceLow = sentence.toLowerCase();
        String termLow = term.toLowerCase();
        boolean result = sentenceLow.contains(termLow);

        int termLength = term.length();
        int termIndex = sentenceLow.indexOf(termLow);
        System.out.println("Word length is: " + termLength + " with index of: " + termIndex);
        input.close();
        String sentenceMinusWord = sentence.substring(0,termIndex).trim() + sentence.substring(termIndex + termLength);
        System.out.println(sentenceMinusWord);
    }

}
