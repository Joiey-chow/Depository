package com.example.demo.Mapper;
import java.util.List;

import com.example.demo.Bean.User;
public interface userMapper {
	
	List<User> getUserInfo();
	
	void updateStatus(String orderId,String status);
}
