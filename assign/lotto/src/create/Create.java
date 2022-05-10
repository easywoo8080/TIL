package create;

import java.util.HashSet;
import java.util.Random;

import abstractEdu.Ct;

public class Create extends Ct<Integer, Integer> {

    @Override
    public HashSet<Integer> createMax(Integer max, Integer num) throws Exception {
        HashSet<Integer> ln = new HashSet<Integer>();
        Random r = new Random();

        
        for (int i = 0; i < num; i++) {
            if( !(ln.add(r.nextInt(max)+1)) ) {
                i--;
            }       
        }
        return ln;
    }

 
}
