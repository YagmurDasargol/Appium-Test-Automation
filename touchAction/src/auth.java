import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class auth {
    public static void main(String args[]) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "grit.storytel.app");
        dc.setCapability("appActivity", ".MainActivity");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        

        (new TouchAction(ad)) //swipe left
               .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .press(PointOption.point(918,1342))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(700)))
                .moveTo(PointOption.point(153,1342))
                .release()
                .perform();

        (new TouchAction(ad)) //swipe right
              //  .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .press(PointOption.point(136,1202))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(700)))
                .moveTo(PointOption.point(818,1202))
                .release()
                .perform(); 

        // click on try it out button
        MobileElement el1 = (MobileElement) ad.findElementById("grit.storytel.app:id/create_account_preview");
        el1.click();


        // FindElement- Iceland
        MobileElement element = (MobileElement) ad.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Iceland\"))"));
        element.click();


        //Click Done
        MobileElement el5 = (MobileElement) ad.findElementById("grit.storytel.app:id/buttonDone");
        el5.click();
        //Select English from Languages
        MobileElement el6 = (MobileElement) ad.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.CheckBox");
        el6.click();
        //Click Done
        MobileElement el7 = (MobileElement) ad.findElementById("grit.storytel.app:id/buttonDone");
        el7.click();

        //Scroll down to find FeelGood section books
        MobileElement feelG = (MobileElement) ad.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Feelgood\"))"));

        (new TouchAction(ad)) //Start swiping left to find "Finding Destiny" Book
                .press(PointOption.point(993,1592))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(328,1592))
                //.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();

        (new TouchAction(ad))
                .press(PointOption.point(993,1592))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(328,1592))
                //.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();

        (new TouchAction(ad))
                .press(PointOption.point(993,1592))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(328,1592))
                .release()
                .perform();

        (new TouchAction(ad))
                .press(PointOption.point(993,1592))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(328,1592))
                .release()
                .perform();
        (new TouchAction(ad))
                .press(PointOption.point(993,1592))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(800)))
                .moveTo(PointOption.point(328,1592))
                .release()
                .perform();


        //Click on "Finding Destiny" Book
        MobileElement el8 = (MobileElement) ad.findElementByAccessibilityId("Finding Destiny");
        el8.click();

        //wait element to press Like
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Click Like Button
        MobileElement el9 = (MobileElement) ad.findElementById("grit.storytel.app:id/btnBookshelfToggle");
        el9.click();

        //fill - email and password...
        MobileElement el11 = (MobileElement) ad.findElementById("grit.storytel.app:id/edit_text_email");
        el11.sendKeys("yagmur12@dasargol.com");
        MobileElement el12 = (MobileElement) ad.findElementById("grit.storytel.app:id/edit_text_password");
        el12.sendKeys("1357qwer");

        //Click continue
        MobileElement el13 = (MobileElement) ad.findElementById("grit.storytel.app:id/button_sign_in");
        el13.click();

        //Click first one
        MobileElement el14 = (MobileElement) ad.findElementById("grit.storytel.app:id/button_positive");
        el14.click();

        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Click no Thanks
        MobileElement el16 = (MobileElement) ad.findElementById("grit.storytel.app:id/button_negative");
        el16.click();
        ad.navigate().back();
		//wait element
        ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     
        //click back Button
        ad.navigate().back();


    }

}
