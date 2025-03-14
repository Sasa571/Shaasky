package net.shaasha.shaasky.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shaasha.shaasky.Shaasky;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Shaasky.MOD_ID);

    public static final RegistryObject<Item> IRON_COAL   = ITEMS.register("iron_coal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_COAL   = ITEMS.register("copper_coal",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
