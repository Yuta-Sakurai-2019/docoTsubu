package model;

public class Mutter {

	private String userName; //ユーザー名
	private String text; //投稿内容
	public Mutter() {
		
	}
	public Mutter(String userName, String text) {
		this.userName = userName;
		this.text = text;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getText() {
		return text;
	}
}
