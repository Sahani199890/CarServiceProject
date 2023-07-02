package car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public List<String> carList=new ArrayList<>();
    {
        carList.add("suv");
        carList.add("sedan");
        carList.add("xuv");
        carList.add("creta");
    }

}
/*
 System.out.println("please enter no of services wanted");
           int n=sc.nextInt();
           sc.nextLine();
           int amount=0;
           for(int i=0;i<n;i++){
           String userServiceList = sc.nextLine();
           int price=carService.carNameWithService.get(userSelectedCar).get(userServiceList);
               amount+=price;
           }
           System.out.println(amount);
 */
