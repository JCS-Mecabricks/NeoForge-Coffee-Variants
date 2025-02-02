package github.jcsmecabricks.coffeevariants.item;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import github.jcsmecabricks.coffeevariants.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoffeeVariants.MOD_ID);

    public static final Supplier<CreativeModeTab> COFFEE_TAB = CREATIVE_MODE_TAB.register("coffee_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COFFEE_CUP.get()))
                    .title(Component.translatable("itemGroup.coffeevariants.coffee_group"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.COFFEE_CUP.get());
                        output.accept(ModItems.ESPRESSO.get());
                        output.accept(ModItems.COFFEE_ITEM.get());
                        output.accept(ModItems.MOCHA.get());
                        output.accept(ModItems.LATTE.get());
                        output.accept(ModItems.CAPPUCCINO.get());
                        output.accept(ModItems.AFFOGATO.get());
                        output.accept(ModBlocks.COFFEE_STATION.get());
                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
