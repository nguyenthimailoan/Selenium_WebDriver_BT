package loantester.BT_Locator1;

import loantester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Addproject extends BaseTest {
    public Addproject (){

    }
    public static void main(String[] args) {
        LearningLocator xp = new LearningLocator();
        Addproject addpj = new Addproject();
        addpj.setupBrowser();

        openURL("https://app.hrsale.com/");
        input(xp.email, "frances.burns");
        input(xp.password, "frances.burns");
        click(xp.loginBtn);




    }
}
