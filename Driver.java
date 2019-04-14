package xPloit;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;

public class Driver {

	public static void main(String[] args) {
		scrape("Skype");
		
        
	}
	
	private static String scrape(String companyName) {
		String url = "https://en.wikipedia.org/wiki/" + companyName;
        String returnVal = "";
        try {
			org.jsoup.nodes.Document doc = Jsoup.connect(url).get();
			Elements title = doc.getElementsByTag("table");
			System.out.println(title.get(0).child(1).child(3).child(1).children().text());
	        //System.out.println(title.toString());
		} catch (IOException e) {
			System.out.println("End");
			//e.printStackTrace();
		}
        return returnVal;
	}
	
	
}
