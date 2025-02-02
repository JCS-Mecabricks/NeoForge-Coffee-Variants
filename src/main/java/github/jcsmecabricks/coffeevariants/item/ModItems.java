package github.jcsmecabricks.coffeevariants.item;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CoffeeVariants.MOD_ID);

    public static final DeferredItem<Item> COFFEE_CUP = ITEMS.register("coffee_cup",
            () -> new Item(new Item.Properties()
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "coffee_cup")))));

    public static final DeferredItem<Item> COFFEE_ITEM = ITEMS.register("coffee_item",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "espresso")))
                    .food(ModFoodProperties.COFFEE_FOOD, ModDrinkProperties.COFFEE_DRINK)
                    .stacksTo(1)
                    .usingConvertsTo(ModItems.COFFEE_CUP.get())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "coffee_item")))));

    public static final DeferredItem<Item> MOCHA = ITEMS.register("mocha",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "espresso")))
                    .food(ModFoodProperties.MOCHA, ModDrinkProperties.COFFEE_DRINK)
                    .stacksTo(1)
                    .usingConvertsTo(ModItems.COFFEE_CUP.get())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "mocha")))));

    public static final DeferredItem<Item> LATTE = ITEMS.register("latte",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "espresso")))
                    .food(ModFoodProperties.LATTE, ModDrinkProperties.COFFEE_DRINK)
                    .stacksTo(1)
                    .usingConvertsTo(ModItems.COFFEE_CUP.get())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "latte")))));

    public static final DeferredItem<Item> CAPPUCCINO = ITEMS.register("cappuccino",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "espresso")))
                    .food(ModFoodProperties.CAPPUCCINO, ModDrinkProperties.COFFEE_DRINK)
                    .stacksTo(1)
                    .usingConvertsTo(ModItems.COFFEE_CUP.get())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "cappuccino")))));

    public static final DeferredItem<Item> AFFOGATO = ITEMS.register("affogato",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "espresso")))
                    .food(ModFoodProperties.AFFOGATO)
                    .stacksTo(1)
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "affogato")))));

    public static final DeferredItem<Item> ESPRESSO = ITEMS.register("espresso",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "espresso")))
                    .food(ModFoodProperties.ESPRESSO, ModDrinkProperties.CAFFEINE_EFFECT)
                    .food(ModFoodProperties.ESPRESSO, ModDrinkProperties.ESPRESSO_DRINK)
                    .stacksTo(1)
                    .usingConvertsTo(ModItems.COFFEE_CUP.get())
                    .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath
                            (CoffeeVariants.MOD_ID, "espresso")))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

