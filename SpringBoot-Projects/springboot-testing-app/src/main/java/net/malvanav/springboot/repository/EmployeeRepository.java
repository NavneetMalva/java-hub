package net.malvanav.springboot.repository;

import net.malvanav.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Optional<Employee> findByLastName(String lastName);

    @Query("SELECT e from Employee e where e.email=:email")
    Employee findByEmail(@Param("email") String email);

    // define custom query using JPQL  with named parameters
    @Query("SELECT e from Employee e where e.firstName=:firstName AND e.lastName=:lastName")
    Employee findByFullName(@Param("firstName") String firstName, @Param("lastName") String lastName);

    // define custom query using JPQL  with index parameters
    @Query("SELECT e from Employee e where e.firstName=?1 AND e.lastName=?2")
    Employee findByFullNameIndex(String firstName, String lastName);

    // define custom query using Native SQL Query with index parameters
    @Query(value = "SELECT * from employees e where e.first_name=?1 AND e.last_name=?2", nativeQuery = true)
    Employee findByFullNameNativeIndex(String firstName, String lastName);

    // define custom query using Native SQL Query with named parameters
    @Query(value = "SELECT * from employees e where e.first_name=:firstName AND e.last_name=:lastName", nativeQuery = true)
    Employee findByFullNameNativeNamed(@Param("firstName") String firstName, @Param("lastName") String lastName);

}
