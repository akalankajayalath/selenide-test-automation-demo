package com.selenide.demo;

import static com.codeborne.selenide.Selenide.*;
import org.junit.Test;
import static com.codeborne.selenide.Condition.*;
import org.openqa.selenium.By;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class AppTest 
{
	 @Test
	  public void search_selenide_in_google() {
	    open("http://demo.guru99.com/test/login.html");
	    $(By.name("email")).val("abc@gmail.com").pressTab();
	    $(By.id("passwd")).val("abc").pressTab().pressTab();
	    $(By.name("SubmitLogin")).click();
	    $(By.className("error-copy")).shouldBe(visible).shouldHave(
	        text("Successfully Logged in...")
	       );
	  }
}