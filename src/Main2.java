import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Esercizio 2");
        Random random=new Random();
        List<Integer> numeri = new ArrayList<>();
        for(int i=0;i<20;i++){numeri.add(random.nextInt(0,101));};
        Collections.sort(numeri);
        System.out.println(numeri);
        List<Integer> numeriDecrescenti= new ArrayList<>();
        numeriDecrescenti.addAll(numeri);
        Collections.reverse(numeriDecrescenti);
        System.out.println(numeriDecrescenti);
        List<Integer>numeriPari= new ArrayList<>();
        numeriPari.addAll(numeri);
        boolean Pari=false;
        if(Pari) {
            for (int i = 0; i <= numeri.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(numeriPari.get(i));
                }
            }}else{
                for (int i = 0; i < numeri.size(); i++) {
                    if (i % 2 != 0) {
                        System.out.println(numeriPari.get(i));
                    }
                }


            }
        }}