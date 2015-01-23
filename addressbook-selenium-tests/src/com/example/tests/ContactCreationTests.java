package com.example.tests;

import org.testng.annotations.Test;

import com.example.model.ContactData;

public class ContactCreationTests extends TestBase {

	@Test
	public void testNonEmptyContactCreation() throws Exception {
		openMainPage();
		gotoEditPage();
		ContactData contact = new ContactData();
		contact.firstname = "Tarissa";
		contact.lastname = "Imirnova";
		contact.address = "#111-22 Townsgate Dr.";
		contact.home = "416-1122";
		contact.mobile = "416-1133";
		contact.work = "416-1144";
		contact.email = "tarimir@hutmail.com";
		contact.email2 = "tarimir2@hutmail.com";
		contact.bday = "30";
		contact.bmonth = "December";
		contact.byear = "1960";
		contact.new_group = "group 1";
		contact.address2 = "#33 Steeles Ave.";
		contact.phone2 = "647-1122";
		fillContactForm(contact);
		submitContactCreation();
		returnToHomePage();
	}
	
	@Test
	public void testEmptyContactCreation() throws Exception {
		openMainPage();
		gotoEditPage();
		fillContactForm(new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "[none]", "", ""));
		submitContactCreation();
		returnToHomePage();
	}
}
	