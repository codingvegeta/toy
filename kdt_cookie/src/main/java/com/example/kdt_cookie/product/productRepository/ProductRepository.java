package com.example.kdt_cookie.product.productRepository;

import com.example.kdt_cookie.mapper.ProductMapper;
import com.example.kdt_cookie.product.productDto.ProductDto;
import com.example.kdt_cookie.util.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ProductRepository {
    @Autowired
    ProductMapper pm;

    public List<ProductDto> selectProduct(SearchDto params) {
        return pm.selectProduct(params);
    }

    public int count(SearchDto params) {
        return pm.count(params);
    }
    public int selectAvailAmount(HashMap<String,String> params){
        return pm.selectAvailAmount(params);
    }
    public List<HashMap<String, Object>> checkAvailProductId(){
        return pm.checkAvailProductId();
    }
    public HashMap<String, Object> checkAmountProduct(HashMap<String, String> params){
        return pm.checkAmountProduct(params);
    }
}
