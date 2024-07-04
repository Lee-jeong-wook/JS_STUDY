package vo;

import java.sql.Date;

public class ReturnVO {
	private Date rent_ymd;
	private String rent_no;
	private String rent_book;
	private int rent_rent;
	private Date close_ymd;
	private Date return_ymd;
	private String return_fg;
	public Date getRent_ymd() {
		return rent_ymd;
	}
	public void setRent_ymd(Date rent_ymd) {
		this.rent_ymd = rent_ymd;
	}
	public String getRent_no() {
		return rent_no;
	}
	public void setRent_no(String rent_no) {
		this.rent_no = rent_no;
	}
	public String getRent_book() {
		return rent_book;
	}
	public void setRent_book(String rent_book) {
		this.rent_book = rent_book;
	}
	public int getRent_rent() {
		return rent_rent;
	}
	public void setRent_rent(int rent_rent) {
		this.rent_rent = rent_rent;
	}
	public Date getClose_ymd() {
		return close_ymd;
	}
	public void setClose_ymd(Date string) {
		this.close_ymd = string;
	}
	public Date getReturn_ymd() {
		return return_ymd;
	}
	public void setReturn_ymd(Date return_ymd) {
		this.return_ymd = return_ymd;
	}
	public String getReturn_fg() {
		return return_fg;
	}
	public void setReturn_fg(String return_fg) {
		this.return_fg = return_fg;
	}
	
}
