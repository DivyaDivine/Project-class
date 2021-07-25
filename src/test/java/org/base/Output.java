package org.base;

import org.adac.BaseClass;
import org.pom.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Output extends BaseClass{
	public static void main(String[] args) {
		
		BaseClass bs=new BaseClass();
		bs.getDriver("chrome");
		bs.launchURL("https://adactinhotelapp.com/");
		WebElement username = bs.findById("id", "username");
		bs.typeText(username, "karthi007");
		WebElement passWord = bs.findById("id", "password");
		bs.typeText(passWord, "Karthi@1989");
		WebElement buttnLogin = bs.findById("id", "login");
		bs.buttnClick(buttnLogin);
		WebElement loc = bs.findById("id", "location");
		bs.typeText(loc, "Brisbane");
		WebElement element = bs.findById("id", "hotels");
		bs.typeText(element, "Hotel Sunshine");
		WebElement element2 = bs.findById("id", "room_type");
		bs.typeText(element2, "Deluxe");
		WebElement element3 = bs.findById("id", "room_nos");
		bs.typeText(element3, "3 - Three");
		WebElement element4 = bs.findById("id", "adult_room");
		bs.typeText(element4, "4 - Four");
		WebElement element5 = bs.findById("id","child_room");
		bs.typeText(element5,"2 - Two");
		WebElement element6 = bs.findById("id", "Submit");
		bs.buttnClick(element6);
		WebElement element7 = bs.findById("id", "radiobutton_0");
		bs.buttnClick(element7);
		WebElement element8 = bs.findById("id", "continue");
		bs.buttnClick(element8);
	WebElement firstName = bs.findById("id", "first_name");
	bs.typeText(firstName, bs.getDataExcel("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data2.xlsx", "sheet1", 2, 0));
	WebElement LastName = bs.findById("id", "last_name");	bs.typeText(LastName, bs.getDataExcel("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data2.xlsx", "sheet1", 2, 1));
	WebElement add = bs.findById("id", "address");
	bs.typeText(add, bs.getDataExcel("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data2.xlsx", "sheet1", 2, 2));
WebElement card = bs.findById("id", "cc_num");
bs.typeText(card, bs.getDataExcel("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data2.xlsx", "sheet1", 2, 3));
WebElement cctype = bs.findById("id", "cc_type");
bs.typeText(cctype, "Master Card");
WebElement mon = bs.findById("id", "cc_exp_month");
bs.typeText(mon, "June");
WebElement yr = bs.findById("id", "cc_exp_year");
bs.typeText(yr, "2017");
WebElement cvv = bs.findById("id","cc_cvv");
bs.typeText(cvv, bs.getDataExcel("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data2.xlsx", "sheet1", 2, 4));
WebElement btt = bs.findById("id", "book_now");
bs.buttnClick(btt);
WebElement create = bs.findById("id", "order_no");
bs.getAttribute(create, bs.storeDataExcel("C:\\Users\\JAGAN\\eclipse-workspace\\DayOneTask\\Excel Data\\Data2.xlsx", "Order Num", 1, 1));
	}
}





	
	
	
	
	
	
	

	
	
	