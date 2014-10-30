package net.eekysam.torixienrings.mass;

public class WhiteMass extends CanceledMass
{
	public static final WhiteMass instance = new WhiteMass();
	
	private WhiteMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return MassType.BLACK;
	}
	
	@Override
	public MassType theorizeExternal()
	{
		return MassType.NORMAL;
	}
	
	@Override
	public int getRawColor()
	{
		return 0xEDEDED;
	}
}
