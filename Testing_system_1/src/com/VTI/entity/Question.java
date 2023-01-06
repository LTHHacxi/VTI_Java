package com.VTI.entity;

import java.time.LocalDate;

public class Question {
	public int id;
	public String Content;
	public CategoryQuestion categoryQS;
	public TypeQuestion typeQS;
	public Account creator;
	public LocalDate createDate;
}
