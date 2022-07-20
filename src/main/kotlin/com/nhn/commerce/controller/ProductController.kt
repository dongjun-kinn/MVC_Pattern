package com.nhn.commerce.controller

import com.nhn.commerce.service.ProductService
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class ProductController(
    private val productService: ProductService,
) {
    private val log = LoggerFactory.getLogger(javaClass)
    @GetMapping("/product")
    fun getProductList(model: Model): String {
        log.error("LogNCrash Error Test")
        model.addAttribute("productList", productService.findProductList())
        return "product"
    }

    // TODO (상품 상세 조회 기능 + Exception 처리)

    // TODO (상품 추가 기능)

    // TODO (상품 수정 기능 + Exception 처리)

    // TODO (상품 삭제 기능 + Exception 처리)

}
