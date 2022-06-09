package bean;

import frame.TV;

public class STV implements TV{

    public STV() {
        System.out.println("Create SS TV Bean ....");
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("SS TV ON ...");
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("SS TV OFF ...");
    }
    
}
