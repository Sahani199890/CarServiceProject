package admin;

import car.Car;
import service.Service;

import java.util.HashMap;
import java.util.Scanner;

public class Admin {
    Service service=new Service();
    Car car=new Car();
    public void addService(int numberOfServices, String newCarName){
        Scanner sc=new Scanner(System.in);
        HashMap<String,Integer> serviceList=new HashMap<>();
        for(int i=0;i<numberOfServices;i++){
            System.out.println("Enter new serviceCode");
            String serviceCode = sc.nextLine();
            System.out.println("Enter price for the :" + serviceCode);
            Integer servicePrice = sc.nextInt();
            sc.nextLine();
            serviceList.put(serviceCode,servicePrice);
        }
        car.carList.add(newCarName);

        service.carNameWithService.put(newCarName, serviceList);
        System.out.println(service.carNameWithService);

//        System.out.println(serviceList);
    }
}
