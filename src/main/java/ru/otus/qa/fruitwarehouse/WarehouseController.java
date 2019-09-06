package ru.otus.qa.fruitwarehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/warehouse")
public class WarehouseController {

    @GetMapping(path = "/apples")
    public CounterView apples() {
        return new CounterView(4);
    }

    @GetMapping(path = "/bananas")
    public CounterView bananas() {
        return new CounterView(80);
    }
}
