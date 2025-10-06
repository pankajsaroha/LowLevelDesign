package com.pankaj.lld.shopping.cart;

public class Product {
    private int productId;
    private String name;
    private String description;
    private int availableQuantity;
    private ProductCategory productCategory;

    public Product(int productId, String name, String description, int availableQuantity, ProductCategory productCategory) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.availableQuantity = availableQuantity;
        this.productCategory = productCategory;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public boolean updateQuantity (int productId, int quantity) {
        return false;
    }
}
