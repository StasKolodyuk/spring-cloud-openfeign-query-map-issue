package com.example.issue;

import com.example.issue.client.PostmanEchoClient;
import com.example.issue.client.model.ExtendedSearch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SpringQueryMapIssueTest {

    @Autowired
    PostmanEchoClient postmanEchoClient;

    @Test
    public void test() {
        ExtendedSearch search = new ExtendedSearch();
        search.setParentFilter("parent");
        search.setChildFilter("child");

        // Request generated: https://postman-echo.com/get?childFilter=child
        // Expected:        : https://postman-echo.com/get?childFilter=child&parentFilter=parent
        postmanEchoClient.echo(search);
    }
}
