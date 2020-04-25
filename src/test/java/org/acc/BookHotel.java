package org.acc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	public BookHotel() {
		PageFactory.initElements(driver, this);	
		}
@FindBy(id="first_name")
private WebElement firstName;

@FindBy(id="last_name")
private WebElement lastName;

@FindBy(xpath="//textarea[@id='address']")
private WebElement address;

@FindBy(xpath="//input[@id='cc_num']")
private WebElement cardnum;

@FindBy(id="cc_type")
private WebElement ccType;

@FindBy(id="cc_exp_month")
private WebElement month;

@FindBy(id="cc_exp_year")
private WebElement year;

@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement bookNow;

public WebElement getFirstName() {
	return firstName;
}

public WebElement getLastName() {
	return lastName;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCardnum() {
	return cardnum;
}

public WebElement getCcType() {
	return ccType;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getCvv() {
	return cvv;
}

public WebElement getBookNow() {
	return bookNow;
}
}
