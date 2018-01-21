package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * a method that greets you with the name of someone
   * @param someone this is someone
   * @return a string of the greeting
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
