import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_NavigationCommands {
    /*
              Chrome tarayıcısını başlat ve pencereyi tam ekran yap
              https://clarusway.com/ adresine git
              http://google.com/ adresine git
              Geri komutu kullanarak Clarusway'e geri dön
              İleri komutu kullanarak tekrar Google websitesine git
              Sayfayı yenile
              Tarayıcıyı kapat
      */
    public static void main(String[] args) {

//    Chrome tarayıcısını başlat ve pencereyi tam ekran yap
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//    https://clarusway.com/ adresine git
        driver.get("https://clarusway.com/ ");

//    http://google.com/ adresine git
        driver.navigate().to("http://google.com/");

//    Geri komutu kullanarak Clarusway'e geri dön


//    İleri komutu kullanarak tekrar Google websitesine git


//    Sayfayı yenile


//    Tarayıcıyı kapat
        driver.quit();

    }
}
