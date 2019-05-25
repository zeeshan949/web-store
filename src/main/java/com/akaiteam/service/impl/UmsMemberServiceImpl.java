package com.akaiteam.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akaiteam.repository.UmsMemberRepository;
import com.akaiteam.service.UmsMemberService;
@Component
public class UmsMemberServiceImpl implements UmsMemberService {

	private static final long serialVersionUID = 1L;

	@Autowired
	private UmsMemberRepository umsMemberRepository;
	
	
	
}
