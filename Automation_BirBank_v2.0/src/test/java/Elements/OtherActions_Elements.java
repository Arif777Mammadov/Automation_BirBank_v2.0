package Elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OtherActions_Elements {
    public TouchAction touchAction;
    AndroidDriver ad;
    public OtherActions_Elements(AndroidDriver ad){
        this.ad = ad;
        this.touchAction = new TouchAction(ad);
    }

    WebElement currencies_btn;
    WebElement show_hide;
    /*/
    WebElement switch_sides;
    WebElement currencyToLeft;
    //*/
    WebElement selected_currency;
    WebElement currencyToRight;

    public void curr_conv() throws InterruptedException {
        touchAction.longPress(PointOption.point((400), (2060))).moveTo(PointOption.point((400), (560))).release().perform();
        currencies_btn = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/header' and contains(@text, 'Курсы валют')]"));;
        currencies_btn.click();
        Thread.sleep(2000);
    }

    public boolean Show_Or_Hide(boolean h) throws InterruptedException {
        if (h){
            touchAction.longPress(PointOption.point((400), (1760))).moveTo(PointOption.point((400), (1060))).release().perform();
            show_hide = ad.findElement(By.id("az.kapitalbank.mbanking:id/tv_show_more"));
            show_hide.click();
            Thread.sleep(1000);
            return false;
        } else {
            show_hide = ad.findElement(By.id("az.kapitalbank.mbanking:id/tv_show_more"));
            show_hide.click();
            Thread.sleep(1000);
            return true;
        }

    }

    public void currToR() throws InterruptedException {
        currencyToRight = ad.findElement(By.id("az.kapitalbank.mbanking:id/currency_view_to"));
        currencyToRight.click();
        Thread.sleep(3000);
    }

    public void selCurr() {
        selected_currency = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/radio_btn' and @selected = 'true']"));
        selected_currency.click();
    }
}
