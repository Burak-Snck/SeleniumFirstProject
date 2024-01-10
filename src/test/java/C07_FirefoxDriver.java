import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C07_FirefoxDriver{



/*
     Invoke FireFox Driver
     Go to https://www.youtube.com/
     Verify the page title contains the word video.
     Close the driver.
 */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.firefox.driver","Driver/geckodriver.exe" );
        WebDriver driver=new FirefoxDriver();


//     Invoke FireFox Driver

//     Go to https://www.youtube.com/

        driver.get("https://www.youtube.com/");


//     Verify the page title contains the word video.
        System.out.println(driver.getTitle());
        if(driver.getTitle().contains("YouTube")){

            System.out.println("Test Passed");
        }else {
            System.out.println( "Test Failed" );
        }
//     Close the driver.
        Thread.sleep(1000);
driver.quit();

    }
}
