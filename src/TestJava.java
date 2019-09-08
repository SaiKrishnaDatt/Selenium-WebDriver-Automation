import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestJava {
    public static void main(String[] args){

        WebDriverManager.chromedriver().arch64().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://facebook.com");

        driver.findElement(By.name("firstname")).sendKeys("Champ");
        driver.findElement(By.name("lastname")).sendKeys("Jr");
        driver.findElement(By.name("reg_email__")).sendKeys("0000000000");
        driver.findElement(By.name("reg_passwd__")).sendKeys("*123?abc");
        Select select = new Select(driver.findElement(By.name("birthday_day")));
        select.selectByVisibleText("17");
        select = new Select(driver.findElement(By.name("birthday_month")));
        select.selectByVisibleText("Oct");
        select = new Select(driver.findElement(By.name("birthday_year")));
        select.selectByVisibleText("1970");
        driver.findElement(By.xpath("//*[@id=\"u_0_9\"]")).click();
        driver.findElement(By.name("websubmit")).click();


    }
}
