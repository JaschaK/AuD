package teilleistung1.aufgabe3;


public class CharsSearch {
	
	/**
	 * Testet ob eine <code>char</code> Sequenz in einer anderen enthalten ist.
	 * 
	 * @param pattern Die zu testende Sequenz.
	 * @param word Das Wort, das die Sequenz <code>pattern</code> enthalten soll.
	 * 
	 * @return Ob <code>pattern</code> in <code>word</code> enthalten ist.
	 */
	protected boolean containsChars(final char[] pattern, final char[] word) {		
		boolean contains = false;
		for(int i=0;i<word.length;i++) {
			System.out.println(i+"ter Buchstabe wird verglichen...");
			if(word[i]==pattern[0]){
				System.out.println(i+"ter Buchstabe gefunden!");
				System.out.println(i+"ter Buchstabe wird verglichen");
				for(int j=1;j<pattern.length;j++){
					System.out.println(i+"ter Buchstabe gefunden!");
					System.out.println(i+1+"ter Buchstabe wird verglichen");
					if(word[i+1]==pattern[j]) {
						contains = true;
						i = i+1;
					} else {
						System.out.println("Unterschiedliche Buchstaben! Abbruch!");
					contains = false;	
					break;	
					}
				}
				if(contains==true) {
					System.out.println("Vergleich erfolgreich!");
					break;
				}
			}
			
		}
		return contains;
		// TODO
	}

	// Main-Methode zum Testen
	public static void main(String[] args) throws Exception {
		CharsSearch search = new CharsSearch();
		char[] pattern = new char[] {};
		char[] word = new char[] {};
		try {
		pattern = args[0].toCharArray();
		word = args[1].toCharArray();
		} catch (ArrayIndexOutOfBoundsException e) {
			if (pattern.length == 0 | word.length==0) {
				throw new RuntimeException("Pattern und Word dürfen nicht leer sein!");
			} 
		}
		if (pattern.length>word.length) {
			throw new RuntimeException("Pattern enthält mehr Zeichen als Word!");
			}
		
		
		if(search.containsChars(pattern, word)){
			System.out.println("'"+new String(pattern)+"' ist in '"+new String(word)+"' enthalten: Wahr");
		} else {
			System.out.println("'"+new String(pattern)+"' ist in '"+new String(word)+"' enthalten: Falsch");
		}
		// TODO
	}
}
