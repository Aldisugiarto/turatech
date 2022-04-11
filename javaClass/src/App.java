// ******************************************************* //
// Author   : Aldi Sugiarto
// Date     : 4/11/2022
// File     : App.java
// ******************************************************* //
package javaClass.src;

import java.util.*;

// import javax.swing.plaf.basic.BasicBorders.MenuBarBorder;

public class App {
    public static void main(String[] args) throws Exception {
        Devices obj = new Devices();
        menu(obj);
    }
    static void menu(Devices objDevices) {
        Scanner sc = null;
        int no = 11;
        int data;
        while (no != 0) {
            System.out.println("Data Suhu dan Kelembaban pada suatu perangkat");
            System.out.println("1. Input data suhu");
            System.out.println("2. Input data kelembaban");
            System.out.println("3. Urutkan data suhu");
            System.out.println("4. Urutkan data kelembaban");
            System.out.println("5. Delete Data");
            System.out.println("Press 0 to close");  
            
            sc = new Scanner(System.in);
            no = sc.nextInt();
            
            if(no == 1){
                System.out.println("Masukkan data suhu.... !!!");
                for(int i = 0;i < 5; i++){
                    System.out.println("Masukkan data suhu: ");
                    sc = new Scanner(System.in);
                    data = sc.nextInt();
                    objDevices.setTemp(data);
                }
            }
            else if(no == 2){
                System.out.println("Masukkan data kelembaban.... !!!");
                for(int i = 0;i < 5; i++){
                    System.out.println("Masukkan data kelembaban: ");
                    sc = new Scanner(System.in);
                    data = sc.nextInt();
                    objDevices.setHum(data);
                }
            }
            else if(no == 3){
                objDevices.sort("suhu");
            }
            else if(no == 4){
                objDevices.sort("kelembaban");
            }
            else if(no == 5){
                objDevices.deleteData();
            }
        }

    }
}
