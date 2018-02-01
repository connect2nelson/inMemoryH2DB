package fun.abm.nelson.inMemoryH2DbDemo.dao;

import fun.abm.nelson.inMemoryH2DbDemo.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends JpaRepository<UserDetails, Long> {
    //UserDetails findByFirstName(String name);
}