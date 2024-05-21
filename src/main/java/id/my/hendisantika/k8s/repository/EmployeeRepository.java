package id.my.hendisantika.k8s.repository;

import id.my.hendisantika.k8s.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-docker-kubernetes-sample
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Visit: https://s.id/hendisantika
 * Date: 21/05/24
 * Time: 08.20
 * To change this template use File | Settings | File Templates.
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
