package net.shaasha.shaasky.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.shaasha.shaasky.Shaasky;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> SHAASKY_MACHINES = tag("shaasky_machines");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Shaasky.MOD_ID, name));
        }
    }


    public static class Items {


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Shaasky.MOD_ID, name));
        }
    }
}
