package com.androtrackportal.domains;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by FMarube on 1/13/2016.
 */

@MappedSuperclass
public class AbstractDomain  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true, updatable=false)
    private Long id;

    @Version
    private int version;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
