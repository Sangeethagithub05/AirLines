package org.acc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelpage extends BaseClass {
	public SearchHotelpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement Hotels;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomNo;
	
	@FindBy(xpath="//input[@id='datepick_in']")
	private WebElement checkInDate;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	private WebElement checkOutDate;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adultRoom;
	
	@FindBy(xpath="//select[@id='child_room']")
	private WebElement childRoom;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submitbtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	}
