package Homework.OOP;

public class Main {

    public static void main(String[] args) {

        Company myCompany = new Company();

        myCompany.companyName = "IBM";
        myCompany.companyField = "IT";
        myCompany.ownerOfCompany = "Kenny";
        myCompany.yearCompanyFounded = "092001";

        myCompany.hireEmployee("Tom","Software engineer", 152124521);
        //myCompany.hireEmployee("Peter","Test engineer",854169652);

        myCompany.printProperties();


        myCompany.fireEmployee();

        myCompany.printProperties();


    }

}
