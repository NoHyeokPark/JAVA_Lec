package projectTemp;

public class OrderListVO {
	private String invoice_no;
	private String book_cd;
	private String order_nm;
	private String outboundDate;
	private String status;
	private int orderQTY;
	private String id;

	public OrderListVO() {
	}

	public OrderListVO(String invoice_no, String book_cd, String order_nm, String status, int orderQTY, String id) {
		super();
		this.invoice_no = invoice_no;
		this.book_cd = book_cd;
		this.order_nm = order_nm;
		this.status = status;
		this.orderQTY = orderQTY;
		this.id = id;
	}

	public OrderListVO(String invoice_no, String book_cd, String order_nm, String outboundDate, String status,
			int orderQTY, String id) {
		super();
		this.invoice_no = invoice_no;
		this.book_cd = book_cd;
		this.order_nm = order_nm;
		this.outboundDate = outboundDate;
		this.status = status;
		this.orderQTY = orderQTY;
		this.id = id;
	}

	public String getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(String invoice_no) {
		this.invoice_no = invoice_no;
	}

	public String getBook_cd() {
		return book_cd;
	}

	public void setBook_cd(String book_cd) {
		this.book_cd = book_cd;
	}

	public String getOrder_nm() {
		return order_nm;
	}

	public void setOrder_nm(String order_nm) {
		this.order_nm = order_nm;
	}

	public String getOutboundDate() {
		return outboundDate;
	}

	public void setOutboundDate(String outboundDate) {
		this.outboundDate = outboundDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getOrderQTY() {
		return orderQTY;
	}

	public void setOrderQTY(int orderQTY) {
		this.orderQTY = orderQTY;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
