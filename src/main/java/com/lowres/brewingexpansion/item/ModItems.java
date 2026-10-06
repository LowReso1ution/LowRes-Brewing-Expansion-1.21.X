package com.lowres.brewingexpansion.item;

import com.lowres.brewingexpansion.BrewingExpansion;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BrewingExpansion.MODID);

    public static final DeferredItem<Item> THISTLE = ITEMS.register("thistle",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);

    }

}
