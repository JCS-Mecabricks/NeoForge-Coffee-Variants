package github.jcsmecabricks.coffeevariants.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties COFFEE_FOOD = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final FoodProperties MOCHA = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.6f)
            .alwaysEdible()
            .build();

    public static final FoodProperties LATTE = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.7f)
            .alwaysEdible()
            .build();

    public static final FoodProperties ESPRESSO = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(1f)
            .alwaysEdible()
            .build();

    public static final FoodProperties CAPPUCCINO = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.6f)
            .alwaysEdible()
            .build();

    public static final FoodProperties AFFOGATO = new FoodProperties.Builder()
            .nutrition(13)
            .saturationModifier(1f)
            .alwaysEdible()
            .build();

}
