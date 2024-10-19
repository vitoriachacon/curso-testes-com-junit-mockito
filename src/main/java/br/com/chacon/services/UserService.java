package br.com.chacon.services;

import br.com.chacon.domain.User;
import br.com.chacon.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);

    User update(UserDTO obj);
}
