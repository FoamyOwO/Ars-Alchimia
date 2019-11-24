package com.foamy.aa.item;

import com.foamy.aa.Core;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class MoonlightGS extends ItemSword {

	public MoonlightGS() {
		super(ToolMaterial.IRON);
		setUnlocalizedName("moonlight_g_s");
		setTextureName(Core.MODID + ":moonlight_g_s");
		setCreativeTab(Core.creativeTab);
		
		//gay
		AAItems.ITEMS.add(this);
	}
	
	@Override
    public int getMaxItemUseDuration(ItemStack p_77626_1_)
    {
        return 3;
    }

}
