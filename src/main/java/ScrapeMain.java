import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * 
 * @author hiroto
 *
 */
public class ScrapeMain {
	public static void main(String[] args) throws IOException {
		String url = "https://github.com/";
		Document document = Jsoup.connect(url).get();
		Elements elements = document.select("h3");
		System.out.println(elements);
	}
}