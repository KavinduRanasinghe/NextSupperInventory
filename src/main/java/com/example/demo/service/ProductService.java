package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
    }
    
    public Product updateProduct(String id, Product productDetails) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        
        product.setSupplierId(productDetails.getSupplierId());
        product.setUnitPrice(productDetails.getUnitPrice());
        product.setAvailableQuantity(productDetails.getAvailableQuantity());
        product.setTotalAmount(productDetails.getTotalAmount());
        
        return productRepository.save(product);
    }
    
    public void deleteProduct(String id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.delete(product);
    }
} 