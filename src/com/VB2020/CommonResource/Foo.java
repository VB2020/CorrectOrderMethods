package com.VB2020.CommonResource;

// Данный класс Foo - это общий ресурс!

public class Foo
{
    private boolean thread_A_is_running,
                    thread_B_is_running,
                    thread_C_is_running;

    public Foo()
    {
        this.thread_A_is_running = true;
        this.thread_B_is_running = false;
        this.thread_C_is_running = false;
    }

    public boolean is_Thread_A_running() {
        return thread_A_is_running;
    }

    public boolean is_Thread_B_running() {
        return thread_B_is_running;
    }

    public boolean is_Thread_C_running() {
        return thread_C_is_running;
    }

    public void first() {
        print("first");
        this.thread_A_is_running = false;
        this.thread_B_is_running = true;
    }

    public void second() {
        print("second");
        this.thread_B_is_running = false;
        this.thread_C_is_running = true;
    }

    public void third() {
        print("third");
        this.thread_B_is_running = true;
        this.thread_C_is_running = false;
    }

    public static void print(String name)
    {
        System.out.print(" -> " + name);
    }
}

