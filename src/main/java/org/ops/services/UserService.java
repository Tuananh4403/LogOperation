package org.ops.services;

import org.ops.models.UserDTO;
import org.ops.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);

    User findByEmail(String email);

    List<UserDTO> findAllUsers();
}
