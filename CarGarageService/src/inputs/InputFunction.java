package inputs;

import admin.CallAdmin;
import car.Car;
import service.Service;

import java.util.Scanner;

public class InputFunction {
    public void input(){
        Scanner sc=new Scanner(System.in);
        CallAdmin admin=new CallAdmin();
        System.out.println("Are you an Admin ?"+"\n"+"Enter Y/N");
        String ans=sc.next().toLowerCase();
        if(ans.equals("y")){
            System.out.println("Please enter Admin name ");
            String adminName=sc.next();
            System.out.println("Please enter passcode");
            String passcode=sc.next();
            admin.login(adminName,passcode);
        }
        else if(ans.equals("n")){
            Car car = new Car();
            System.out.println("select car from car list: ");
            for (String carName : car.carList) {
                System.out.println(carName);
            }
            String userSelectedCar = sc.next().toLowerCase();

            Service carService = new Service();
            System.out.println("select services form list: ");

            System.out.println(carService.carNameWithService.get(userSelectedCar));
            sc.nextLine();
            System.out.println("Please select the services with one space separated");
            String userServiceList = sc.nextLine();
            String[] userServices = userServiceList.replaceAll("( )+", " ").split(" ");
            int amount= 0;
            for (String userService : userServices) {
                Integer price=(carService.carNameWithService.get(userSelectedCar)).get(userService);
                amount+=price;
            }
            System.out.println(amount);
            if(amount>=5000){
                System.out.println("Hurray! You have got free car washing service");
            }
        }
        else{
            System.out.println("Please enter Y/N only");
            System.exit(0);
        }
    }
}
