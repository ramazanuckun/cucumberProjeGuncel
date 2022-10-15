package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.WebPage;
import utilities.Driver;

import java.util.ArrayList;

public class WebStepDefinition {

    WebPage webPage=new WebPage();
    Actions actions=new Actions(Driver.getDriver());
    ArrayList<String>windows=new ArrayList<String>(Driver.getDriver().getWindowHandles());
    String ilkWindow;
    @And("kullanici ilk sayfaya geri doner")
    public void kullaniciIlkSayfayaGeriDoner() {

    }

    @Then("kullanici Login Portala kadar asagi iner")
    public void kullaniciLoginPortalaKadarAsagiIner() {
ilkWindow=Driver.getDriver().getCurrentUrl();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("kullanici Login Portala tiklar")
    public void kullaniciLoginPortalaTiklar() {
webPage.login.click();
    }

    @And("kullanici diger windowa gecer")
    public void kullaniciDigerWindowaGecer() {
        ArrayList<String>windows=new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(windows.get(1));

    }

    @And("kullanici {string} kutusuna bilgileri girer")
    public void kullaniciKutusunaBilgileriGirer(String username) {
webPage.userName.sendKeys(username);
    }

    @And("kullanici {string} bolumune bilgileri girer")
    public void kullaniciBolumuneBilgileriGirer(String password) {
        webPage.pasword.sendKeys(password);



    }

    @And("kullanici login butonuna basar")
    public void kullaniciLoginButonunaBasar() {
webPage.userPasOnay.click();

    }

    @And("kullanici Popup'ta cikan yazinin validation failed oldugunu test eder")
    public void kullaniciPopupTaCikanYazininValidationFailedOldugunuTestEder() {
String actualText=Driver.getDriver().switchTo().alert().getText();
String expectedText="validation failed";
        Assert.assertTrue(actualText.contains(expectedText));
    }

    @And("kullanici Ok diyerek Popup'i kapatir")
    public void kullaniciOkDiyerekPopupIKapatir() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @And("kullanici ilk sayfaya donuldugunu test eder")
    public void kullaniciIlkSayfayaDonuldugunuTestEder() {
        Driver.getDriver().switchTo().window(windows.get(0));

        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),ilkWindow);
    }
}
