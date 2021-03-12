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
                            Thread.sleep(10);
                        };
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        //Consumer pops ints
        Thread consumer = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    //check if buffer has anything to consume
                    if(!s.empty())
                    {
                        synchronized(s)
                        {
                            s.pop();
                            System.out.println("Consumer is consuming");
                            //sleep
                            Thread.sleep(10);
                        };
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        
        //start the threads
        new Thread(consumer).start();
        producer.start();
        
        

        
        System.out.println(s.empty());
    }
//*main***************************************************************************
    public static void main(String[] args)
    {
        //run handleThreads
        handleThreads();
    }
    
}
