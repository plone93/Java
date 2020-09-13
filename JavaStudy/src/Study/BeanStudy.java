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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberAddress == null) ? 0 : memberAddress.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + memberNum;
		result = prime * result + ((memberPass == null) ? 0 : memberPass.hashCode());
		result = prime * result + ((memberPhone == null) ? 0 : memberPhone.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BeanStudy other = (BeanStudy) obj;
		if (memberAddress == null) {
			if (other.memberAddress != null)
				return false;
		} else if (!memberAddress.equals(other.memberAddress))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (memberNum != other.memberNum)
			return false;
		if (memberPass == null) {
			if (other.memberPass != null)
				return false;
		} else if (!memberPass.equals(other.memberPass))
			return false;
		if (memberPhone == null) {
			if (other.memberPhone != null)
				return false;
		} else if (!memberPhone.equals(other.memberPhone))
			return false;
		return true;
	}
	
	
}
