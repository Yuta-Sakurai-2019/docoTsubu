package model;

public class Mutter {

	private int id;
	private String userName; //ユーザー名
	private String text; //投稿内容
	
	public Mutter() {
		//何もしない
	}
	public Mutter(int id, String userName, String text) {
		this.id = id;
		this.userName = userName;
		this.text = text;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getText() {
		return text;
	}
}
