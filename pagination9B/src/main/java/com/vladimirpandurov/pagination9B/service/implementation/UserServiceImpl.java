package com.vladimirpandurov.pagination9B.service.implementation;

import com.vladimirpandurov.pagination9B.domain.User;
import com.vladimirpandurov.pagination9B.repository.UserRepository;
import com.vladimirpandurov.pagination9B.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Page<User> getUsers(String name, int page, int size) {
        log.info("Fetching users for page {} of size {}",page, size);
        return userRepository.findByNameContaining(name, PageRequest.of(page, size));
    }
}
