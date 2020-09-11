package Study;

public class BeanStudy {
	private int memberNum;
	private String memberId;
	private String memberPass;
	private String memberPhone;
	private String memberAddress;
	
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
	
	@Override
	public String toString() {
		return "BeanStudy [memberNum=" + memberNum + ", memberId=" + memberId + ", memberPass=" + memberPass
				+ ", memberPhone=" + memberPhone + ", memberAddress=" + memberAddress + "]";
	}
	
	
}
