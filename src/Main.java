import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");


        while (true) {//program doesnot stop, gets input forever and runs
            InputStreamReader read = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(read);
            int n = 0;


            try {do{      System.out.println("Enter the number, bigger than 2");
                n = Integer.parseInt(in.readLine());}
            while(n<2);//gets input until they give input bigger than 1

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Hata");
            }
         //   System.out.println("sayi: " + n);

            ArrayList<Integer> isDead = new ArrayList<>();//arraylist to keep dead or alive status


            for (int i = 0; i < n; i++) {
                isDead.add(i, 0); //0 is alive, making all alive
            }


           // for (int i = 0; i < n; i++) {
       //         System.out.println("Hata" +
                     //   isDead.get(i));
          //  }

int alive=0;//to show which will be last standing

            if(n==3){//exception for 3
                alive = 2;
            }


int size = n;
            int k; //to kill

            int i = 0;//start, killer
            k = (i+1)%size;

            if (n == 2) {
                System.out.println("\n****\n*****");


                System.out.println(1 + ". soldier is dead, RIP... Killed by " +  "0.soldier. Now only " +  "1 alive");

            }

            while (n > 2) {

                while (isDead.get(k)%size == 0) {//if alive for killing
                //    System.out.println(i);

                    n = n - 1;
                    isDead.set((k)%size, 1);//dead

                    System.out.println((k)%size + ". soldier is dead, RIP... Killed by " + i%size + ".soldier. Now only " + n + " alive");


                    if (n == 2) {//2 only left, finish it
                        System.out.println("\n****\n*****");

n= 1;
                        System.out.println(i%size  + ". soldier is dead, RIP... Killed by " + alive +".soldier. Now only "
                                + n + " alive:\n**** "+alive);
                        break;//it is not good to use break but it was easiest
                    }

alive = i%size;

                    i = (i + 2) ;

                    while (isDead.get(i%size) != 0) {
                        i= (i+1)%size;
                    }
                    k = (i+1)%size;
                }//if dead, find an alive
                k =( k+1)%size;

            }




        }
    }
}