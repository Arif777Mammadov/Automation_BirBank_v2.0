package Elements;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Payment_Elements {
    public TouchAction touchAction;
    AndroidDriver ad;
    public Payment_Elements(AndroidDriver ad){
        this.ad = ad;
        this.touchAction = new TouchAction(ad);
    }


    WebElement mob_op;
    WebElement phone_num;
    WebElement next_btn;
    WebElement mob_prov;
    WebElement mob_prov_opt;
    WebElement mob_prov_opt_confirm;
    WebElement pay_method;
    WebElement pay_method_opt1;
    WebElement pay_method_opt2;
    WebElement pay_method_opt3;
    WebElement returned_taxes;
    WebElement payment_sum;
    WebElement back;

    public void mobile_operators() {
        mob_op = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/tv_operation_home_title' and contains(@text, 'Мобильные операторы')]"));
        mob_op.click();
    }
    //Inside of mobile operators
    public void phone_number() throws InterruptedException {
        phone_num = ad.findElement(By.id("az.kapitalbank.mbanking:id/add_number_manually"));
        phone_num.click();
        Thread.sleep(500);
        for(int i = 0; i < 9; i++){
            if(i < 2){
                touchAction.tap(PointOption.point((400), (1700))).perform();
            } else {
                touchAction.tap(PointOption.point((400), (2060))).perform();
            }
        }
        next_btn = ad.findElement(By.id("az.kapitalbank.mbanking:id/btn_next"));
	    next_btn.click();
    }

    public void mobile_provider() {
        mob_prov = ad.findElement(By.id("az.kapitalbank.mbanking:id/selector_provider"));
        mob_prov.click();
    }

    public void choose_diff_prov() {
        mob_prov_opt = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/provider_name' and contains(@text, 'Azercell')]"));
        mob_prov_opt.click();
        mob_prov_opt_confirm = ad.findElement(By.id("az.kapitalbank.mbanking:id/btn_apply"));
        mob_prov_opt_confirm.click();
    }

    public void payment_method() {
        pay_method = ad.findElement(By.id("az.kapitalbank.mbanking:id/source_container"));
        pay_method.click();
    }

    public void pay_method1() {
        pay_method_opt1 = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/tab_title' and contains(@text, 'Карты')]"));
        pay_method_opt1.click();
        //Has "New Card" button
    }

    public void pay_method2() {
        pay_method_opt2 = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/tab_title' and contains(@text, 'Счета')]"));
        pay_method_opt2.click();
        //Empty one for some reason
    }

    public void pay_method3() {
        pay_method_opt3 = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/tab_title' and contains(@text, 'Бонусы')]"));
        pay_method_opt3.click();
        //This one is usable
        returned_taxes = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/tv_card_name' and contains(@text, 'ƏDV geri al')]"));
        returned_taxes.click();
    }

    public void pay_sum() throws InterruptedException {
        payment_sum = ad.findElement(By.xpath("//*[@resource-id='az.kapitalbank.mbanking:id/value' and contains(@text, 'Сумма')]"));
        payment_sum.click();
        Thread.sleep(500);
        touchAction.tap(PointOption.point((150), (1520))).perform();
    }

    public void cancel() {
        back = ad.findElement(By.id("az.kapitalbank.mbanking:id/iv_centered_header_back"));
        back.click();
    }

    //Inside of anything else
}
