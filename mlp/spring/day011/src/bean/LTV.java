package bean;

import frame.TV;

public class LTV implements TV{


    

    public LTV() {
        System.out.println("Create LG TV Bean ....");
    }

    @Override
    public void on() {
        // TODO Auto-generated method stub
        System.out.println("LG TV ON ...");
    }

    @Override
    public void off() {
        // TODO Auto-generated method stub
        System.out.println("LG TV OFF ...");
    }
    
   
}
