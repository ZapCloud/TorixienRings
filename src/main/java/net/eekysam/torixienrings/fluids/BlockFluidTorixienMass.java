package net.eekysam.torixienrings.fluids;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraftforge.fluids.BlockFluidFinite;

public class BlockFluidTorixienMass extends BlockFluidFinite
{
	public BlockFluidTorixienMass(FluidTorixienMass fluid, MapColor color)
	{
		super(fluid, new MaterialLiquid(color));
	}
}
