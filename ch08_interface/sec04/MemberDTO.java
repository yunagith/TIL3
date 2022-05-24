package ch08_interface.sec04;

public class MemberDTO {
	// 필드
	private String memId;
	private String memPass;
	private String memName;
	private String memphone;
	private String memAddress;
	
	// 생성자
	public MemberDTO(String memId, String memPass, String memName, String memphone, String memAddress) {
		super();
		this.memId = memId;
		this.memPass = memPass;
		this.memName = memName;
		this.memphone = memphone;
		this.memAddress = memAddress;
	}
	
	//Getter&Setter
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPass() {
		return memPass;
	}
	public void setMemPass(String memPass) {
		this.memPass = memPass;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemphone() {
		return memphone;
	}
	public void setMemphone(String memphone) {
		this.memphone = memphone;
	}
	public String getMemAddress() {
		return memAddress;
	}
	public void setMemAddress(String memAddress) {
		this.memAddress = memAddress;
	}
}
