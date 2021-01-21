import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;


public class GGPage extends Helper{
    WebElement Element;

    @Test
    public void kayitOlmaVeUrunSepeteEkleme() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi", getTitle());
        click(By.xpath("//*[contains(@class,'style__ActionTextArrow-sc-181qrxr-3 jbHtDX')]"));
        click(By.xpath("//*[@href='https://www.gittigidiyor.com/kayit-ol']"));
        assertEquals("Ücretsiz Kayıt Olun - Online Alışveriş - GittiGidiyor",getTitle());
        sendKeys(By.xpath("//*[@name='name']"),"Doga",false);
        sendKeys(By.xpath("//*[@name='surname']"),"Toka",false);
        sendKeys(By.xpath("//*[@name='email']"),"candoga01@gmail.com",false);
        sendKeys(By.xpath("//*[@name='passwd']"),"123456",false);
        click(By.xpath("//*[@name='gsmData']"));
        sendKeys(By.xpath("//*[@name='gsmData']"),"5545038552",false);
        click(By.xpath("//*[contains(@for,'informed-email') and contains(@class,'informed-email')]"));
        callHomePage();
        assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi", getTitle());
        sendKeys(By.xpath("//*[@data-cy='header-search-input']"),"Bisiklet",false);
        click(By.xpath("//*[@data-cy='search-find-button']"));
        delay(3);
        Element = driver.findElement(By.xpath("//h3//span[text()='Kldoro Kd-023 Spor Suluklu 24 Jant Bisiklet 21 Vites Kız Dağ Bisikleti Garantili']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", Element);
        delay(3);
        driver.findElement(By.xpath("//h3//span[text()='Kldoro Kd-023 Spor Suluklu 24 Jant Bisiklet 21 Vites Kız Dağ Bisikleti Garantili']")).click();
        delay(2);
        Element = driver.findElement(By.xpath("//button[@id='buy-now']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        delay(3);
        driver.findElement(By.xpath("//span[text()='Siyah']")).click();
        delay(2);
        click(By.xpath("//span[text()='Sepete Ekle']"));
        click(By.xpath("//span[text()='Sepete Ekle']"));
        delay(4);
    }



}
