package ro.ase.acs.flyweight;

public class CustomFontCharacter implements CustomCharacter{

	private char character;
	private String font;
	private int fontSize;
	private boolean isBold;
	private boolean isItalic;
	
	
	public CustomFontCharacter(char character, String font) {
		super();
		this.character = character;
		this.font = font;
	}


	public char getCharacter() {
		return character;
	}


	public String getFont() {
		return font;
	}


	public int getFontSize() {
		return fontSize;
	}


	public boolean isBold() {
		return isBold;
	}


	public boolean isItalic() {
		return isItalic;
	}


	public void setCharacter(char character) {
		this.character = character;
	}


	public void setFont(String font) {
		this.font = font;
	}


	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}


	public void setBold(boolean isBold) {
		this.isBold = isBold;
	}


	public void setItalic(boolean isItalic) {
		this.isItalic = isItalic;
	}


	@Override
	public void display(Location location) {
		System.out.println(character + " @" + location.getX() + ", "
				+ location.getY());
	}

}
