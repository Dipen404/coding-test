package com.dipen.coding.designpatterns;

import java.io.PrintStream;

public class SingletonExample {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Starting application...");
        logger2.log("User logged in.");

        // Verifying that both loggers are the same instance
        System.out.println(logger1 == logger2);  // true

        EnumLogger.INSTANCE.log("Application started");
        EnumLogger.INSTANCE.debug("Debugging info here...");
        EnumLogger.INSTANCE.error("Something went wrong!");
    }
}
// Singleton Logger class
class Logger {
    // Step 1: Create a private static instance
    // A static instance of the class is created to hold the single object.
    private static Logger instance;

    // Step 2: Make the constructor private
    // The constructor of the class is private to prevent instantiation from outside the class.
    private Logger() {
        // Private constructor to prevent instantiation
    }

    // Step 3: Provide a global access point
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

//Best practice (Enum Singleton in java)
//An Enum Singleton in Java is a Singleton pattern implemented using a Java enum.
// It guarantees a single instance, is thread-safe, and protected against
// serialization/deserialization attacks and reflection.
 enum EnumLogger {
    INSTANCE;

    // Optional: You can add fields like log level or file writer here
    private final PrintStream out = System.out;

    public void log(String message) {
        out.println("[LOG] " + message);
    }

    public void error(String message) {
        out.println("[ERROR] " + message);
    }

    public void debug(String message) {
        out.println("[DEBUG] " + message);
    }
}


