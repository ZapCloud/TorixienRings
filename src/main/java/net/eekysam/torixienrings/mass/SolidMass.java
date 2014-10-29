package net.eekysam.torixienrings.mass;

public abstract class SolidMass extends MassType
{
	@Override
	public MassType[] theorizeInternal()
	{
		return new MassType[] { WhiteMass.instance };
	}
	
	@Override
	public MassType theorizeExternal()
	{
		return null;
	}
	
	@Override
	public double invertActivation()
	{
		return 24.0D;
	}
	
	@Override
	public EnumMassCharge theorizeCharge()
	{
		return EnumMassCharge.NEUTRAL;
	}
	
	@Override
	public double potentialEnergy()
	{
		return 0.4D;
	}
	
	@Override
	public double volume()
	{
		return 8.0D;
	}
}
