package Study;

public class HashCodeStudy {

	public static void main(String[] args) {
		
		/*HashCode : 객체의 주소를 기반으로 생성되는 정수 값 */
		HashCodeStudy study1 = new HashCodeStudy();
		HashCodeStudy study2 = new HashCodeStudy();
		HashCodeStudy study3 = study2;//study2라는 객체를 생성할 때 사용 된 주소가 study3에 그대로 사용 됨
		
		System.out.println("study1 : " + study1.hashCode());//키 : 366712642     값 : study1 
		System.out.println("study2 : " + study2.hashCode());//키 : 1829164700   값 : study2
		System.out.println("study3 : " + study3.hashCode());//키 : 1829164700   값 : study2
		
		/*String 클래스에 한해서는 고유의 값이 아님*/
		String str1 = "ABC123";
		String str2 = "ABC123";
		String str3 = "DEF456";
		
		System.out.println(str1.hashCode());//키 : 1923891888  값 : ABC123  
		System.out.println(str2.hashCode());//키 : 1923891888  값 : ABC123  
		System.out.println(str3.hashCode());//키 : 2012642256  값 : DEF456  
		
	}

}
