import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        DataBaseHandler dbHandler = new DataBaseHandler();
        //dbHandler.DispAllEmployee();
        System.out.println("Displayed All Employees");
        //dbHandler.DispEmployeeWithRole("manager");
        System.out.println("Displayed All Employees with the role");
        //dbHandler.DispEmployeeWithUsername("emir5757");
        //dbHandler.DispEmployeeWithNameSurname("Emir","Özen");
        //dbHandler.HireEmployee("dummyvolkan", "Volkan", "Erdoğan", "intern", "0523432", "2022.11.01", "2022.12.2", "bozoman");
        dbHandler.FireEmployee(22,"dummyvolkan","Volkan","Erdoğan");

        Scanner scanner = new Scanner(System.in);
        Authenticator authenticator = new Authenticator();
        Employee currUser = null;


        while(currUser == null)
        {
            System.out.println("Username: ");
            String userName = scanner.nextLine();

            System.out.println("Password: ");
            String password = scanner.nextLine();

            currUser = authenticator.login(userName,password);

            if(currUser == null)
            {
                System.out.println("Login failed. Please try again.");
            }
        }

        if(currUser instanceof Manager)
        {

        }
        else if (currUser instanceof RegularEmployee) 
        {
            
        }

        authenticator.logout();
        scanner.close();


    }
    
}
