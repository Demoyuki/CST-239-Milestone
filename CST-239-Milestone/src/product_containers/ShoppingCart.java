package product_containers;

import java.util.ArrayList;
import java.util.List;

import product.SalableProduct;

/**
 * Represents a shopping cart
 * @author Victor Marrujo
 * @version 1.0
 * @since 1.0
 */

public class ShoppingCart 
{
	// Fields
    private List<SalableProduct> cartItems;

    /**
     *  ShoppingCart Constructor
     */
    public ShoppingCart() 
    {
        cartItems = new ArrayList<>();
    }

    /**
     * Adds product to cart
     *
     * @param product Product to add
     */
    public void addProduct(SalableProduct product) {
        cartItems.add(product);
    }

    /**
     * Removes product from cart
     *
     * @param product Product to remove
     */
    public void removeProduct(SalableProduct product) {
        cartItems.remove(product);
    }

    /**
     * Retrieves list of products in cart
     *
     * @return cartItems List of products
     */
    public List<SalableProduct> getCartItems() {
        return cartItems;
    }
}