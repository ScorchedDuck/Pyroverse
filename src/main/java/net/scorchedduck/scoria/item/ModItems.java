package net.scorchedduck.scoria.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.scorchedduck.scoria.Scoria;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Scoria.MOD_ID);

    public static final RegistryObject<Item> SCORCHED_INGOT = ITEMS.register("scorched_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SCORCHED_NUGGET = ITEMS.register("scorched_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
