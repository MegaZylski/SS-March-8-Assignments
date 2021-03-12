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
                            Thread.sleep(1);
                        };
                    }
                    else
                    {
                        //producer is sleeping
                        Thread.sleep(50);
                        System.out.println("Producer is sleeping");
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
                            Thread.sleep(1);
                        };
                    }
                    else
                    {
                        //consumer is sleeping
                        System.out.println("Consumer is sleeping");
                        Thread.sleep(50);
                    }
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        
        int i = 0;
        
        //loop and start the threads
        while(i < 1000)
        {
            new Thread(consumer).start();
            new Thread(producer).start();
            

            
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
