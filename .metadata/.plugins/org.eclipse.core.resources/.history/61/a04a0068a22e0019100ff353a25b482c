package com.apoo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.apoo.dao.CategoryDAO;
import com.apoo.model.Category;

@Controller
public class CategoryController {

	@Autowired
	CategoryDAO categoryDAO;
	
	@RequestMapping("/category")
public ModelAndView showCategory()
		{
		ModelAndView m = new ModelAndView();
		List<Category> listCategories =categoryDAO.listCategories();
	
		m.addObject("listCategories", listCategories);
		m.setViewName("Category");
		return m;
		
		}

@PostMapping(value="/addCategory")
public String addCategory(Model m, @RequestParam("catName")String CategoryName,@RequestParam("catDesc")String CategoryDesc)
		{
	Category category=new Category();
	category.setCategoryName(CategoryName);
	category.setCategoryDesc(CategoryDesc);
	categoryDAO.addCategory(category); 
	List<Category>listCategories=categoryDAO.listCategories();
	m.addAttribute("listCategories", listCategories);
	
	
	m.addAttribute("pageinfo", "Manage Category ");
return "Category";
		}
@PostMapping(value="/UpdateCategory")
public String UpdateCategory(Model m, @RequestParam("catId")int CategoryID,  @RequestParam("catName")String CategoryName,@RequestParam("catDesc")String CategoryDesc)
		{
	Category category=categoryDAO.getCategory(CategoryID);
	category.setCategoryName(CategoryName);
	category.setCategoryDesc(CategoryDesc);
	categoryDAO.updateCategory(category);
	
	List<Category>listCategories=categoryDAO.listCategories();
	m.addAttribute("listCategories", listCategories);
	
	
	m.addAttribute("pageinfo", "Manage Category ");
return "Category";
	 	}


@RequestMapping(value="/deleteCategory/{categoryID}")
public String deleteCategory(Model m, @PathVariable("categoryID")int categoryID)
{
	Category category=categoryDAO.getCategory(categoryID);
	categoryDAO.deleteCategory(category);
	
	List<Category>listCategories=categoryDAO.listCategories();
	m.addAttribute("listCategories", listCategories);
	
	m.addAttribute("pageinfo", "Manage Category");
	return "Category";
}
@RequestMapping(value="/editCategory/{categoryID}")
public String editCategory(Model m, @PathVariable("categoryID")int categoryID)
{
	Category category=categoryDAO.getCategory(categoryID);
	m.addAttribute("category", category);
	
	m.addAttribute("pageinfo", "Manage Category");
	return "UpdateCategory";

}
}
