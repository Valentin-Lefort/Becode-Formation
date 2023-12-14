package org.example.challenge3;

import java.time.LocalTime;

public class TimeCmd implements Command {
  @Override
    public void execute() {
    LocalTime time = LocalTime.now();
        System.out.println("The time is: " + time);
    }
}