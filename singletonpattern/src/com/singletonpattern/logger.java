package com.singletonpattern;

public class logger {

	    // Private static instance of the same class that is the only instance of the class.
	    private static logger instance;

	    // Private constructor to restrict instantiation from other classes.
	    private logger() {
	        // Initialize any resources required for logging
	    }

	    // Public static method that returns the instance of the class, ensuring only one instance is created.
	    public static logger getInstance() {
	        if (instance == null) {
	            instance = new logger();
	        }
	        return instance;
	    }

	    // Method to log messages
	    public void log(String message) {
	        System.out.println("Log message: " + message);
	    }
	}

	


