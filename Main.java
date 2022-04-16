package ShortingArray;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = generateRandomArray(10);
        ArrayList<Integer> array2 = generateRandomArray(25);
        ArrayList<Integer> array3 = generateRandomArray(50);
        ArrayList<Integer> array4 = generateRandomArray(100);

        //sout array 1
        System.out.println(sorting(array1));

        // sout array 2
        // System.out.println(sorting(array2));

        // sout array 3
        // System.out.println(sorting(array3));

        // sout array 4
        // System.out.println(sorting(array4));



    }
    public static ArrayList<Integer> generateRandomArray(int n){
        ArrayList<Integer> data = new ArrayList<Integer>(n);
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            data.add(random.nextInt(1000));
        }
        return data;
    }
    public static int sorting(ArrayList <Integer> data) {
        int jumlah_mutasi = 0;
        System.out.println("Array yang akan diurutkan :\n" + data );
        for (int i = 1; i < data.size(); i++) {
            int selected_data = data.get(i);
            System.out.printf( "\nIterasi ke - %d\n" , i);
            System.out.printf( "Data yang dipilih : %d\n", selected_data);
            int j = i - 1;
            // seleksi perbandingan data yang terpilih dengan data sebelumnya
            while ((j >= 0) && (data.get(j) > selected_data)) {
                System.out.print("Perubahan : "+ data + " \n");
                data.set(j+1 ,data.get(j) );
                data.set(j, selected_data);
                jumlah_mutasi +=1;
                j--;
            }
            data.set(j+1 ,  selected_data );
            System.out.print("Perubahan : " +  data + " \n");
            jumlah_mutasi +=1;
        }
        System.out.println("\nJumlah Mutasi yang terjadi adalah ");
        return jumlah_mutasi;
    }
}


