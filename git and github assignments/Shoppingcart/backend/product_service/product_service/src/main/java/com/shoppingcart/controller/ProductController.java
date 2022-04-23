package com.shoppingcart.controller;

import java.util.List;
import java.util.Optional;

import com.shoppingcart.model.Product;
import com.shoppingcart.services.ProductServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    
    @Autowired
    private ProductServiceImpl productServiceImpl;

    @GetMapping("/")
    public ResponseEntity<List<Product>> getAllProducts(){
        try{
            return ResponseEntity.of(Optional.of(productServiceImpl.getAllProducts()));
            
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id")long id){
        try{
            return ResponseEntity.ok().body(productServiceImpl.getAllProductById(id));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

            
        }
    }
    @PostMapping("/")
    public ResponseEntity<Product> setAllProducts(@RequestBody Product product){
        try{
            return ResponseEntity.ok().body(productServiceImpl.setProductDetails(product));

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        }

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable("id")long id, @RequestBody Product product){
        try{
            List<Product> products = productServiceImpl.getAllProducts();
            for(Product p: products){
                if(p.getProduct_id()==id){
                    return ResponseEntity.ok().body(productServiceImpl.updateProductById(product));
                }
            }
            throw new Exception("Product Details with id: " + id + " not Found!!");

        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBookingById(@PathVariable("id")long id){
        try{
            List<Product> products = productServiceImpl.getAllProducts();
            for(Product p: products){
                if(p.getProduct_id()==id){

                    productServiceImpl.deleteProductById(id);

                    return ResponseEntity.ok().body("Product Details Deleted Successfully!");
                }
            }
            throw new Exception("Product Details with id: " + id + " not Found!!");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

}
