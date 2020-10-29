package com.clever.chen.springmvc.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author ChenWang
 * @className UserRequestParam
 * @date 2020/10/29 14:34
 * @since JDK 1.8
 */
@Data
public class UserRequestParam implements Serializable {
    private String username;
    private Integer age;
    private List<AddressDto> addresses;
}
