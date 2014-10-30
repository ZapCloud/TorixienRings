package net.eekysam.torixienrings.mass;

public abstract class MassType
{
	public static enum EnumMassCharge
	{
		POSITIVE(1),
		NEGATIVE(-1),
		NEUTRAL(0);
		
		public final int charge;
		
		EnumMassCharge(int charge)
		{
			this.charge = charge;
		}
	}
	
	public static final MassType WARM = WarmMass.instance;
	public static final MassType COOL = CoolMass.instance;
	public static final MassType NORMAL = NormalMass.instance;
	public static final MassType ANTI = AntiMass.instance;
	public static final MassType ONIUM = OniumMass.instance;
	public static final MassType WHITE = WhiteMass.instance;
	public static final MassType BLACK = BlackMass.instance;
	
	public static final MassType[] types = new MassType[] { WARM, COOL, NORMAL, ANTI, ONIUM, WHITE, BLACK };
	
	public abstract MassType theorizeAnti();
	
	public abstract MassType[] theorizeInternal();
	
	public abstract MassType theorizeExternal();
	
	public abstract EnumMassCharge theorizeCharge();
	
	public abstract double potentialEnergy();
	
	public abstract double volume();
	
	public abstract double invertActivation();
	
	public abstract int getRawColor();
	
	public final double groundEnergy(double quantity)
	{
		return this.potentialEnergy() * quantity;
	}
	
	public final double volume(double quantity)
	{
		return this.volume() * quantity;
	}
}
