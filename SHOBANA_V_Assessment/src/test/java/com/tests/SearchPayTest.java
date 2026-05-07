package com.tests;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pages.AddedWishlistPage;
import com.pages.PaymentPage;
import com.pages.SearchPage;
import com.utilities.ListenerClass2;

@Listeners(ListenerClass2.class)
public class SearchPayTest extends BaseTest {

    SearchPage search;
    AddedWishlistPage wishlist;
    PaymentPage payment;

    String productName;

    @Test(priority = 1)
    public void searchProductTest() {

        search = new SearchPage(getDriver());

        search.searchProduct("shirt");

        productName = search.getProductName();

        Assert.assertTrue(productName.toLowerCase().contains("shirt"));
    }

    @Test(priority = 2, dependsOnMethods = "searchProductTest")
    public void addWishlistTest() {

        search = new SearchPage(getDriver());
        wishlist = new AddedWishlistPage(getDriver());

        search.searchProduct("shirt");
        search.addToCart();
        search.clickViewCart();

        String cartProduct = wishlist.getCartProductName();

        Assert.assertEquals(cartProduct, productName);
    }

    @Test(priority = 3, dependsOnMethods = "addWishlistTest")
    public void checkoutTest() {

        search = new SearchPage(getDriver());
        wishlist = new AddedWishlistPage(getDriver());
        payment = new PaymentPage(getDriver());

        search.searchProduct("shirt");
        search.addToCart();
        search.clickViewCart();

        wishlist.checkoutLogin("YOUR_REGISTERED_MAIL@gmail.com", "YOUR_PASSWORD");

        payment.placeOrderFlow();

        payment.payment(
                "Shobana",
                "1234567890123456",
                "123",
                "01",
                "2035");

        SoftAssert soft = new SoftAssert();

        soft.assertEquals(payment.confirmationMessage(), "Order Placed!");

        System.out.println("Checkout completed successfully");

        soft.assertAll();
        System.out.println("Checkout completed successfully");

      
    }
}