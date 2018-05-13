package labs;

import java.util.*;

public class Staff {
	StaffMember[] staffList;
	//-----------------------------------------------------------------
	// Sets up the list of staff members.
	//-----------------------------------------------------------------
	public Staff ()
	{
	staffList = new StaffMember[8];
	staffList[0] = new Executive ("Sam", "123 Main Line",
	 "555-0469", "123-45-6789", 2423.07);
	staffList[1] = new Employee ("Carla", "456 Off Line",
	"555-0101", "987-65-4321", 1246.15);
	staffList[2] = new Employee ("Woody", "789 Off Rocker",
	"555-0000", "010-20-3040", 1169.23);
	staffList[3] = new Hourly ("Diane", "678 Fifth Ave.",
	 "555-0690", "958-47-3625", 10.55);
	staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.",
	"555-8374") ;
	staffList[5] = new Volunteer ("Cliff", "321 Duds Lane",
	"555-7282");
	staffList[6] = new Commission ("John", "289 Elm St", "777-7777", "169-69-6969", 6.25, 0.2);
	staffList[7] = new Commission ("Jane", "2048 Luther Blvd", "696-6969", "242-25-2525", 9.75, .15);
	((Commission)staffList[6]).addHours(35);
	((Commission)staffList[6]).addSales(400);
	((Commission)staffList[7]).addHours(40);
	((Commission)staffList[7]).addSales(450);
	((Executive)staffList[0]).awardBonus (500.00);
	((Hourly)staffList[3]).addHours (40);
	
	
	}
	//-----------------------------------------------------------------
	// Pays all staff members.
	//-----------------------------------------------------------------
	public void payday ()
    {
        double amount;
        List a1=new ArrayList();
        for(int x=0; x<staffList.length;x++){
            a1.add(staffList[x].pay());
        }
        Collections.sort(a1);
        System.out.println(a1);
        for (int count=0; count < staffList.length; count++){
            double temp = (double)a1.get(count);
            System.out.println(temp);
            for (int x=0; x < staffList.length; x++){
                if(temp==staffList[x].pay()){
                    System.out.println (staffList[x]);
                    if (temp == 0.0)
                        System.out.println ("Thanks!");
                    else
                        System.out.println ("Paid: " + temp);
                    System.out.println ("------------------------------------");
                    break;
                }
            }
	}
}
}
