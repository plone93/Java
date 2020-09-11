package Study;

public class BeanStudy2 {

	public static void main(String[] args) {
		BeanStudy beanStudy = new BeanStudy();//객체 생성
		/*값 입력, setter를 사용해 입력한다*/
		beanStudy.setMemberNum(1);
		beanStudy.setMemberId("abc123");
		beanStudy.setMemberPass("123");
		beanStudy.setMemberPhone("111-1111-1111");
		
		/*값 출력, getter를 사용해 값을 출력한다*/
		System.out.println("memberNumber : " + beanStudy.getMemberNum());
		System.out.println("memberId" + beanStudy.getMemberId());
		System.out.println("memberBean : " + beanStudy.toString());
	}

}
