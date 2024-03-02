
public abstract class Art {
	public String title ;
	public String author ;
	public String description ;
	public abstract void viewArt();
	
	public Art(String title, String author, String description) {
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	
}
