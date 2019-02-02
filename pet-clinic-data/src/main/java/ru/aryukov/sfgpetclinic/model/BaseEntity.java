package ru.aryukov.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by oaryukov on 03.02.2019.
 */
public class BaseEntity implements Serializable{

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
