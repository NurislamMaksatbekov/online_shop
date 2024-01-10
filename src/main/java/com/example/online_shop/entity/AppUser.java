package com.example.online_shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "users")
public class AppUser {
    @Id
    private String email;
    private String name;
    private String password;
    private Boolean enabled;
    @OneToOne(mappedBy = "user")
    private Cart cart;
}
