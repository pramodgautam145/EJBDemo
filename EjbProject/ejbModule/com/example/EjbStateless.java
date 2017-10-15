package com.example;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EjbStateless
 */
@Stateless
@LocalBean
public class EjbStateless  {

	public String examplestatelesMethod()
	 {
		 System.out.println("hello first ejb project");
		return "welcome pramod first project";
	 }

}
