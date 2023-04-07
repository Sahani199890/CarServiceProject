package service;



import car.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Service {
    Car car=new Car();
    public HashMap<String,Integer> service=new HashMap<>();
    public HashMap<String,HashMap<String,Integer>> carNameWithService=new HashMap<>();
    {
        HashMap<String,Integer> suvService=new HashMap<>();
        suvService.put("BS01",700);
        suvService.put("GS01",900);
        suvService.put("TS01",600);
        suvService.put("BF01",200);
        suvService.put("GF01",2000);

        HashMap<String,Integer> sedanService=new HashMap<>();
        sedanService.put("BS01",500);
        sedanService.put("GS01",1000);
        sedanService.put("TS01",800);
        sedanService.put("BF01",400);
        sedanService.put("GF01",2500);

        HashMap<String,Integer> xuvService=new HashMap<>();
        xuvService.put("BS01",400);
        xuvService.put("GS01",950);
        xuvService.put("TS01",700);
        xuvService.put("BF01",300);
        xuvService.put("GF01",2200);

        HashMap<String,Integer> cretaService=new HashMap<>();
        cretaService.put("BS01",450);
        cretaService.put("GS01",830);
        cretaService.put("TS01",760);
        cretaService.put("BF01",501);
        cretaService.put("GF01",2300);


        carNameWithService.put(car.carList.get(0),suvService);
        carNameWithService.put(car.carList.get(1),sedanService);
        carNameWithService.put(car.carList.get(2),xuvService);
        carNameWithService.put(car.carList.get(3),cretaService);
    }

}
