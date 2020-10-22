/**
 * Copyright (c) 2020 by fluxmeister. All rights reserved. 
 * vektorwebsolutions.com/determinator
 * 
 */
package com.vogella.model.task;

/**
 * @author fluxmeister
 *
 */
public class MainTest {

	public static void main(String[] args) {
        Task task = new TaskBuilder(5).setDescription("Hello").setSummary("Test").build();
        System.out.println(task);
    }
	
}
