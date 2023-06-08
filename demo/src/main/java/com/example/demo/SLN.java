package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("2")
public class SLN extends College
{
	void fee()
	{
		System.out.println(" College Fee 900000");
	}
}
