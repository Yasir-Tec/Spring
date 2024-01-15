package com.demo.service;

import com.demo.model.MyUser;

public interface loginService {

	MyUser validateUser(String unm, String passwd);

}
