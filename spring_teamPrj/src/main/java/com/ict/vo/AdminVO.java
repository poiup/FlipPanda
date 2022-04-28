package com.ict.vo;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AdminVO {
	private int adminNum;
	private String adminId;
	private String adminPw;
	private int endAuction;
	private int auctionInProgress;
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	public void setEndAuction(int endAuction) {
		this.endAuction = endAuction;
	}
	public void setAuctionInProgress(int auctionInProgress) {
		this.auctionInProgress = auctionInProgress;
	}
}
