package net.eekysam.torixienrings.mass;

public abstract class PureMass extends MassType
{
	@Override
	public MassType[] theorizeInternal()
	{
		return null;
	}
	
	@Override
	public MassType theorizeExternal()
	{
		return MassType.WHITE;
	}
	
	@Override
	public double potentialEnergy()
	{
		return 1.0D;
	}
	
	@Override
	public double volume()
	{
		return 1.0D;
	}
	
	@Override
	public double invertActivation()
	{
		return Double.POSITIVE_INFINITY;
	}
}