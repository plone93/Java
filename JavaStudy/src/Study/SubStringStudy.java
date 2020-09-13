package Study;

public class SubStringStudy {

	public static void main(String[] args) {
		
		/*순서를 기준으로 나누기*/
		String str1 = "012345";//0~5, String 클래스는 문자를 배열에 넣어 문자열을 만들기 때문에 0번부터 시작
		str1.substring(3);//3번째 이후 문자열을 반환
		str1.substring(1, 5);//1번부터 5번 사이의 문자열을 반환 : 1234
		System.out.println(str1.substring(1, 5));//1234

	
		/*특정 문자를 기준으로 나누기*/
		String str2 = "010-1111-2222";
		String[] arrStr = str2.split("-");//-를 기준으로 나누기, arrStr = [[010],[1111],[2222]]

		for(int i=0; i<arrStr.length; i++) {
			System.out.println("arrStr["+i+"] : "+arrStr[i]);
		}
			
	}

}
