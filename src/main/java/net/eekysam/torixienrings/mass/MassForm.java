package net.eekysam.torixienrings.mass;

import net.minecraft.block.Block;

public class MassForm
{
	public static enum EnumMassState
	{
		SOLID,
		FLUID,
		ABSTRACT;
		
		public static EnumMassState getState(Block block)
		{
			if (block.getMaterial().isLiquid())
			{
				return FLUID;
			}
			return SOLID;
		}
	}
	
	public final boolean isFormatted;
	public final EnumMassState state;
	public final MassType type;
	
	public MassForm(boolean isFormatted, EnumMassState state, MassType type)
	{
		this.isFormatted = isFormatted;
		this.state = state;
		this.type = type;
	}
	
	/**
	 * public static MassForm getForm(Block block) { return new MassForm(true,
	 * EnumMassState.getState(block), NormalMass.instance); }
	 * 
	 * public static MassForm getForm(Item item) {
	 * 
	 * }
	 * 
	 * public static MassForm getForm(ItemStack stack) {
	 * 
	 * }
	 * 
	 * public static MassForm getForm(Entity entity) {
	 * 
	 * }
	 **/
}
