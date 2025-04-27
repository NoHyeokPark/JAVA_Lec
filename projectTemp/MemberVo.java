package projectTemp;

import java.util.List;

public class MemberVo {
	private String id;
	private String password;
	private String name;
	private String birthDay;
	private int gender;
	private String mobile;
	private String e_mail;
	private int cash;
	private List<AddressVO> AddressList;

	public MemberVo() {

	}

	public MemberVo(String id, String password, String name, String birthDay, int gender, String mobile,
			String e_mail) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.birthDay = birthDay;
		this.gender = gender;
		this.mobile = mobile;
		this.e_mail = e_mail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

}
