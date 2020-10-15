package com.example.demo.Controller;

import java.util.List;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Result;
import com.example.demo.Bean.User;
import com.example.demo.Mapper.userMapper;

@RestController
public class searchController {
	@Resource
	userMapper userMapper;
	//从Mysql中查询所有用户数据的接口
    @ResponseBody
    @CrossOrigin
    @GetMapping("/findAll")
    public Map<String,Object> findAll(){
        Map<String,Object> map=new HashMap<>();
        List<User> results= userMapper.getUserInfo();
        System.out.println(results);
        map.put("results",results);
        return map;
    }
    
    @ResponseBody
    @CrossOrigin
    @PostMapping("/UpdateStatus")
    public Result updateStatus(User user){
    	String orderId = user.getOrderId();
    	String status = user.getStatus();
    	userMapper.updateStatus(orderId, status);
		return new Result(200);    	
    }
}
