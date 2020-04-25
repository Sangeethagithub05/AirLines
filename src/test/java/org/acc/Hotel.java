package org.acc;

import org.openqa.selenium.WebDriver;

public class Hotel extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadurl("https://www.adactin.com/HotelApp/index.php");
		LoginPage page=new LoginPage();
		type(page.getUserName(),"Sangeethasree");
		type(page.getPassword(),"Sangeeviji@1995");
		btnclick(page.getBtnclick());
		SearchHotelpage search=new SearchHotelpage();
		dropDown(search.getLocation(),"Sydney");
		dropDown(search.getHotels(), "Hotel Creek");
		dropDown(search.getRoomType(), "Double");
		dropDown(search.getRoomNo(), "2 - Two");
		type(search.getCheckInDate(),"26/01/2020");
		type(search.getCheckOutDate(),"27/01/2020");
		dropDown(search.getAdultRoom(), "1 - One");
		dropDown(search.getChildRoom(), "1 - One");
		btnclick(search.getSubmitbtn());
		SelectHotelpage select= new SelectHotelpage();
		btnclick(select.getRadioButton());
		btnclick(select.getContinuebtn());
		BookHotel book=new BookHotel();
		type(book.getFirstName(),"Sangeetha");
		type(book.getLastName(), "PV");
		type(book.getAddress(), "Taramani");
		type(book.getCardnum(), "1234567890123456");
		dropDown(book.getCcType(), "VISA");
		dropDown(book.getMonth(), "April");
		dropDown(book.getYear(), "2020");
		type(book.getCvv(), "6789");
		btnclick(book.getBookNow());
		Thread.sleep(7000);
		BookingConfirmation confirmation= new BookingConfirmation();
		System.out.println(ordernum(confirmation.getOrder()));
		
	}

}
