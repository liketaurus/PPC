package testclasses;

import Employees.*;
public class EmployeesTest {

    public static void main(String args[]) {
        
        Artist art;
        Employee emp;
        
        String[] skills = {"Microsoft Word", "TeX", "OpenOffice", "Markdown"};
        Editor ed = new Editor(true, skills, "Phil Coulson", "Chief Editor", 3, "Publishing");
        Employee em = new Employee("Melinda May", "Assistant", 1, "Publishing");

        art = new Artist(skills);    
        Employee[] people = {ed, em,art};
        Manager man = new Manager(people, "Steve Ballmer", "CEO", 3, "Publishing");

        System.out.println(man);
        
//        art=ed;       
//        
//        if (art instanceof Editor)
//        System.err.println(((Editor)art).getPreferences());
//        
//        art = new Artist(skills);        
//        
//        System.out.println(art);
//        
//        emp =ed;
//        
//        System.out.println(ed);
        
  

//        Employee[] p =man.getEmployeesList();
//        System.out.println(p[1]);
    }
}
