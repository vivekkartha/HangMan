
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;
    private String formedWord = "";

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
    	if(guessedLetters.contains(letter));
    	else if(word.contains(letter) == false) numberOfFaults++;
    	if(guessedLetters.contains(letter) == false) guessedLetters += letter;
    	if(word.contains(letter)) formedWord += letter;

		// program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens

        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
		String hidWord = "";

		for(int i=0;i<word.length();i++){
    		hidWord += "_";
		}

		for(int i=0;i<formedWord.length();i++) {
			String character = "" + formedWord.charAt(i);
			if (word.contains(character)){
				word.indexOf(character);
			};
		}
		return hidWord;
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        //return "";
    }
}
