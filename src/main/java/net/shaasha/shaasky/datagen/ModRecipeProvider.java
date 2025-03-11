package net.shaasha.shaasky.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.shaasha.shaasky.item.ModItems;
import net.shaasha.shaasky.util.ModTags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.COPPER_COAL.get())
                .pattern("III")
                .pattern("ICI")
                .pattern("III")
                .define('I', Items.COPPER_INGOT)
                .define('C', Items.COAL)
                .unlockedBy(getHasName(Items.COAL), has(Items.COAL))
                .save(pWriter);
    }
}
