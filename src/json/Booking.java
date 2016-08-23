package json;

class Booking {

	private Long id;
	private String bookingName;

	public Booking() {
	}

	public Booking(Long id, String bookingName) {
		this.id = id;
		this.bookingName = bookingName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getBookingName() {
		return bookingName;
	}

	public void setBookingName(String bookingName) {
		this.bookingName = bookingName;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookingName=" + bookingName + "]";
	}

}
