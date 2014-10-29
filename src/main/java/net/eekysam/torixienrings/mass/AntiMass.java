package net.eekysam.torixienrings.mass;

public class AntiMass extends SolidMass
{
	public static final AntiMass instance = new AntiMass();
	
	private AntiMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return MassType.NORMAL;
	}
}
