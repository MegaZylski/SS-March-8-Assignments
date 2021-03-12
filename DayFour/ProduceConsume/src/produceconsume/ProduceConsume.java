package produceconsume;

/*
 * Programmer: Damian Zylski
 * Project:    ProduceConsume
 * Date:       03/11/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To code the producer consumer problem where producers and consumers
 * share a resource such as an array and wait to use the resource
 */

import java.util.Stack;

public class ProduceConsume
{
//*handleThreads***************************************************************************
    //handles the producer consumer problem
    public static void handleThreads()
    {
        //Create a new stack that acts as the buffer
        Stack s = new Stack();
        
        //create threads
        //Producer pushes ints
        Thread producer = new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Producer is Alive");
            }
        };
        //Consumer pops ints
        Thread consumer = new Thread()
        {
            @Override
            public void run()
            {
                System.out.println("Consumer is Alive");
            }
        };
        
        int i = 0;
        
        //Create new threads
        new Thread(consumer).start();
        new Thread(producer).start();
        
        //loop and start the threads
        while(i < 1000)
        {
            
            
            try
                {
                    //check if buffer isn't full
                    if(s.size() < 8)
                    {
                        synchronized(s)
                        {

                            s.push(7);
                            System.out.println("Producer is producing");
                            //sleep
                            Thread.sleep(1);
                        };
                    }
                    else
                    {
                        //producer is sleeping                       
                        producer.wait(30);
                        producer.notify();
                        System.out.println("Producer is waiting");
                    }
                    
                    //check if buffer isn't empty
                    if(!s.empty() && s.size() > 0)
                    {
                        synchronized(s)
                        {

                            
                            s.pop();
                            System.out.println("Consumer is consuming");
                            //sleep
                            Thread.sleep(1);
                            
                        };
                    }
                    else
                    {
                        //consumer is waiting
                        consumer.wait(50);
                        producer.notify();
                        System.out.println("Consumer is waiting");
                    }
                }
                catch(InterruptedException | IllegalMonitorStateException e)
                {
                    e.printStackTrace();
                }
            

            
            i++;
        }
    }
//*main***************************************************************************
    public static void main(String[] args)
    {
        //run handleThreads
        handleThreads();
    }
    
}
