import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By addToCartButtonlocator = By.id("add-to-cart fav addToCart");



    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean IsOnProductDetailPage() {
        return isDisplayed(addToCartButtonlocator);
    }

    public void addToCart() {
        click(addToCartButtonlocator);
    }
}
