package net.malvanav.springboot.repository;

import net.malvanav.springboot.model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

// Only to test Data Repository layer
@DataJpaTest
class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee employee;

    @BeforeEach
    public void setUpEmployee() {
        employee = Employee.builder()
                .firstName("John")
                .lastName("Smith")
                .email("john.smith@gmail.com")
                .build();
    }

    // Junit test case for save Employee operation
    @DisplayName("Junit test case for save Employee operation")
    @Test
    public void givenEmployeeObject_whenSave_thenReturnSaveEmployee() {

        // given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("John")
                .lastName("Smith")
                .email("john.smith@gmail.com")
                .build();

        // when - the action we are going to test
        Employee savedEmployee = employeeRepository.save(employee);

        // then - verify the output
        assertThat(savedEmployee).isNotNull();
        assertThat(savedEmployee.getId()).isGreaterThan(0);
    }

    // Junit test case for save Employee operation
    @DisplayName("Junit test case for save All Employee operation")
    @Test
    public void saveAllEmployees() {

        // given - precondition or setup
        Employee employee = Employee.builder()
                .firstName("John")
                .lastName("Smith")
                .email("john.smith@gmail.com")
                .build();

        Employee employee2 = Employee.builder()
                .firstName("Morty")
                .lastName("Senchez")
                .email("morty.senchez@gmail.com")
                .build();

        List<Employee> employees = List.of(employee, employee2);
        List<Employee> savedEmployees = employeeRepository.saveAll(employees);

        /**
         * or save both one by one
         * employeeRepository.save(employee);
         * employeeRepository.save(employee1);
         */


        // when - the action we are going to test
        List<Employee> fetch = employeeRepository.findAll();
        System.out.println("fetching all : " + fetch);

        // then - verify the output
        assertThat(savedEmployees).isNotNull();
        assertThat(savedEmployees.size()).isEqualTo(2);
    }

    // Unit test to get the employee by id operation
    @DisplayName("JUnit test to get the employee by id operation")
    @Test
    public void givenEmployeeObject_whenFind_thenReturnSaveEmployee() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        employeeRepository.save(employee);

        // when - the action we are going to test
        Employee fetchedEmp = employeeRepository.findById(employee.getId()).get();

        // then - verify the output
        assertThat(fetchedEmp).isNotNull();
        assertThat(fetchedEmp.getFirstName().toLowerCase()).isEqualTo("john");
    }


    // Unit test to get the employee by lastName operation using JPA Query Method
    @DisplayName("Unit test to get the employee by lastName operation")
    @Test
    public void givenEmployeeObject_whenFindByLastName_thenReturnEmployeeObject() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        employeeRepository.save(employee);

        // when - the action we are going to test
        Employee fetchedEmp = employeeRepository.findByLastName(employee.getLastName()).get();

        // then - verify the output
        assertThat(fetchedEmp).isNotNull();
        assertThat(fetchedEmp.getLastName().toLowerCase()).isEqualTo("smith");
    }


    // Unit test to get the employee by email operation using JPQL query
    @DisplayName("Unit test to get the employee by email operation")
    @Test
    public void givenEmployeeObject_whenFindByEmail_thenReturnEmployeeObject() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        employeeRepository.save(employee);

        // when - the action we are going to test
        Employee fetchedEmp = employeeRepository.findByEmail(employee.getEmail());

        // then - verify the output
        assertThat(fetchedEmp).isNotNull();
    }


    // Unit test to delete the employee
    @DisplayName("Unit test to delete the employee")
    @Test
    public void givenEmployeeObject_whenDeleteEmployee_thenRemoveEmployee() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        employeeRepository.save(employee);

        // when - the action we are going to test
        //employeeRepository.delete(employee);
        employeeRepository.deleteById(employee.getId());
        Optional<Employee> fetchedEmp = employeeRepository.findById(employee.getId());

        // then - verify the output
        assertThat(fetchedEmp).isEmpty();
    }

    // Unit test to find by  employee's fullName
    @DisplayName("Unit test to find the employee using fullName")
    @Test
    public void givenEmployeeObject_whenFindByName_thenFetchEmployee() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        employeeRepository.save(employee);

        // when - the action we are going to test
        Employee fetchedEmp = employeeRepository.findByFullName(employee.getFirstName(), employee.getLastName());
        System.out.println("fetchedEmp" + fetchedEmp);

        // then - verify the output
        assertThat(fetchedEmp).isNotNull();
        assertThat(fetchedEmp.getEmail()).isEqualTo("john.smith@gmail.com");
    }


    // Unit test to find by employee's fullName using JPA Native SQL Query with index params
    @DisplayName("Unit test to find the employee using fullName")
    @Test
    public void givenEmployeeObject_whenFindByNameNativeIndex_thenFetchEmployee() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        Employee savedEmp = employeeRepository.save(employee);

        // when - the action we are going to test
        Employee fetchedEmp = employeeRepository.findByFullNameNativeIndex(employee.getFirstName(), employee.getLastName());
        System.out.println("fetchedEmp" + fetchedEmp);

        // then - verify the output
        assertThat(fetchedEmp).isNotNull();
        assertThat(fetchedEmp.getEmail()).isEqualTo("john.smith@gmail.com");
    }

    // Unit test to find by employee's fullName by using JPA Native SQL query using named params
    @DisplayName("Unit test to find the employee using fullName")
    @Test
    public void givenEmployeeObject_whenFindByNameNativeNamed_thenFetchEmployee() {

        // given - precondition or setup
        // Now employee is coming from the employee which is getting created with @BeforeEach
        Employee savedEmp = employeeRepository.save(employee);

        // when - the action we are going to test
        Employee fetchedEmp = employeeRepository.findByFullNameNativeNamed(employee.getFirstName(), employee.getLastName());
        System.out.println("fetchedEmp" + fetchedEmp);

        // then - verify the output
        assertThat(fetchedEmp).isNotNull();
        assertThat(fetchedEmp.getEmail()).isEqualTo("john.smith@gmail.com");
    }


}