package com.clever.chen.springmvc.entity;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @author ChenWang
 * @className User
 * @date 2020/10/29 10:01
 * @since JDK 1.8
 */
@Repository
@Data
public class User {
    private Integer uid;
    private String username;
}
