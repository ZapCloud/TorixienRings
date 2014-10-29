package net.eekysam.torixienrings.mass;

public class MassItem
{
	public MassType type;
	public double freeEnergy;
	public double mass;
	
	public MassItem(MassType type, double energy, double ammount)
	{
		this.type = type;
		this.freeEnergy = energy;
		this.mass = ammount;
	}
}
