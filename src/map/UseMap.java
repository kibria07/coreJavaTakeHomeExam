package map;
import java.security.KeyStore.Entry;
import java.util.*;



	public class UseMap {
		
		//Implement a method which can add data into a Map
		public void addElementByMap(String key,String value){
			   Map<String, String> map = new LinkedHashMap<String, String>();
			    map.put("1","one");
			    map.put("2","two");
			    map.put("3","three");
			    map.put("4","four");
			    
			    //System.out.println(getKeyFromValue(map,"three"));
			  }

			
		
	/*public List<String> getListOfUSACityNames(){
		List<String> list = new ArrayList<String>();
		list.add("New York");
		list.add("Boston");
		list.add("Denver");
		
		return list;
		
	}*/
	/*Map<String, List<String>> map = new LinkedHashMap<String,List<String>>();
	map.put("USA", listOfUSA.getListOfUSACityNames());
	map.put("UK", listOfUK);
	map.put("Canada", listOfCanada);
	
	for(Entry<String, List<String>> entry:map.entrySet()){
		
		System.out.println(entry.getKey()+" : "+ entry.getValue());
		
	}*/
		
		/*Implement a method that can retrieve data from a Map and it will return data containing in a Map
		 * Use while loop to iterate through
		 */
		
		public Map<String, String> getDataByMap(Map<String,String>map){
		Map<String,String>mapData = new HashMap<String,String>();
			
			
		
			
			return map;
		
	}
		/*Implement a method that can retrieve data from a Map contains List and it will return data containing in a Map
		 * Use for loop to iterate through
		 */
			
			public Map<String, List<String>> getDataByMapList(Map<String,List<String>> list){
				Map<String, List<String>> listData = new HashMap<String,List<String>>();
				 
				for(java.util.Map.Entry<String, List<String>> entry:listData.entrySet()){
					
					System.out.println(entry.getKey()+" : "+ entry.getValue());
					
				}
				return listData;
			}



			public void getDataByMapList(String string, List<String> list1) {
				// TODO Auto-generated method stub
				
			}

	}



