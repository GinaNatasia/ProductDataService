package com.gigaia.productdataservice.util;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gigaia.productdataservice.model.Product;
import java.io.File;


import jakarta.annotation.PostConstruct;

@Component
public class JsonLoader {

	private final ObjectMapper objectMapper;
	private final String jsonFilePath;
	private List<Product> products;
	
	public JsonLoader(ObjectMapper objectMapper, @Value("${product-data.json.path}") String jsonFilePath) {
        this.objectMapper = objectMapper;
        this.jsonFilePath = jsonFilePath;
    }
	
	@PostConstruct
			public void loadProducts() {
				try {
					products = objectMapper.readValue(
							new File(jsonFilePath), 
							new TypeReference<List<Product>>() {}
				);
					System.out.println("Products loaded: " + products.size());	
				} catch (IOException e) {
					throw new RuntimeException("Failed to load products from JSON file", e);
				}
	}
		
	// Getter zodat andere services de producten kunnen gebruiken
    public List<Product> getProducts() {
        return products;
    }

}
