package org.example.challenge3;

public class HelloCmd implements Command {
  @Override
    public void execute() {
        System.out.println("Hello World!");
    }
}