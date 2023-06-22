package Steps;

import Driver.Driver;
import Elements.Bottom_Elements;
import io.cucumber.java.en.*;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;


public class BirBank {

    private static AndroidDriver ad;

    public boolean h;
    @Given("Open BB")
    public static void open_BB() throws MalformedURLException {
        ad = Driver.getDriver();
    }

    Bottom_Elements my_elem = new Bottom_Elements(ad);

    @When("Log In")
    public void login() throws InterruptedException {
        my_elem.log_in();
    }

    @Then("Press Search")
    public void press_search() {
        my_elem.press_search();
    }

    @And("Fill search field with {string}")
    public void fillSearchFieldWith(String arg0) throws InterruptedException {
        my_elem.type_search(arg0);
        Thread.sleep(7000);
    }

    @Then("Press Market")
    public void pressMarket() throws InterruptedException {
        my_elem.press_market();
    }

    @Then("Press Easy Transfer")
    public void pressEasyTransfer() {
        my_elem.press_easy_t();
    }

    @And("Press Close")
    public void pressClose() throws InterruptedException {
        my_elem.press_close();
    }

    @Then("Press Favorite")
    public void pressFavorite() {
        my_elem.press_favorite();
    }

    @Then("Press Payments")
    public void pressPayments() throws InterruptedException {
        my_elem.press_payments();
    }

    @And("Press Home")
    public void pressHome() throws InterruptedException {
        my_elem.press_home();
    }

    @And("Go to mobile operators")
    public void goToMobileOperators() {
        my_elem.pay_elem.mobile_operators();
    }

    @Then("Insert phone number")
    public void insertPhoneNumber() throws InterruptedException {
        my_elem.pay_elem.phone_number();
    }

    @And("Check provider button")
    public void checkProviderButton() {
        my_elem.pay_elem.mobile_provider();
    }

    @Then("Choose different provider")
    public void chooseDifferentProvider() {
        my_elem.pay_elem.choose_diff_prov();
    }

    @And("Click payment option")
    public void clickPaymentOption() {
        my_elem.pay_elem.payment_method();
    }

    @Then("Choose Payment Option according to {string}")
    public void choosePaymentOptionAccordingTo(String arg0) {
        switch (arg0) {
            case "Cards":
                my_elem.pay_elem.pay_method1();
                break;
            case "Accounts":
                my_elem.pay_elem.pay_method2();
                break;
            case "Bonuses":
                my_elem.pay_elem.pay_method3();
                break;
        }
    }

    @And("Enter sum of payment")
    public void enterSumOfPayment() throws InterruptedException {
        my_elem.pay_elem.pay_sum();
    }

    @Then("Cancel payment")
    public void cancelPayment() throws InterruptedException {
        for(int i = 0; i<3;i++){
            my_elem.pay_elem.cancel();
        }
        Thread.sleep(5000);
    }

    @Then("Press Other Options")
    public void pressOtherOptions() throws InterruptedException {
        my_elem.press_more();
    }

    @And("Go to currency converter")
    public void goToCurrencyConverter() throws InterruptedException {
        my_elem.other_elem.curr_conv();
    }

    @Then("Press Show all")
    public void pressShowAll() throws InterruptedException {
        h = my_elem.other_elem.Show_Or_Hide(h);
    }

    @And("Press Hide all")
    public void pressHideAll() throws InterruptedException {
        h = my_elem.other_elem.Show_Or_Hide(h);
    }

    @Then("Press on currency on right")
    public void pressOnCurrencyOnRight() throws InterruptedException {
        my_elem.other_elem.currToR();
    }

    @And("Press selected currency")
    public void pressSelectedCurrency() {
        my_elem.other_elem.selCurr();
    }
}
