package ru.otus.qa.fruitwarehouse;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class BaseTest {

    @Before
    public void before() {
        RestAssuredMockMvc.standaloneSetup(new WarehouseController());
    }
}
