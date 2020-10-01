package Study;

public class PatternStudy2 {
	
	static final String ENGLISH_CODES = "a-zA-Z"; //영문자
	static final String KOREA_CODES = "가-힣"; //한글
	static final String NUMBER_CODES = "0-9"; //숫자
	static final String HIRAGANA_CODES = "\\u3040-\\u309F"; //히라가나
	static final String KATAKANA_CODES = "\\u30A0-\\u30FF"; //가타카나
	
	//지정한 문자만 허용하는 정규표현을 반환함
	public static String toMatchRegex(String codes) {
		return "^[" + codes + "]+$";
	}
	
	//지정 문자 이외만 허용하는 정규표현을 반환함
	public static String toNotMatchRegex(String codes) {
		return ".*[^" + codes + "].*";
	}
	
	public static void main(String[] args) {
		String str1 = "안녕하세요123";
		String str2 = "あいうえABC123";
		
		//지정한 문자만 허용하는 정규표현을 반환함
		System.out.println(str1.matches(toMatchRegex(KOREA_CODES + NUMBER_CODES)));
		System.out.println(str2.matches(toMatchRegex(HIRAGANA_CODES + ENGLISH_CODES + NUMBER_CODES)));
		
		//지정 문자 이외만 허용하는 정규표현을 반환함
		System.out.println(str1.matches(toNotMatchRegex(KOREA_CODES + NUMBER_CODES)));
		System.out.println(str2.matches(toNotMatchRegex(HIRAGANA_CODES + ENGLISH_CODES + NUMBER_CODES)));
	}

}
