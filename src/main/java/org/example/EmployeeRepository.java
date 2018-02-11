package org.example;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "employee", path = "employees")
public interface EmployeeRepository extends MongoRepository<Employee, String>
{
    @RestResource(path="byName")
    public List<Employee> findByFirstName(@Param("name") String firstName);


}
