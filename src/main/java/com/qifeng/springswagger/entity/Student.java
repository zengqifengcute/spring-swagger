package com.qifeng.springswagger.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/13 16:23
 */
@ApiModel
@Data
public class Student {
    @ApiModelProperty("student Id")
    private Integer id;
    @ApiModelProperty("student 姓名")
    private String username;
    @ApiModelProperty("student 密码")
    private String password;
}
