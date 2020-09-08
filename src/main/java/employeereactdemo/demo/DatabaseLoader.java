package employeereactdemo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository){
        this.employeeRepository = repository;
    }

    @Override
    public void run(String... strings) throws Exception{
        this.employeeRepository.save(new Employee("Ayden","Ballard","Developer"));
        this.employeeRepository.save(new Employee("Bella","Ballard","Therapy Dog"));
    }

}
