package menu;

import general.JAVAMART;
import java.util.*;
import hr.*;

/** This class will run the "Employees" section of the menu
 *
 * @author Marco Duarte
 */
public class EmployeeMenu extends MainMenu
{
//----------------------------------------------------------------------------//
//------Variables
    
    private boolean hrBool;
    private static int hrInput;
    
    //CONTRUCTOR
    public EmployeeMenu(boolean menuBool, boolean hrBool)
    {
        super(menuBool);
        
        this.hrBool = hrBool;
    }
//----------------------------------------------------------------------------//
//------GET Employee Menu
    public void getEmployeeMenu()
    {

    //-----WHILE, driving the Employee menu to loop
        while(hrBool)
        {
            //------display the employee message
            menu.MenuPrompts.getHRMessage();
            //------read & assign the hr input
            Scanner read = new Scanner(System.in);
            hrInput = Integer.parseInt(read.nextLine());
//----------------------------------------------------------------------------//
    //------selection statements
        //------display the employee list and details
            if(hrInput==1)
            {
            System.out.println("Run Employee Search HERE");

                //test employee
                //System.out.println(emp1);
                System.out.println("Employee search test");
                //prompt user for what employee they want to search 
                
            //emp testing 
                System.out.println(JAVAMART.Employees.toString());
                
                /** Run for loop to iterate through the employees in the
                 * Employees ArrayList
                 */ 

            }
        //------enter a new employee
            else if(hrInput==2)
            {
                System.out.println("Enter a new employee HERE");
                //employee test data
                //PartTimeEmployee emp1 = new  PartTimeEmployee
                //    ("Tony","Persson",50,"Sales Manager",2015,05,20,30000.00);

                //add test employee
                //JAVAMART.Employees.add(emp1);
                addNewEmp();
            
            }
//----------------------------------------------------------------------------//
        //------return to the main menu
            else if(hrInput==0)
            {
                hrBool = false;
                menu.MenuPrompts.getMainMenuMessage();
            }
            
        }//-----end of WHILE loop
    }//------end of GET Employee Menu   
//----------------------------------------------------------------------------//
//------methods
    //------run a for loop to search through the employee ArrayList 
    //by first and last names
    
    //------run a check for what kind of Employee the user wants to add
                 
    //------Add a new employee to the employee list
    public static void addNewEmp()
    {
        Scanner userInput = new Scanner(System.in);
        String firstName, lastName; 
        int age, year,  month,  day;
        double baseSalary;
        
        firstName = userInput.next();       
        lastName = userInput.next();
        age = userInput.nextInt();
        year = userInput.nextInt();
        month = userInput.nextInt();
        day = userInput.nextInt();
        baseSalary = userInput.nextInt();
        
        
        
    }
    
        
}//------end of Employee Menu

