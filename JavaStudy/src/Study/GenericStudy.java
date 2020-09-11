package Study;

import java.util.ArrayList;
import java.util.List;

public class GenericStudy {

	public static void main(String[] args) {
		List<String> arrStr = new ArrayList<String>();//String타입만 담을 수 있는 List
		List<Integer> arrInt = new ArrayList<Integer>();//Integer타입만 담을 수 있는 List
		List<BeanStudy> list = new ArrayList<BeanStudy>();//BeanStudy라는 객체만 담을 수 있는 List

	}

}
