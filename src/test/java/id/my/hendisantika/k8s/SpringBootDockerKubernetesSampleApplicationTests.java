package id.my.hendisantika.k8s;

import id.my.hendisantika.k8s.entity.Employee;
import id.my.hendisantika.k8s.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@Testcontainers
@SpringBootTest(
        properties = {
                "management.endpoint.health.show-details=always",
                "spring.datasource.url=jdbc:tc:mysql:8.4.0:///employeeDB"
        },
        webEnvironment = RANDOM_PORT
)
class SpringBootDockerKubernetesSampleApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @BeforeEach
    void deleteAll() {
        employeeRepository.deleteAll();
    }

    @Test
    void createNewBook() {
        Employee employee = new Employee();
        employee.setId(1L);
        employee.setFirstName("Itadori");
        employee.setLastName("Yuji");
        employee.setEmailId("yuji@yopmail.com");
        employeeRepository.save(employee);

        long count = employeeRepository.count();
        Assertions.assertEquals(1, count);
    }

}
