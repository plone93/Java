package Study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternStudy {
	public static void main(String[] args) {
		String reg = "^[0-9]*$";//정규표현식
		String strValue = "ABC";//검사할 문자열
		
		// 결과를 true, false로 반환함
		System.out.println(Pattern.matches(reg, strValue));//Pattern클래스의 matches 메서드, 대상 문자열이 패턴과 일치하는지 검사
		System.out.println(reg.matches(strValue));//String클래스의 matches 메서드, 대상 문자열이 패턴과 일치하는지 검사
		
		// 결과를 true, false로 반환함
		Pattern pattern = Pattern.compile("^[0-9]*$");//주어진 정규표현식으로 패턴을 작성함
		Matcher matcher = pattern.matcher(strValue);//대상 문자열이 패턴과 일치하는지 검사
		System.out.println(matcher.find());
		
		//일본어
		String reg2 = "^[\\u3040-\\u309F]+$";
		String str = "あい";
		System.out.println(str.matches(reg2));
	}
}
