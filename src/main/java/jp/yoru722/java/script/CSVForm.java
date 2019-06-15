package jp.yoru722.java.script;

import com.opencsv.bean.CsvBindByName;

import lombok.Data;

/**
 * eclipseで開発を実施する場合はeclipse側にlombokを読み込ませる必要がある
 * 
 * @author hiroto
 *
 */
// eclipseに読み込ませないと使用できないためgetter, setter書く
@Data
public class CSVForm {
	@CsvBindByName(column = "id", required = true)
	private String id;
	@CsvBindByName(column = "name", required = true)
	private String name;
	@CsvBindByName(column = "price", required = true)
	private String price;
	@CsvBindByName(column = "num", required = true)
	private String num;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}
}
