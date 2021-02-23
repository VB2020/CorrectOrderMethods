package com.VB2020;

import com.VB2020.CommonResource.Foo;
import com.VB2020.Threads.Thread_A;
import com.VB2020.Threads.Thread_B;
import com.VB2020.Threads.Thread_C;

public class Main
{
    public static void main(String[] args)
    {
        Foo foo = new Foo();
        new Thread_C (foo);
        new Thread_B (foo);
        new Thread_A (foo);
    }
}

