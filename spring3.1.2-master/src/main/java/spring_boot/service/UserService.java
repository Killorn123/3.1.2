package spring_boot.service;

import spring_boot.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void removeUserById(long id);

    Optional<User> getUserById(long id);

    List<User> getAllUsers();

    User getUserByUsername(String username);

    User getUserByEmail(String email);
}
