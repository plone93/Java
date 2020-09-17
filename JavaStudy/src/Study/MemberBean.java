package Study;

import java.io.Serializable;

public class MemberBean implements Serializable{
	private static final long serialVersionUID = 2545104744891989071L;//개발환경을 구분하는 ID, 미작성시 자동생성 됨

	private int memberNum;
	private String memberId;
	private String memberPass;
	private String memberPhone;
	private String memberAddress;
	private transient String memberName; //transient : 직렬화(Serializable) 제외
	
	//생성자
	public MemberBean(int memberNum, String memberId, String memberPass, String memberPhone, String memberAddress,
			String memberName) {
		super();
		this.memberNum = memberNum;
		this.memberId = memberId;
		this.memberPass = memberPass;
		this.memberPhone = memberPhone;
		this.memberAddress = memberAddress;
		this.memberName = memberName;
	}
	
	//getter, setter
	public int getMemberNum() {
		return memberNum;
	}

	public void setMemberNum(int memberNum) {
		this.memberNum = memberNum;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberAddress() {
		return memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	//toString
	@Override
	public String toString() {
		return "MemberBean [memberNum=" + memberNum + ", memberId=" + memberId + ", memberPass=" + memberPass
				+ ", memberPhone=" + memberPhone + ", memberAddress=" + memberAddress + "]";
	}
	
}
