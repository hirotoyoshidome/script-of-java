package jp.yoru722.java.script;

import lombok.Data;

/**
 * eclipseで開発を実施する場合はeclipse側にlombokを読み込ませる必要がある
 * 
 * @author hiroto
 *
 */
@Data
public class CSVForm {
	private String name;
	private String age;
	private String gender;
}
