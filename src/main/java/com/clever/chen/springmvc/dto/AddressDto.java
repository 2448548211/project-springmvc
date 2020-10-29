package com.clever.chen.springmvc.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ChenWang
 * @className Address
 * @date 2020/10/29 11:25
 * @since JDK 1.8
 */
@Data
public class AddressDto implements Serializable {
    private Integer id;
    private String city;
}
