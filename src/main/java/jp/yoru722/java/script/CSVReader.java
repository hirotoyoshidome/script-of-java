package jp.yoru722.java.script;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

public class CSVReader {
	public static void main(String[] args) throws IOException {
		// CSV読み込み処理
		Reader reader = Files.newBufferedReader(Paths.get("files/test.csv"));
		CsvToBean<CSVForm> csvToBean = new CsvToBeanBuilder<CSVForm>(reader).withType(CSVForm.class).build();
		List<CSVForm> items = csvToBean.parse();

		// java8移行のλ式
		items.forEach(i -> {
			System.out.println(i.getName());
		});
	}
}
