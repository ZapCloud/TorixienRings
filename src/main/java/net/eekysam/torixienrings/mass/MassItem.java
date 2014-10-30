package net.eekysam.torixienrings.mass;

public class MassItem
{
	public MassForm type;
	public double freeEnergy;
	public double mass;
	
	public MassItem(MassForm type, double energy, double ammount)
	{
		this.type = type;
		this.freeEnergy = energy;
		this.mass = ammount;
	}
}
