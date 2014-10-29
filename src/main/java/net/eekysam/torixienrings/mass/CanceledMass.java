package net.eekysam.torixienrings.mass;

public abstract class CanceledMass extends MassType
{
	@Override
	public double potentialEnergy()
	{
		return 0.5D;
	}
	
	@Override
	public double volume()
	{
		return 1.0D;
	}
	
	@Override
	public MassType[] theorizeInternal()
	{
		return new MassType[] { WarmMass.instance, CoolMass.instance };
	}
	
	@Override
	public EnumMassCharge theorizeCharge()
	{
		return EnumMassCharge.NEUTRAL;
	}
	
	@Override
	public double invertActivation()
	{
		return 6.0D;
	}
}
