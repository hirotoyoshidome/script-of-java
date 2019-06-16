package jp.yoru722.java.script;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/**
 * 
 * @author hiroto GitHubのトップ画面をスクレイピングするサンプル
 */
public class ScrapeMain {
	public static void main(String[] args) throws Exception {
		String url = "https://github.com/";
		String tag = "a";
		Elements element = scrape(url, tag);

		// ループして一つずつ出力する
		for (int i = 0; i < element.size(); i++) {
			System.out.println(element.get(i).text());
		}
	}

	/**
	 * スクレイピングを実施する
	 * 
	 * @param url
	 * @param tag
	 * @return
	 * @throws Exception
	 */
	private static Elements scrape(String url, String tag) throws Exception {
		Document document = Jsoup.connect(url).get();
		Elements elements = document.select(tag);
		return elements;
	}
}