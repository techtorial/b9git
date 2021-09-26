import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAdvanced {

    @Test
    public void test1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://techtorialacademy.com");
        Assert.assertEquals("", driver.getTitle());
    }


    @Test
    public void test2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://techtorialacademy.com");
        Assert.assertEquals("", driver.getCurrentUrl());

    }
}
