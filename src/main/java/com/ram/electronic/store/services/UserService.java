package com.ram.electronic.store.services;

import com.ram.electronic.store.dtos.PageableResponse;
import com.ram.electronic.store.dtos.UserDto;
import com.ram.electronic.store.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    //create
    UserDto createUser(UserDto userDto);


    //update
    UserDto updateUser(UserDto userDto, String userId);

    //delete
    void deleteUser(String userId);


    //get all users
    PageableResponse<UserDto> getAllUser(int pageNumber, int pageSize, String sortBy, String sortDir);



    //get single user by id
    UserDto getUserById(String userId);

    //get  single user by email
    UserDto getUserByEmail(String email);

    //search user
    List<UserDto> searchUser(String keyword);

    //other user specific features

    Optional<User> findUserByEmailOptional(String email);

}
