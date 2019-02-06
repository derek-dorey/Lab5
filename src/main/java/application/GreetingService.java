package application;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public GreetingService(){}

    public String greet() {
        return "Hello World";
    }
}
