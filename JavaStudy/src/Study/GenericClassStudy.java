package Study;

/*제네릭 클래스*/
public class GenericClassStudy<I, S> {
	private I memberNumber;
	private S memberName;
	

	public I getMemberNumber() {
		return memberNumber;
	}

	public void setMemberNumber(I memberNumber) {
		this.memberNumber = memberNumber;
	}

	public S getMemberName() {
		return memberName;
	}

	public void setMemberName(S memberName) {
		this.memberName = memberName;
	}
	
	/*제네릭 메서드*/
	public void Person(I age) {
		System.out.println(age);//20
	}

	public static void main(String[] args) {
		GenericClassStudy<Integer, String> member = new GenericClassStudy<Integer, String>();
		
		member.Person(20);
		
	}

}
