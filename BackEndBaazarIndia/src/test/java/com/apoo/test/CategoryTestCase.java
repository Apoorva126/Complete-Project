package com.apoo.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apoo.dao.CategoryDAO;
import com.apoo.model.Category;

public class CategoryTestCase
{
	static CategoryDAO categoryDAO;
      @BeforeClass
      public static void executeFirst()
      {
    AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
  	    context.scan("com.apoo");
  	    context.refresh();  		
  	    categoryDAO=(CategoryDAO)context.getBean("categoryDAO");	 
      }

@Test
public void addCategoryTest()
{
	Category category=new Category();
	category.setCategoryName("Home Appliances");
	category.setCategoryDesc("All the required appliances");
	assertTrue("Problem in adding category",categoryDAO.addCategory(category));
	}

@Test
public void deleteCategoryTest()
{
	//Category category=categoryDAO.getCategory(41);
	
	//assertTrue("Problem in deleting category",categoryDAO.deleteCategory(category));
	}
@Test
public void updateCategoryTest()
{
	Category category=categoryDAO.getCategory(40);
	//category.setCategoryDesc("Window 7");
	//assertTrue("Problem in Updating category",categoryDAO.updateCategory(category));
	
	}

@Test
public void listCategoriesTest()
{
	List<Category> listCategories=categoryDAO.listCategories();
	assertTrue("Problem in Listing Categories",listCategories.size()>0);
	
	for(Category category:listCategories)
	{
		System.out.println("CategoryID:"+ category.getCategoryID());
		System.out.println("CategoryName: "+category.getCategoryName());
		System.out.println("Category Description"+category.getCategoryDesc());
		
		
	}
	
	}
}
