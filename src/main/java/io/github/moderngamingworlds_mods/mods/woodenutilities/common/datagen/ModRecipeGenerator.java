package io.github.moderngamingworlds_mods.mods.woodenutilities.common.datagen;

import io.github.moderngamingworlds_mods.mods.woodenutilities.common.item.buckets.EnumWoodenBucket;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.tags.ItemTags;

import java.util.function.Consumer;

public class ModRecipeGenerator extends RecipeProvider {

    public ModRecipeGenerator(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
//        ShapedRecipeBuilder.shaped(ModItems.WOODEN_SHEARS.get())
//                .define('#', ItemTags.PLANKS)
//                .pattern(" #")
//                .pattern("# ")
//                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
//
//        EnumWoodenPlate.asList().forEach(plate -> plateRecipe(plate, consumer));
//        this.bucketRecipe(EnumWoodenBucket.EMPTY, consumer);
    }

//    private void plateRecipe(EnumWoodenPlate plate, Consumer<FinishedRecipe> consumer) {
//        ShapelessRecipeBuilder.shapeless(plate.getRegistryObject().get())
//                .requires(plate.getFromMaterial())
//                .requires(ModItems.WOODEN_SHEARS.get())
//                .unlockedBy("has_" + Objects.requireNonNull(plate.getFromMaterial().getRegistryName()).getPath()
//                        , has(plate.getFromMaterial()))
//                .save(consumer);
//    }

    private void bucketRecipe(EnumWoodenBucket bucket, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(bucket.getItem())
                .define('#', ItemTags.PLANKS)
                .pattern("# #")
                .pattern("# #")
                .pattern(" # ")
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(consumer);
    }
}
