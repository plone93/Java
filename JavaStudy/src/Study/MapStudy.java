package Study;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapStudy {

	public static void main(String[] args) {
		
		/*HashMap<key, value>  동기화(Synchronization) 미지원*/
		HashMap<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("name", "jony");//키와 값을 저장
		hashMap.get("name");//해당 키의 값을 리턴
		
		System.out.println("HashMap");
		System.out.println(hashMap.size());//.size() : 해당 맵의 키/값의 수를 리턴
		System.out.println(hashMap.containsKey("name"));//.containsKey(키) : 해당 키를 가지고 있다면 true 없다면 false
		System.out.println(hashMap.containsValue("jony"));//.containsValue(값) : 해당 값을 가지고 있다면 true 없다면 false
		System.out.println(hashMap.isEmpty());//.isEmpty() : 맵이 비어있다면 true 아니면 false
		
		hashMap.remove("name");//해당키와 값을 제거
		hashMap.clear();//모든 키와 값을 제거

		
		/*HashTable<key, value>   동기화(Synchronization) 지원*/
		Hashtable<String, Object> hashTable = new Hashtable<String, Object>();
		BeanStudy bean = new BeanStudy();//Bean(DTO, VO) 생성
		
		/*Object는 자바 최상위 Class, Integer, String, Object를 담을 수 있음*/
		hashTable.put("member", bean);//키와 값을 저장
		hashTable.get("member");//해당 키의 값을 리턴
		
		System.out.println("HashTable");
		System.out.println(hashTable.size());//.size() : 해당 맵의 키/값의 수를 리턴
		System.out.println(hashTable.containsKey("member"));//.containsKey(키) : 해당 키를 가지고 있다면 true 없다면 false
		System.out.println(hashTable.containsValue(bean));//.containsValue(값) : 해당 값을 가지고 있다면 true 없다면 false
		System.out.println(hashTable.isEmpty());//.isEmpty() : 맵이 비어있다면 true 아니면 false
		
		hashTable.remove("member");
		hashTable.clear();
		
		SortedMap<String, String> sortedMap = new TreeMap<String, String>();
	}

}
