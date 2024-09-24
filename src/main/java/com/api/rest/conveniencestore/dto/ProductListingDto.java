package com.api.rest.conveniencestore.dto;

import com.api.rest.conveniencestore.enums.Category;
import com.api.rest.conveniencestore.model.Product;

public record ProductListingDto(
        Long id,
        String name,
        Category category,
        double price,
        int stockQuantity,
        String expirationDate) {

    public ProductListingDto(Product product) { //construtor
        this( //cria um ProductListingDto a partir do objeto Product.
                product.getId(),
                product.getName(),
                product.getCategory(),
                product.getPrice(),
                product.getStockQuantity(),
                product.getExpirationDate() != null ? product.getExpirationDate().toString() : "N/A");
        //verifica se a data é nula (N/A), se não retorna a data.
    }
}