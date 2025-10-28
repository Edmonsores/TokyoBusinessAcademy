/*
 * P-105
 */
import java.util.HashMap;
public class List05_04 {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("first name", "太郎");
		map.put("last name", "山田");
		map.put("address", "茨城県つくば市 999-99-99");
		map.put("tel", "029-000-0000");
		
		System.out.println(map.entrySet());
		System.out.println(map.values());
		System.out.println(map.keySet());
		System.out.println(map.get("first name"));
		System.out.println(map.get("last name"));
		System.out.println(map.get("address"));
		System.out.println(map.get("tel"));
		System.out.println(map.get("e-mail"));
		
	}

}
