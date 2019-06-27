import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;

import org.yaml.snakeyaml.Yaml;

/**
 * yamlを読み込んで解析する tamaまで辿り着いたけどかなりゴリゴリでスマートじゃない
 * 
 * @author hiroto
 *
 */
public class YamlMain {
	public static void main(String[] args) throws Exception {
		String path = "files/test.yml";
		String key = "value";
		String key2 = "item2";
		String key3 = "cat";

		Yaml y = new Yaml();
		try (InputStream in = Files.newInputStream(Paths.get(path))) {
			y.loadAll(in).forEach(s -> {
				LinkedHashMap<String, Object> sm = (LinkedHashMap<String, Object>) s;
//				for (Map.Entry<String, Object> entry : sm.entrySet()) {
//					System.out.println(entry.getKey() + " : " + entry.getValue());
//				}
				sm = (LinkedHashMap<String, Object>) sm.get(key);
				sm = (LinkedHashMap<String, Object>) sm.get(key2);
				System.out.println(sm.get(key3));
			});
		}
	}
}
