package ro.ase.acs.prototype;

public class StoneBlock extends BuildingBlock {

	private Texture texture=null;

	public StoneBlock() {
		
		try {
			Thread.sleep(3000);
			texture=new Texture("stone");
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
           StoneBlock copy=(StoneBlock)super.clone();
           copy.texture = (Texture)texture.clone();
		return copy;
	}
}
