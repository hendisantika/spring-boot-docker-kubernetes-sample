package id.my.hendisantika.k8s;

import id.my.hendisantika.k8s.entity.Employee;
import id.my.hendisantika.k8s.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDockerKubernetesSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerKubernetesSampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData(EmployeeService employeeService) {
        return (args -> {
            employeeService.createEmployee(new Employee("Itadori", "Yuji", "yuji@yopmail.com"));
            employeeService.createEmployee(new Employee("Fushiguro", "Megumi", "megumi@yopmail.com"));
            employeeService.createEmployee(new Employee("Satoru", "Gojo", "gojo@yopmail.com"));
            employeeService.createEmployee(new Employee("Aoi", "Todo", "todo@yopmail.com"));
            employeeService.createEmployee(new Employee("Ryomen", "Sukuna", "sukuna@yopmail.com"));
        });
    }
}
