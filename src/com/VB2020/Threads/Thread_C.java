package com.VB2020.Threads;

import com.VB2020.CommonResource.Foo;

public class Thread_C implements Runnable
{
    private final Foo foo;

    public Thread_C(Foo object)
    {
        this.foo = object;
        new Thread(this).start();
    }
    @Override
    public void run()
    {
        while (true)
        {
            if (foo.is_Thread_C_running())
            {
                foo.third();
                break;
            }
        }
    }
}
