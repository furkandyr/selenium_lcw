import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TestProduct extends BaseTest{

    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @Test
    @Order(1)
    public void search_product(){
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
            homePage.searchBox().search("Pantolon");
        Assertions.assertTrue(productsPage.isOnProductsPage() ,
                "not on products page!");
    }

    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.IsOnProductDetailPage() ,
                "Not on Product Detail Page!");

    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homePage.isProductCountUp(),
                "Product count did not increase!");


    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartPage = new CartPage(driver);
        homePage.goToCart();
        Assertions.assertTrue(cartPage.checkPrice(),
                "Price is not the same ");

    }


    }



