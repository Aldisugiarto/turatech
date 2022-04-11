// ******************************************************* //
// Author   : Aldi Sugiarto
// Date     : 4/11/2022
// File     : Device.java
// ******************************************************* //
package javaClass.src;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Devices {
    // Initial variable
    private String devName;
    ArrayList<Integer> temp = new ArrayList<Integer>();
    ArrayList<Integer> hum = new ArrayList<Integer>();

    public String getDevice(){
        return devName;
    }
    public void setDevice(String devName){
        this.devName = devName;
    }

    public void setTemp(int temp) {
        this.temp.add(temp);
    }

    public void setHum(int hum) {
        this.hum.add(hum);
    }

    public void sort(String mode) {
        if(mode == "suhu"){
            Collections.sort(temp);
            System.out.println("Suhu setelah diurutkan");
            System.out.println(temp);
        }
        else{
            Collections.sort(hum);
            System.out.println("Kelembaban setelah diurutkan");
            System.out.println(hum);
        }
    }
    public void deleteData() {
        for(int i = 1;i <= temp.size();i++){
            temp.remove(i);
        }
        for(int i = 1;i <= hum.size();i++){
            hum.remove(i);
        }
    }
}
