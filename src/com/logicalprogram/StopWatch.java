package com.logicalprogram;
import java.util.Scanner;
public class StopWatch {
        public long startTimer=0,stopTimer=0,elapsed;
        public void start()/*start timer*/
        {
            startTimer=System.currentTimeMillis();
            System.out.println("Start time : "+startTimer);
        }
        public void stop()/*stop timer*/
        {
            stopTimer=System.currentTimeMillis();
            System.out.println("Stop time : "+stopTimer);
        }
        public long getElapsed()/*method*/
        {
            elapsed=stopTimer-startTimer;
            return elapsed;
        }
        public static void main(String[] args)
        {
            StopWatch sw=new StopWatch();/*created object*/
            Scanner sc = new Scanner(System.in);/*create user input obj*/
            System.out.println("Enter '1' to start time : ");
            sc.nextInt();
            sw.start();/*start time*/
            System.out.println("Enter '2' to stop time : ");
            sc.nextInt();
            sw.stop();/*stop time*/
            long l=sw.getElapsed();
            System.out.println("Total time elapsed is in millisecond: "+l);
            int sec= (int) (l/1000);
            System.out.println("Converting millisecond to second : "+sec);
        }}

