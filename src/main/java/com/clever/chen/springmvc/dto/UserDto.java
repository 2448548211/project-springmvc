package com.clever.chen.springmvc.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ChenWang
 * @className UserDto
 * @date 2020/10/29 11:23
 * @since JDK 1.8
 */
@Data
public class UserDto implements Serializable {
    private Integer id;
    private String username;
    private AddressDto addressDto;
    private List<String> list;
}
