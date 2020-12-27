package model.service;

import java.util.List;

import model.Category;

public interface ICategoryService {
	boolean checkExisted(String name);
	void insertCategory(Category cat);
	Category findCategoryById(String id);
	boolean updateCategory(Category cat);
	List<Category> listCategory();
	boolean deleteCategoryById(String id);
}
