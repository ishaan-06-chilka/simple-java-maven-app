package com.mycompany.app;
import java.util.logging.Logger;
/**
 * Hello world!
 */
public class App {
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    private static final String MESSAGE = "Hello DevOps!";

   
    public static void main(String[] args) {
        LOGGER.info(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
