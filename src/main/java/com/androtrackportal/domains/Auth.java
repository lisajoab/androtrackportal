package com.androtrackportal.domains;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by FMarube on 1/12/2016.
 */
@Entity
@Table(name = "auth")
public class Auth  extends AbstractDomain{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true, updatable=false)
    private Long id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    @Column
    private boolean enabled;

    @Column
    private boolean tokenExpired;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id") , inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") )
    private Collection<Role> roles;

    @OneToOne(mappedBy = "auth", fetch = FetchType.EAGER)
    private Profile profile;

}
