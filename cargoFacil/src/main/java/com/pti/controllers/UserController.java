package com.pti.controllers;

import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pti.beans.UserTypeBean;
import com.pti.models.UserModel;

@RestController
public class UserController {
	@RequestMapping(value = "/getUserTypes", method = RequestMethod.GET)
	public LinkedList<UserTypeBean> getUserTypes() {
		return UserModel.getUserTypes();
	}
}
