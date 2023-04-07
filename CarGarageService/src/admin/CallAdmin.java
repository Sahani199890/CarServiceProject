package admin;

import java.util.HashMap;
import java.util.Scanner;

public class CallAdmin {
    Admin admin=new Admin();
    HashMap<String,String> loginCredentials=new HashMap<>();
    {
        loginCredentials.put("abhishek","@17r01a03A2");
        loginCredentials.put("ankit","ankitankit");
        loginCredentials.put("adminperson","imadmin");
        loginCredentials.put("admin","admin");
    }
    public void login(String adminName, String adminPassCode){
        if(loginCredentials.containsKey(adminName)){
            if(loginCredentials.get(adminName).equals(adminPassCode)){
                enterInputs();
            }else{
                System.out.println("Please enter valid password "+adminName);
            }
        }
    }
    public void enterInputs() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new car name");
        String newCarName=sc.nextLine();
        System.out.println("Enter no.of services want to add");
        int numberOfServices=sc.nextInt();
        admin.addService(numberOfServices, newCarName);
    }
}
