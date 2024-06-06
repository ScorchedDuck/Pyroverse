package net.scorchedduck.scoria.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.scorchedduck.scoria.Scoria;
import net.scorchedduck.scoria.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Scoria.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCORIA_TAB = CREATIVE_MODE_TABS.register("scoria_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCORCHED_INGOT.get()))
                    .title(Component.translatable("creativetab.scoria_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SCORCHED_INGOT.get());

                        pOutput.accept(ModBlocks.SCORCHED_STONE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
