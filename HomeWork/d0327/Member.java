package HomeWork.d0327;

import java.util.Objects;

public class Member {
	private String id1;
	private int password;
	private String email;
	
	public Member() {}
	public Member(String id1, int password, String email) {
		super();
		this.id1 = id1;
		this.password = password;
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getId1() {
		return id1;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public int hashCode() {
		return id1.hashCode() + password;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id1, other.id1) && Objects.equals(password, other.password);
	}
	@Override
	public String toString() {
		String msg = "회원 이름\t: " + this.id1 + "\n이메일\t: " + this.email + "\n------------------------";
		return msg;
	}
	
	
}
