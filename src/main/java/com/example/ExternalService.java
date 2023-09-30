package com.example;

import java.util.logging.Logger;

public class ExternalService {
    private static final Logger logger = Logger.getLogger(ExternalService.class.getName());


    public String execute(String input) {

        logger.severe("ExternalService.execute() called with input: " + input);
        return "exec:" + input;
    }
}
