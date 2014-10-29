package net.eekysam.torixienrings.mass;

public class BlackMass extends CanceledMass
{
	public static final BlackMass instance = new BlackMass();
	
	private BlackMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return MassType.WHITE;
	}
	
	@Override
	public MassType theorizeExternal()
	{
		return null;
	}
}
