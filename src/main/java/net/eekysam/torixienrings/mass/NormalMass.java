package net.eekysam.torixienrings.mass;

public class NormalMass extends SolidMass
{
	public static final NormalMass instance = new NormalMass();
	
	private NormalMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return MassType.ANTI;
	}
	
	@Override
	public int getRawColor()
	{
		return 0x808080;
	}
}
