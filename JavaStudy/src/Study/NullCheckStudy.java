package Study;

public class NullCheckStudy {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = null;
		

		/* == null */
		if(str1 == null) {//에러 : deadCode
			System.out.println("check1-1");
		}
		if(str2 == null) {//정상
			System.out.println("check1-2");
		}
		
		/* .isEmpty() */
		if(str1.isEmpty()) {//정상
			System.out.println("check2-1");
		}
		if(str2.isEmpty()) {//에러 : NullPointerException
			System.out.println("check2-2");
		}
		
		/* .equals() */
		if(str1.equals("")) {//정상
			System.out.println("check3-1");
		}
		if(str2.equals("")) {//에러 : equals()는 공백검사만 가능하며 null검사는 불가능
			System.out.println("check3-1");
		}
		
		/* length() == 0 */
		if(str1.length() == 0) {//정상
			System.out.println("check4-1");
		}
		if(str2.length() == 0) {//NullPointerException
			System.out.println("check4-2");
		}
		

	}

}
