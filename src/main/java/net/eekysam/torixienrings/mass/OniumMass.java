package net.eekysam.torixienrings.mass;

public class OniumMass extends MassType
{
	public static final OniumMass instance = new OniumMass();
	
	private OniumMass()
	{
		
	}
	
	@Override
	public MassType theorizeAnti()
	{
		return this;
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
	public MassType theorizeExternal()
	{
		return null;
	}
	
	@Override
	public double potentialEnergy()
	{
		return 1.2D;
	}
	
	@Override
	public double volume()
	{
		return 0.8D;
	}
	
	@Override
	public double invertActivation()
	{
		return 0.0D;
	}
	
	@Override
	public int getRawColor()
	{
		return 0xF0F0F0;
	}
}
