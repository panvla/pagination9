package com.vladimirpandurov.pagination9B.service;

import com.vladimirpandurov.pagination9B.domain.User;
import org.springframework.data.domain.Page;

public interface UserService {
    Page<User> getUsers(String name, int page, int size);
}
