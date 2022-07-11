package group.project02;

public class Task1 {

    /*
    Create a WebDriver Interface that will have the following unimplemented behaviour:
    openBrowser(), closeBrowser(), maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */
}
class DriverTester{
    public static void main(String[] args) {
        WebDriver1[] drivers={new ChromeDriver1(),new FirefoxDriver1()};
        for (WebDriver1 driver:drivers ){
            driver.openBrowser();
            driver.closeBrowser();
            driver.maximizeWindow();
            driver.findElement();
        }
    }
}

interface WebDriver1 {

    void openBrowser();

    void closeBrowser();

    void maximizeWindow();

    void findElement();

}

class ChromeDriver1 implements WebDriver1 {

    @Override
    public void openBrowser() {
        System.out.println("ChromeDriver opens Chrome browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("ChromeDriver closes Chrome browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("ChromeDriver maximizes Chrome browser's window");
    }

    @Override
    public void findElement() {
        System.out.println("ChromeDriver finds Chrome browser's element");
    }
}

class FirefoxDriver1 implements WebDriver1 {

    @Override
    public void openBrowser() {
        System.out.println("FirefoxDriver opens Firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("FirefoxDriver closes Firefox browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("FirefoxDriver maximizes Firefox browser's window");
    }

    @Override
    public void findElement() {
        System.out.println("FirefoxDriver finds Firefox browser's element");
    }
}
