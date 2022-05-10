package check;

import java.util.ArrayList;
import java.util.HashSet;

import interfaceEdu.Ck;

public class Check implements Ck {

    public Check() {
    }

    @Override
    public int ck(HashSet lotto, HashSet insert) throws Exception {
        
        int result = 0;
        ArrayList<Integer> al = new ArrayList<>(lotto);
        ArrayList<Integer> ai = new ArrayList<>(insert);

        for (int i = 0; i < al.size(); i++) {
            for (int j = 0; j < al.size(); j++) {
                if( al.get(i) == ai.get(j) )
                result++;
            }
        }
        return result;
    }


}
