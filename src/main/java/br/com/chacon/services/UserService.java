package br.com.chacon.services;

import br.com.chacon.domain.User;

public interface UserService {

    User findById(Integer id);
}
