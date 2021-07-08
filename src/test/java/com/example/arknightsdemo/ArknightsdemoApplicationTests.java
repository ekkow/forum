package com.example.arknightsdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class ArknightsdemoApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource.getClass());
        System.out.println(dataSource.getConnection());
    }

    @Test
    void tests(){
        String a = "12";
        int b = Integer.parseInt(a) + 1;
        String c = String.valueOf(b);
        System.out.println(c);
    }

}
