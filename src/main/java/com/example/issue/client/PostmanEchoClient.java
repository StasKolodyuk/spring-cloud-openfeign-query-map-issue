package com.example.issue.client;

import com.example.issue.client.model.ExtendedSearch;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "postman", url = "https://postman-echo.com")
public interface PostmanEchoClient {

    @GetMapping("/get")
    void echo(@SpringQueryMap ExtendedSearch search);

}
