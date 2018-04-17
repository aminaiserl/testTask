import java.util.ArrayList;
import java.util.Iterator;


public class WordCounter implements Iterable<WordCount>{
	
	private ArrayList<WordCount> wordcounter;
	private ArrayList<String> words;
	
	public WordCounter(){
		wordcounter = new ArrayList<WordCount>();
		words = new ArrayList<String>();
	}
	
	public boolean isContained(String s){
		if (words.contains(s))
			return true;
		else 
			return false;
	}
	
	public int getIndex(String s){
		if(words.contains(s)){
			return words.indexOf(s);
		}
		else
			return -1;
	}
	
	public void increment(String s){
		if(words.contains(s)){
			wordcounter.get(this.getIndex(s)).increment();
		}
	} 
	
	public void add(String s){
		words.add(s);
		wordcounter.add(new WordCount(s));
	}

	@Override
	public Iterator<WordCount> iterator() {
		Iterator<WordCount> it = new Iterator<WordCount>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < wordcounter.size() && wordcounter.get(currentIndex) != null;
            }

            @Override
            public WordCount next() {
                return wordcounter.get(currentIndex++);
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
	}
	
}
