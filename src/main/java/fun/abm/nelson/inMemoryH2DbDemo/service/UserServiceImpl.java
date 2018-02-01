package fun.abm.nelson.inMemoryH2DbDemo.service;

import fun.abm.nelson.inMemoryH2DbDemo.dao.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List getUserDetails() {
        return userRepository.findAll();
    }
}


