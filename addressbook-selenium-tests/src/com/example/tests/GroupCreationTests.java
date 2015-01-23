package com.example.tests;

import org.testng.annotations.Test;

import com.example.model.GroupData;

public class GroupCreationTests extends TestBase {
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
    openMainPage();
    gotoGroupPage();
    initNewGroupCreation();
    GroupData group = new GroupData();
    group.name = "group 2";
    group.header = "header 2";
    group.footer = "footer 2";
	fillGroupForm(group);
    submitGroupCreation();
    returnToHomePage();
  }
  
  @Test
  public void testEmptyGroupCreation() throws Exception {
    openMainPage();
    gotoGroupPage();
    initNewGroupCreation();
    fillGroupForm(new GroupData("", "", ""));
    submitGroupCreation();
    returnToHomePage();
  }
}