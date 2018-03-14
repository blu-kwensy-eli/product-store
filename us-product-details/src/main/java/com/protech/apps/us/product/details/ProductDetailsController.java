package com.protech.apps.us.product.details;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products/details")
public class ProductDetailsController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @RequestMapping("/")
    String hello() {
        return "Hello World from Product Details!";
    }

//    @Data
//    static class Result {
//        private final int left;
//        private final int right;
//        private final long answer;
//    }
//
//    // SQL sample
//    @RequestMapping("calc")
//    Result calc(@RequestParam int left, @RequestParam int right) {
//        MapSqlParameterSource source = new MapSqlParameterSource()
//                .addValue("left", left)
//                .addValue("right", right);
//        return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
//                (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
//    }
}
