import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Position;

public class C06_GetPosition_SetPosition {

    /*
         Go to the Amazon URL : https://www.clarusway.com/
         Print the position and size of the page.
         Adjust the position and size of the page as desired.
         Test that the page is in the position and size you want.
         Close the page.
     */
    public static void main(String[] args) throws InterruptedException {

//     Go to the Clarusway URL : https://www.clarusway.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.clarusway.com/");

//     Print the position and size of the page.
        System.out.println("position" + driver.manage().window().getPosition());
        System.out.println("size" + driver.manage().window().getSize());

//     Adjust the position and size of the page as desired.

        Point targetposition=new Point(20,25);
        Dimension targetsize= new Dimension(450,300);
        driver.manage().window().setPosition(targetposition);
        driver.manage().window().setSize(targetsize);


//     Test that the page is in the position and size you want.

       int x = driver.manage().window().getPosition().getX();
        int y= driver.manage().window().getPosition().getY();

        int height=driver.manage().window().getSize().getHeight();
        int width=driver.manage().window().getSize().getWidth();



        if(x==9&&y==9 && height==1051&&width==798 ) {
            System.out.println("Test Geçti");
        }else {
            System.out.println("Test Geçmedi");
        }

//     Close the page.
        Thread.sleep(1000);
        driver.quit();


    }
}
