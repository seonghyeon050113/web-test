package com.web.dto;

public class gameInfoDTO {
	private int giNum;
	private String giName;
	private String giGenre;
	private String giDesc;
	private int giPrice;
	public int getGiPrice() {
		return giPrice;
	}
	public void setGiPrice(int giPrice) {
		this.giPrice = giPrice;
	}
	public int getGiNum() {
		return giNum;
	}
	public void setGiNum(int giNum) {
		this.giNum = giNum;
	}
	public String getGiName() {
		return giName;
	}
	public void setGiName(String giName) {
		this.giName = giName;
	}
	public String getGiGenre() {
		return giGenre;
	}
	public void setGiGenre(String giGenre) {
		this.giGenre = giGenre;
	}
	public String getGiDesc() {
		return giDesc;
	}
	public void setGiDesc(String giDesc) {
		this.giDesc = giDesc;
	}
	@Override
	public String toString() {
		return "gameInfoDTO [giNum=" + giNum + ", giName=" + giName + ", giGenre=" + giGenre + ", giDesc=" + giDesc
				+ ", giPrice=" + giPrice + "]";
	}
	
}
