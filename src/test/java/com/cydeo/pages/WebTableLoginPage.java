package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {
    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(name ="username")
    public WebElement inputUsername;

    @FindBy(name ="password")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    @FindBy(xpath="//button[text() ='Order']")
    public WebElement orderButton;

    // no parameter. When we call this method, it will directly login using
    //username: Test
    //password:Tester
//    public void login(){
//        this.inputUsername.sendKeys("Test");
//        this.inputPassword.sendKeys("Tester");
//        this.loginButton.click();
//    }


    /**
     * This method will accept username and password and login button to app
     * @param username
     * @param password
     */
    public void login(String username, String password){
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        loginButton.click();


    }

}
