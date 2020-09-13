package Study;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListStudy {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(10);//리스트에 데이터를 넣어서 관리, 사이즈를 지정해도 초과하면 자동으로 늘어남
		List<String> vector = new Vector<String>();//arrayList와 동일하나 동기화를 지원
		
		/*ArrayList와 Vector는 동기화 유무 이외엔 차이가 없음*/
		arrayList.add("jony");//삽입
		arrayList.add(2, "kim");//n번째에 삽입
		arrayList.contains("jony");//리스트에 해당 데이터가 있는지 검색해서 true, false로 반환
		arrayList.size();//리스트의 사이즈를 반환
		arrayList.remove(2);//리스트 n번째에 있는 데이터 삭제
		arrayList.clear();//리스트 비우기
		
		/*LinkedList : header-node-node-node... */
		LinkedList<String> linkedList = new LinkedList<String>();//인접 노드의 연결(link)함, 연결된 전후 노드가 삭제되면 그 다음 노드에 연결함
		
		linkedList.add("jony");//삽입
		linkedList.add(2, "kim");//n번째에 삽입
		linkedList.addFirst("tim");//가장 처음(header)에 삽입
		linkedList.addLast("yamada");//가장 마지막에 삽입
		linkedList.size();//리스트의 사이즈를 반환
		
		linkedList.removeFirst();//가장 앞의 데이터 삭제
		linkedList.removeLast();//가장 뒤의 데이터 삭제
		linkedList.remove(2);//n번째 데이터 삭제
		linkedList.clear();//리스트 비우기
	}

}
