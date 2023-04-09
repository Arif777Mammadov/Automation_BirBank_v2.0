package Elements;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bottom_Elements extends GeneralElements{
    public Payment_Elements pay_elem;
    public OtherActions_Elements other_elem;
    public Bottom_Elements(AndroidDriver ad) {
        super(ad);
        pay_elem = new Payment_Elements(ad);
        other_elem = new OtherActions_Elements(ad);
    }

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_home")
    WebElement home;

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_umico_market")
    WebElement market;

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_payments_and_transfers")
    WebElement payments;

    @FindBy(id = "az.kapitalbank.mbanking:id/tab_more")
    WebElement more;

    public void press_market() throws InterruptedException {
        market.click();
        Thread.sleep(2000);
    }

    public void press_payments() throws InterruptedException {
        payments.click();
        Thread.sleep(2000);
    }

    public void press_more() throws InterruptedException {
        more.click();
        Thread.sleep(2000);
    }

    public void press_home() throws InterruptedException {
        home.click();
        Thread.sleep(2000);
    }
}
