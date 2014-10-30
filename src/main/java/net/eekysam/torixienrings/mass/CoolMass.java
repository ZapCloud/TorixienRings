package net.eekysam.torixienrings.mass;

public class CoolMass extends PureMass
{
	public static final CoolMass instance = new CoolMass();
	
	private CoolMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return MassType.WARM;
	}
	
	@Override
	public EnumMassCharge theorizeCharge()
	{
		return EnumMassCharge.NEGATIVE;
	}
	
	@Override
	public int getRawColor()
	{
		return 0xA6C8FF;
	}
}
