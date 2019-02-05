package com.imooc.diveinspringboot.jl.spring.controller;import com.imooc.MyBatisUtil;import com.imooc.diveinspringboot.ICatagoryOperation;import com.imooc.diveinspringboot.jl.spring.model.TextFile;import org.apache.ibatis.session.SqlSession;import org.springframework.boot.autoconfigure.EnableAutoConfiguration;import org.springframework.web.bind.annotation.*;import org.springframework.web.multipart.MultipartFile;import java.io.IOException;@RestController@EnableAutoConfiguration@CrossOrigin(origins = "*", maxAge = 3600)public class FileUpdateController {    @RequestMapping(value = "/upload", method = RequestMethod.POST)    public int upload(@RequestParam("file") MultipartFile file) throws IOException {        SqlSession sqlSession = MyBatisUtil.getSqlSession();        ICatagoryOperation icatagoryOperation = sqlSession.getMapper(ICatagoryOperation.class);        TextFile filedata = new TextFile();        filedata.setData(file.getBytes());        filedata.setFilename(file.getOriginalFilename());        int result = icatagoryOperation.insertFile(filedata);        if (result > 0) {            sqlSession.commit();            System.out.println("添加成功");        } else            sqlSession.rollback();        MyBatisUtil.closeSession(sqlSession);        return result;    }}