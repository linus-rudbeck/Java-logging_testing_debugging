package se.distansakademin;

import com.example.ExternalService;

public class MyService {
    private ExternalService externalService;

    public MyService(ExternalService externalService) {
        this.externalService = externalService;
    }

    public String performAction(String input) {
        return externalService.execute(input);
    }
}