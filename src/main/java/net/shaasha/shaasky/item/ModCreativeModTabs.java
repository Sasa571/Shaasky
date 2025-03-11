package net.shaasha.shaasky.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shaasha.shaasky.Shaasky;
import net.shaasha.shaasky.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Shaasky.MOD_ID);


    public static final RegistryObject<CreativeModeTab> SHAASKY_TAB = CREATIVE_MODE_TABS.register("shaasky_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COPPER_COAL.get()))
                    .title(Component.translatable("creativetab.shaasky_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COPPER_COAL.get());
                        output.accept(ModItems.IRON_COAL.get());
                        output.accept(ModBlocks.HEAT_FURNACE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
