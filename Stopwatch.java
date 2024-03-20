/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stopwatch;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class Stopwatch {

        private long startTime;
        private long endTime;
        private boolean running;
        
        public static void main(String[] args) {
            Stopwatch stopwatch = new Stopwatch();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Press 's' to start the stopwatch, 'e' to end it, and 'q' to quit.");
            
            while (true) {
                char input = scanner.next().charAt(0);
                switch (input) {
                    case 's':
                    stopwatch.start();
                    System.out.println("Stopwatch started.");
                    break;
                    case 'e':
                        if (stopwatch.isRunning()) {
                            stopwatch.stop();
                            System.out.println("Stopwatch stopped.");
                            System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " millisecond");
                        } else {
                            System.out.println("Stopwatch is not running.Press 's' to start it.");
                        }
                        break;
                    case 'q':
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid input.Press 's' to start the stopwatch, 'e' to end it, and 'q' to quit.");
                }
            }
        }
        
        
        public void start() {
            if (!running) {
                startTime = System.currentTimeMillis();
                running = true;
            }
        }
        
        public void stop() {
            if (running) {
                endTime = System.currentTimeMillis();
                running = false;
            }
        }
        
        
        public long getElapsedTime() {
            if (running) {
                return System.currentTimeMillis() - startTime;
            } else {
                return endTime - startTime;
            }
        }
        
        public boolean isRunning() {
            return running;
        }
    
}
