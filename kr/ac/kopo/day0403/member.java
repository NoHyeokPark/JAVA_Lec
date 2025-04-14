package kr.ac.kopo.day0403;

/*
 * 알트 쉬프트 s 누르고 + c => 기본생성자
 * 					 o => 매개변수 생성자
 *   				r => getter/setter 메소드
 * 					s => toString() 메소드
 * 					v => override 메소드
 * 
 * */

public class member {
    private String name;
    private String phone;
    private String addr;
	public member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public member(String name, String phone, String addr) {
		super();
		this.name = name;
		this.phone = phone;
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "member [name=" + name + ", phone=" + phone + ", addr=" + addr + "]";
	}

}
