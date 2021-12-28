package Homework.OOP;

public class Company {

    String companyName;
    String yearCompanyFounded;
    String companyField;
    String ownerOfCompany;

    Employee employee;

    public void hireEmployee(String employeeName,String title,int ssn) {
        employee = new Employee();
        employee.employeeName = employeeName;
        employee.title = title;
        employee.ssn = ssn;
    }

    public void fireEmployee() {
        employee = null;
    }

    public void printProperties() {
        System.out.println("The name of company: " + companyName + "\nThe year of the company founded: "
                + yearCompanyFounded + "\nThe field of the company: " + companyField + "\nThe owner of the company: "
                + ownerOfCompany);
        if (employee != null)
            employee.printProperties();

    }

}
