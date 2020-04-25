package org.acc;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelpage extends BaseClass{
	public SelectHotelpage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement radioButton;
	
	@FindBy(xpath="//input[@id=\"continue\"]")
	private WebElement continuebtn;

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}
