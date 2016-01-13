package com.androtrackportal.domains;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by FMarube on 1/13/2016.
 */

@Entity
@Table(name = "roles")
public class Role extends AbstractDomain{

    @Column(name="name",unique = true)
    private String name;

    @ManyToMany(fetch = FetchType.EAGER,mappedBy = "roles")
    private Collection<Auth> users;

    @ManyToMany(fetch = FetchType.EAGER,cascade={ CascadeType.MERGE})
    @JoinTable(name = "roles_permissions", joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id") , inverseJoinColumns = @JoinColumn(name = "privilege_id", referencedColumnName = "id") )
    private Collection<Permission> permissions;


}
