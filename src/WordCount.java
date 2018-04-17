
public class WordCount {
	
	private String word;
	private int count;
	
	public WordCount(String word){
		this.word = word;
		this.count = 1;
	}
	
	public void increment(){
		count++;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
