package iguanaman.hungeroverhaul.module;

import net.minecraft.item.ItemStack;

import iguanaman.hungeroverhaul.util.RecipeRemover;
import mods.natura.common.NContent;

public class ModuleNatura
{

    public static void init()
    {
        RecipeRemover.removeAnyRecipe(new ItemStack(NContent.plantItem, 1, 1));
        RecipeRemover.removeAnyRecipe(new ItemStack(NContent.plantItem, 1, 2));
        RecipeRemover.removeFurnaceRecipe(NContent.plantItem, 1);
        RecipeRemover.removeFurnaceRecipe(NContent.plantItem, 2);
        //TODO get values for berries, berry medly here!
        //do we need seperate entries per meta???
        //FoodModifier.setModifiedFoodValues(NContent.berryItem, new FoodValues(0, 0F));
        //FoodModifier.setModifiedFoodValues(NContent.berryMedley, new FoodValues(0, 0F));
    }

    /*public static Block cactusNew;

    public static void init() {
    	String tempName;
    	
    	cactusNew = new IguanaCactus().setHardness(0.4F).setStepSound(Block.soundTypeCloth).setBlockName("cactus").setBlockTextureName("cactus");
    	tempName = Block.blockRegistry.getNameForObject(Blocks.cactus);
    	Blocks.cactus = cactusNew;
    	Utils.replace(Blocks.cactus, tempName);
    }*/

}
