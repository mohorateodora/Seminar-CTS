package ro.ase.acs.prototype;

public class WoodBlock extends BuildingBlock{
private Texture texture=null;

	public WoodBlock() {
		System.out.println("Loading textures...");
		try {
			Thread.sleep(3000);
			texture=new Texture("wood");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	@Override
	public void render() {
		System.out.println(String.format("The %s block was rander at %d %d %d",
				texture.getName(),getX(),getY(),getZ()));
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
           WoodBlock copy=(WoodBlock)super.clone();
           copy.texture = (Texture)texture.clone();
		return copy;
	}

}
