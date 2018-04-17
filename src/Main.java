import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("text.txt"));
			String text = "";
			String line = reader.readLine();
			
			while (line != null) {
				text += line;
				line = reader.readLine();
			}
			text = text.replaceAll("[.,!?\\-‘’:—…]","");
			text = text.toLowerCase();
			System.out.println(text);
			StringTokenizer strTok = new StringTokenizer(text, " ");
			WordCounter wc = new WordCounter();
			
			while (strTok.hasMoreTokens()) {
				String temp = strTok.nextToken();
				if ( !wc.isContained(temp)){
					wc.add(temp);
				}
				else {
					wc.increment(temp);
				}
				
			}
			for (WordCount s : wc){
				System.out.println(s.getWord() + " " + s.getCount());
			}
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
