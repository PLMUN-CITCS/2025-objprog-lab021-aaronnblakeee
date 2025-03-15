import java.util.Scanner;

public class Main {

    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = scanner.nextLine();  
        return sentence;
    }

    public static int countWords(String sentence) {
        // Split the sentence into words based on spaces
        String[] words = sentence.split("\\s+");  
        return words.length;  
    }

    public static void main(String[] args) {
        String sentence = getSentenceInput();

        int wordCount = countWords(sentence);

        System.out.println("The number of words in the sentence is: " + wordCount);
    }
} 
