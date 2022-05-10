package abstractEdu;

import java.util.HashSet;

public abstract class Ct<Max, Num> {
 public Ct() { 
 }

 
 @Override
public String toString() {
    return "Create []";
}


public abstract HashSet<Integer> createMax(Max max,Num num) throws Exception;
}
