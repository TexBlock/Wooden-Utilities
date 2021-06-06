package com.example.woodenutilities.common.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGen {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        if(event.includeClient()) {
            generator.addProvider(new ModBlockStateGenerator(generator, event.getExistingFileHelper()));
            generator.addProvider(new ModItemGenerator(generator, event.getExistingFileHelper()));
            generator.addProvider(new ModLangGenerator(generator));
        }
        if(event.includeServer()) {
            generator.addProvider(new ModRecipeGenerator(generator));
        }
    }
}