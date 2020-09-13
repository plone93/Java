package Study;

public class IndexOfStudy {

	public static void main(String[] args) {
		/*String 클래스는 문자를 배열에 넣어 문자열을 만들기 때문에 0번부터 시작*/
		String str = "ABCDE-123C45"; //0~10
		
		System.out.println(str.indexOf("C") + "번째");//2번째
		System.out.println(str.indexOf("C", 4) + "번째");//"C"를 4번째 이후부터 찾아라 : 9번째
		System.out.println(str.indexOf("-") + "번째");//5번째
		System.out.println(str.indexOf(","));//-1, 찾지 못했을 경우 -1을 반환함

	}

}
