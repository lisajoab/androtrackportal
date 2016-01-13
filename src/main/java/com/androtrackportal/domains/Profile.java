package com.androtrackportal.domains;

import javax.persistence.*;

/**
 * Created by FMarube on 1/12/2016.
 */

@Entity
@Table(name = "users")
public class Profile extends AbstractDomain {

    @Column(name = "firstname", nullable = false)
    private String firstname;

    @Column(name = "lastname", nullable = false)
    private String lastname;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "authId")
    private Auth auth;
}
