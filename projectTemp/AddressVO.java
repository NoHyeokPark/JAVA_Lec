package projectTemp;

public class AddressVO {
	private String adName;
	private String address;
	private String no;

	public AddressVO() {
	}

	public AddressVO(String adName, String address, String no) {
		super();
		this.adName = adName;
		this.address = address;
		this.no = no;
	}

	public String getAdName() {
		return adName;
	}

	public void setAdName(String adName) {
		this.adName = adName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

}
