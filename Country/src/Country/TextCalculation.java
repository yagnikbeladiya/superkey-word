package Country;

public class TextCalculation {
	
	
	    public int countCharacters(String text) {
	        if (text == null) {
	            return 0;
	        }
	        return text.length();
	    }


	    public int countWords(String text) {
	        if (text == null || text.isEmpty()) {
	            return 0;
	        }
	        String[] words = text.split("\\s+");
	        return words.length;
	    }
	}


