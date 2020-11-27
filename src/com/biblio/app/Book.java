package com.biblio.app;

public class Book {

	private String title;
	private String author;
	private int ref;
	
	public Book()
	{
		
	}
	
	public Book(String title, String author, int ref)
	{
		this.title = title;
		this.author = author;
		this.ref = ref;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setRef(int ref)
	{
		this.ref = ref;
	}
	
	public int getRef()
	{
		return ref;
	}
	
	@Override
	public String toString()
	{
		return "**"+ this.title +"**"+ this.author +"**"+ this.ref;
	}

}