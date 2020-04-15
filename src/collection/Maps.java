package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


/*MAPS: Key, Value
MAPS: HashMap, LInkedMap, TreeMap
key's value is unique so if there is a duplicate then Map will take the latest value for that key

IQ: What is the diff between HashMap/LinkedMap/TreeMap
I used HashMap more as i didn't have to sort. it prints random. BUt if i had to 
 how i put it then
i used LinkedHashMap are sorted as we input them. and if we need to sort them then I used TreeMap is sorted by keys. 

IO: Have you ever used map? for example, when we have pair values we use map
name and AC etc. 
which collection you use the most? list/set/map? list is the most used.

IQ: Among all the maps, which one is faster? HashMap as it is random. 
*/

public class Maps {

	public static void main(String[] args) {

//hashmap	
		Map<String, String> hm = new HashMap<String, String>();
		hm.put("A", "Apple");
		hm.put("B", "Bread");
		System.out.println(hm.get("B"));
		hm.put("C", "Candy");
		hm.put("D", "Dates");
		hm.put("B", "Egg");
		hm.put("F", "Fondu");
		
		System.out.println(hm);//printing whole object, it will print random
		System.out.println(hm.get("C"));//printing one item by key
//linkedhashmap		
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
		lhm.put('H', 1);
		lhm.put('A', 2);
		lhm.put('B', 3);
		lhm.put('D', 4);
		lhm.put('B', 5);
		lhm.put('L', 6);
		System.out.println("===================================="); 
		System.out.println(lhm);//printing whole object and will print as we input them
		System.out.println(lhm.get('B'));//printing one item by key
//TreeMap
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		tm.put('H', 1);
		tm.put('A', 2);
		tm.put('B', 3);
		tm.put('D', 4);
		tm.put('B', 5);
		tm.put('L', 6);
		System.out.println("====================================");
		System.out.println(tm);//printing whole object will print sorted by key values
		System.out.println(tm.get('B'));//printing one item by key

	}

}
