package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("1")
public class GECR extends College
{
	void fee()
	{
		System.out.println(" College Fee 700000");
	}
}
