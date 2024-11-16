package com.xmu.exp5jpa.controller;

import com.xmu.exp5jpa.bo.Product;
import com.xmu.exp5jpa.controller.dto.ProductDto;
import com.xmu.exp5jpa.model.ReturnObject;
import com.xmu.exp5jpa.service.Impl.ProductServiceImpl;
import com.xmu.exp5jpa.util.CloneFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("")
    public ReturnObject getProductsByName(@RequestParam String name) {
        ReturnObject retObj = null;
        List<Product> productList = productService.getProductsByNameAndRelatedData(name);
        List<ProductDto> data = productList.stream().map(o-> CloneFactory.copy(new ProductDto(),o)).collect(Collectors.toList());
        retObj = new ReturnObject(data);
        return  retObj;
    }
}
