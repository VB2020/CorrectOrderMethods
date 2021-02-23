package com.VB2020.Threads;

import com.VB2020.CommonResource.Foo;

public class Thread_B implements Runnable
{
    private final Foo foo;

    public Thread_B(Foo object)
    {
        this.foo = object;
        new Thread(this).start();
    }
    @Override
    public void run()
    {
            while (true)
            {
                if (foo.is_Thread_B_running())
                {
                    foo.second();
                    break;
                }
            }
        }
}
