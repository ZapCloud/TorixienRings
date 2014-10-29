package net.eekysam.torixienrings.mass;

public class WarmMass extends PureMass
{
	public static final WarmMass instance = new WarmMass();
	
	private WarmMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return MassType.COOL;
	}
	
	@Override
	public EnumMassCharge theorizeCharge()
	{
		return EnumMassCharge.POSITIVE;
	}
}
