package br.com.chacon.services;

import br.com.chacon.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
