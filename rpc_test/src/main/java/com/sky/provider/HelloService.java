package com.sky.provider;

import com.sky.annotation.Provider;
import com.sky.api.IHelloService;

/**
 * @author bainao
 */
@Provider(interfaceClass = IHelloService.class, version = "1.0.0")
public class HelloService implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
