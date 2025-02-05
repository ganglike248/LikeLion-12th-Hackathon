package com.example.authServer.Entity;

import com.example.authServer.DTO.UserDetails;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true, length = 30)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phoneNumber;

    private String roadAddress;

    private String detailAddress;


    private String role;

//    @Column(nullable = false)
//    private String phoneNum;
//
//    private String imgUrl;

    public void updateUser(UserDetails user, String userPassword){
        this.password = userPassword;
        this.phoneNumber = user.getPhoneNumber();
        this.roadAddress = user.getRoadAddress();
        this.detailAddress = user.getDetailAddress();
    }

}
