package nl.mikee.sevento4.manager;

import nl.mikee.sevento4.domain.Employee;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mike on 26/11/2016.
 */
public class EmployeeManagerTest {
    @Test
    public void checkThatAddedEmployeeIsAvailable() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(101, "test"));

        assertThat(employeeManager.getEmployee(101).getName(), is("test"));

    }

    @Test
    public void checkThatDeletedEmployeeIsRemoved() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(101, "test"));

        assertThat(employeeManager.getNumberOfEmployees(), is(1));

        employeeManager.deleteEmployee(employeeManager.getEmployee(101));

        assertThat(employeeManager.getNumberOfEmployees(), is(0));

    }


    @Test
    public void checkThatWhen3EmployeesAreAddedTheManagerReturnListOf3Employees() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(101, "test"));
        employeeManager.addEmployee(new Employee(102, "test"));
        employeeManager.addEmployee(new Employee(103, "test"));

        assertThat(employeeManager.getEmployees().size(), is(3));


    }

    @Test
    public void checkThatManagerReturnFirstMikeWhenSearchFirstMike() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(101, "jan"));
        employeeManager.addEmployee(new Employee(102, "Mike"));
        employeeManager.addEmployee(new Employee(103, "Mike"));

        assertThat(employeeManager.getFirstEmployeeWithName("Mike").getId(), is(102) );
    }

    @Test
    public void checkThatWhen3EmployeesAreAddedTheManagerReturnCorrectCount() throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.addEmployee(new Employee(101, "test"));
        employeeManager.addEmployee(new Employee(102, "test"));
        employeeManager.addEmployee(new Employee(103, "test"));

        assertThat(employeeManager.getNumberOfEmployees(), is(3));
    }

}