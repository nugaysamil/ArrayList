import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void yazdir(ArrayList<String> a) {

        for (int i = 0 ; i<a.size(); i++) {

            System.out.println("Element : " + (i+1) + " : " + a.get(i));
        }


    }

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Metalica");
        arrayList.add("Guns's Roses");
        arrayList.add("Black Sabbath");
        arrayList.add("Iron Maiden");
        arrayList.add("Metalica");

        System.out.println(arrayList.get(0));

        System.out.println(arrayList.size()); // How many elements are in Array.


       arrayList.remove(2); // delete operation
       // arrayList.remove("Metalica");

        System.out.println(arrayList.indexOf("Metalica")); // ilk metalicayi bulru ve durur
        System.out.println(arrayList.lastIndexOf("Metalica"));// en son metalicayı bulur



        //for(int i=0; i<arrayList.size(); i++){
          //  System.out.println(arrayList.get(i));

        }

        yazdir(ArrayList);


    }
}

