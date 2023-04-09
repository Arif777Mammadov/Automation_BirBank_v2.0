package Elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralElements {
    public TouchAction touchAction;
    public GeneralElements(AndroidDriver ad){
        PageFactory.initElements(ad, this);
        this.touchAction = new TouchAction(ad);
    }

    @FindBy(id = "az.kapitalbank.mbanking:id/edit_text")
    WebElement search;

    @FindBy(id = "az.kapitalbank.mbanking:id/easy_transfer")
    WebElement easy_transfer;

    @FindBy(id = "az.kapitalbank.mbanking:id/item")
    WebElement what_item;

    @FindBy(id = "az.kapitalbank.mbanking:id/header_back")
    WebElement close_button;


    public void log_in() throws InterruptedException {
        Thread.sleep(3000);
        for(int i = 0; i < 4; i++){
            Thread.sleep(700);
            touchAction.tap(PointOption.point((400), (1960))).perform();
        }
        Thread.sleep(3000);
    }

    public void press_search() {
        search.click();
    }

    public void type_search(String arg0) {
        search.sendKeys(arg0);
    }

    public void press_easy_t() {
        easy_transfer.click();
    }

    public void press_favorite() {
        what_item.click();
    }

    public void press_close() throws InterruptedException {
        Thread.sleep(1000);
        close_button.click();
        Thread.sleep(1000);
    }
}
