package com.qifeng.springswagger.controller;

import com.qifeng.springswagger.entity.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zengqifeng
 * @version 1.0
 * @date 2019/12/13 16:31
 */
@Api("学生相关接口")
@RestController
@RequestMapping("Student")
public class StudentController {
    /**
     * 单个参数、多个参数     @RequestBody类型参数（json格式）
     * response如何处理？
      * @param id
     * @return
     */


    //单个参数
    @ApiOperation("根据id查询student")
    @ApiImplicitParam(name = "id", value = "编号", defaultValue = "1", required = true, dataType = "int(11)")
    @GetMapping("getStudentInfoById")
    public Student getStudentInfoById(Integer id) {
        Student student = new Student();
        student.setId(1);
        student.setUsername("二哈");
        student.setPassword("123");
        return student;
    }

    //多个参数
    @ApiOperation("根据id和username查询student")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "编号", defaultValue = "1", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "username", value = "姓名", defaultValue = "二哈", required = true, dataType = "String")
    })
    @GetMapping("getStudentInfoByIdAndUsername")
    public Student getStudentInfoByIdAndUsername(Integer id, String username) {
        Student student = new Student();
        student.setId(1);
        student.setUsername("二哈");
        student.setPassword("123");
        return student;
    }


    //requestBody类型参数  其文档注释写在bean类中
    @ApiOperation("新增student")
    @PostMapping("insertStudent")
    public Student insertStudent(@RequestBody Student student) {

        return student;
    }
}
