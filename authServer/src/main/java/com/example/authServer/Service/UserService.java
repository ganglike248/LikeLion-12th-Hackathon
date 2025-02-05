package com.example.authServer.Service;

import com.example.authServer.DTO.UserDTO;
import com.example.authServer.DTO.UserDetails;
import com.example.authServer.DTO.UsersEmailDTO;

public interface UserService {

    public UserDetails userSignup(UserDetails userDetails);

    public boolean existsByEmail(String email);

    public UserDetails getUserDetail(String email);

    public UserDetails updateUser(UserDetails user);

    public UsersEmailDTO getUsersEmail();

}
