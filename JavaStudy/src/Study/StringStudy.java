package Study;

public class StringStudy {

	public static void main(String[] args) {
		
		/*String*/
		String str = new String("hello");//hello
		System.out.println(str.hashCode());//메모리 주소 : 99162322
		str = str.concat(" world");//hello world
		System.out.println(str.hashCode());//메모리 주소 : 1794106052
		
		/*StringBuffer : 동기화 지원*/
		StringBuffer strBuffer = new StringBuffer("hello");//hello
		System.out.println(strBuffer.hashCode());//메모리 주소 : 366712642
		strBuffer.append(" world");//hello world
		System.out.println(strBuffer.hashCode());//메모리 주소 : 366712642
		
		/*StringBuilder : 동기화 미지원*/
		StringBuilder strBuilder = new StringBuilder("");//StringBuilder strBuilder = ""; X
		System.out.println(strBuilder.hashCode());//메모리 주소 : 1829164700
		strBuilder.append(" world");//hello world
		System.out.println(strBuilder.hashCode());//메모리 주소 : 1829164700
		
	}

}