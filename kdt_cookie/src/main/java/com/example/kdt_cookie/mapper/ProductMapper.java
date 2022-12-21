package com.example.kdt_cookie.mapper;

import com.example.kdt_cookie.product.productDto.ProductDto;
import com.example.kdt_cookie.util.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<ProductDto> selectProduct(SearchDto params);

    int count(SearchDto params);
}
