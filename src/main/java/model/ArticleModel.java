package model;

public class ArticleModel extends BaseModel<ArticleModel> {
	
	private String title;
	private String description;
	private String content;
	private String thumnail;
	private String slug;
	private String userId;
	private String categoryId;
	private String tagId;
	
	public ArticleModel() {
	}

	public ArticleModel(String title, String description, String content, String thumnail,
			String slug, String userId, String categoryId, String tagId) {
		this.title = title;
		this.description = description;
		this.content = content;
		this.thumnail = thumnail;
		this.slug = slug;
		this.userId = userId;
		this.categoryId = categoryId;
		this.tagId = tagId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getThumnail() {
		return thumnail;
	}

	public void setThumnail(String thumnail) {
		this.thumnail = thumnail;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getTagId() {
		return tagId;
	}

	public void setTagId(String tagId) {
		this.tagId = tagId;
	}	
}
