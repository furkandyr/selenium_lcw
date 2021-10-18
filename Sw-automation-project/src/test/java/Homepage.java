import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Stack;

class HomePage extends BasePage {

    SearchBox searchBox ;
    By cartCountLocator = By.id("header-cart");

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public boolean isProductCountUp() {
        return getCartCount() == 2;

    }

    public void goToCart() {
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }
}
