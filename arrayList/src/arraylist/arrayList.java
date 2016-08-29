package arraylist;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

    public static void main(String[] args) {

        long inicio1 = System.currentTimeMillis();
        
        List<Integer> lista = new ArrayList();//sin inicialCapacity

        for (int i = 0; i < 1000000; i++) {

            lista.add(i);

        }
            
        long fin1 = System.currentTimeMillis();
        System.out.println(fin1 - inicio1);
        
        ////////////////////////////////////////
        
        long inicio2 = System.currentTimeMillis();
        
        List<Integer> lista2 = new ArrayList(10000);//con inicialCapacity

        for (int i = 0; i < 1000000; i++) {

            lista2.add(i);

        }
            
        long fin2 = System.currentTimeMillis();
        System.out.println(fin2 - inicio2);

        
    }

}
