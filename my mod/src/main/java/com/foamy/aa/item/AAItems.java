package com.foamy.aa.item;

import java.util.ArrayList;
import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class AAItems {

	public static List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item MOONLIGHTGS = new MoonlightGS();
	
	public static void init() {
		
		for (int i = 0; i < ITEMS.size(); i++) {
			GameRegistry.registerItem(ITEMS.get(i), ITEMS.get(i).getUnlocalizedName());
			
		}
	}
	
}
