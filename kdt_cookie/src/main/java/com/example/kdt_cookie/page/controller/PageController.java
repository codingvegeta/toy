package com.example.kdt_cookie.page.controller;

import com.example.kdt_cookie.product.productDto.ProductList;
import com.example.kdt_cookie.util.SearchDto;
import com.example.kdt_cookie.product.productService.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @Autowired
    ProductService ps;

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/signupPage")
    public String signupPage() {
        return "user/signup";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @GetMapping("/productList")
    public String productList(SearchDto params, Model model) {
        System.out.println(params);
        ProductList product = ps.findAll(params);
        model.addAttribute("product", product);
        String key=params.getKeyword();
        if(key!=null){
            model.addAttribute("keyword", params.getKeyword());
        }

        return "productlist";
    }

}
