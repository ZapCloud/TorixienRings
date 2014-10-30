package net.eekysam.torixienrings.fluids;

import net.eekysam.torixienrings.mass.MassForm;
import net.minecraftforge.fluids.Fluid;

public class FluidTorixienMass extends Fluid
{
	public final MassForm form;
	
	public FluidTorixienMass(String fluidName, MassForm form)
	{
		super(fluidName);
		this.form = form;
	}
}
