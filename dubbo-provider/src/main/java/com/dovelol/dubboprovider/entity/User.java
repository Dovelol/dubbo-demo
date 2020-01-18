package com.dovelol.dubboprovider.entity;

import java.io.Serializable;

/**
 * TODO 类实现描述
 *
 * @author yuanzheng
 * @since 2020年1月11日 下午2:03:24
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2760171244679210763L;

    private Long              id;

    private String            name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
