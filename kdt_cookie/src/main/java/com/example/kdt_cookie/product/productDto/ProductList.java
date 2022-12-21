package com.example.kdt_cookie.product.productDto;

import com.example.kdt_cookie.util.Pagination;

import java.util.ArrayList;
import java.util.List;


public class ProductList {
    private List<ProductDto> list = new ArrayList<>();
    private Pagination pagination;

    public ProductList(List<ProductDto> list, Pagination pagination) {
        this.list = list;
        this.pagination = pagination;
    }

    public List<ProductDto> getList() {
        return list;
    }

    public Pagination getPagination() {
        return pagination;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "list=" + list +
                ", pagination=" + pagination +
                '}';
    }
}
