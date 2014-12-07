package map;
import java.security.KeyStore.Entry;
import java.util.*;


public class Applymap {

	
	public static void main(String[] args) {
		
		
		UseMap usm= new UseMap();
		usm.addElementByMap("23", "mouse");
		
		
		Map<String, String> mapData = new HashMap<String,String>();
		mapData.put("123", "mouse");
		mapData.put("423", "kite");
	for(java.util.Map.Entry<String, String> entry:mapData.entrySet()){
			
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
		}
		List <String>list1 = new LinkedList<String>();
		list1.add("cool");
		list1.add("good boy");
		
		
		Map<String, List<String>> listData = new HashMap<String,List<String>>();
	listData.put("llll", list1);
for(java.util.Map.Entry<String, List<String>> entry:listData.entrySet()){
			
			System.out.println(entry.getKey()+" : "+ entry.getValue());
			
		}
		
	
		
		
	

	}

}
