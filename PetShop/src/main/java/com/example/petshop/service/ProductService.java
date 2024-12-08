package com.example.petshop.service;

import com.example.petshop.entity.Product;
import com.example.petshop.entity.ProductCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAll();

    Product getById(int id);

    Product save(Product product);

    void deleteById(int id);

    Page<Product> searchProduct(String search, PageRequest of);

    Page<Product> getPaginatedProduct(PageRequest of);

    List<Product> getProductsByCategory(Integer id, int id1);

    List<Product> getProductsByDifferentCategory(int currentCategoryId, int currentProductId);

    List<Product> getAllByCreatedDate();

    Page<Product> getProductsByCategoryId(Integer categoryId, Pageable pageable);

    List<Product> getAllByCreatedDateAndEnable();

    List<Product> getAllProductByCategoryId(ProductCategory productCategory);

    Page<Product> searchProductByPriceAndKeyword(String search, Double minPrice, Double maxPrice, PageRequest price);

    Page<Product> searchProductByPriceRange(Double minPrice, Double maxPrice, PageRequest price);
}
