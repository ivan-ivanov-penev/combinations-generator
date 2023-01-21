public class CombinationsGenerator {

	static final char[] CHARS = {
			'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
			'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
			'0','1','2','3','4','5','6','7','8','9',
			'!','*','#','@','$','&','%'
	};

	static final int MAX_LENGTH = 3;

	public static void main(String[] args) {

		for (int i = 0; i < MAX_LENGTH; i++) {

			printCombinations(i + 1);
		}
	}

	static void printCombinations(int length) {

		int[] charIndexes = new int[length]; // the array is filled with zeros by default

		do {

			printCurrentCombination(charIndexes);
		}
		while (incrementCharIndexes(charIndexes));
	}

	static void printCurrentCombination(int[] charIndexes) {

		StringBuilder combination = new StringBuilder();

		for (int i : charIndexes) {

			combination.append(CHARS[i]);
		}

		System.out.println(combination);
	}

	static boolean incrementCharIndexes(int[] charIndexes) {

		int charIndexToIncrement = charIndexes.length;

		do {

			charIndexToIncrement--;

			if (charIndexToIncrement < 0) {

				return false;
			}

			charIndexes[charIndexToIncrement]++;
		}
		while (charIndexes[charIndexToIncrement] == CHARS.length);

		for (int i = charIndexToIncrement + 1; i < charIndexes.length; i++) {

			charIndexes[i] = 0;
		}

		return true;
	}
}