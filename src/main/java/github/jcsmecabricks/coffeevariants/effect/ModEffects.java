package github.jcsmecabricks.coffeevariants.effect;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEffects {
    public static final DeferredRegister<MobEffect> MOB_EFFECTS =
            DeferredRegister.create(BuiltInRegistries.MOB_EFFECT, CoffeeVariants.MOD_ID);

    public static final Holder<MobEffect> CAFFEINE_EFFECT = MOB_EFFECTS.register("caffeine",
            () -> new CaffeineEffect(MobEffectCategory.NEUTRAL, 14270550)
                    .addAttributeModifier(Attributes.MOVEMENT_SPEED,
                            ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "caffeine"), 4f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL)
                    .addAttributeModifier(Attributes.JUMP_STRENGTH,
                            ResourceLocation.fromNamespaceAndPath(CoffeeVariants.MOD_ID, "caffeine"), 1f,
                            AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));


    public static void register(IEventBus eventBus) {
        MOB_EFFECTS.register(eventBus);
    }
}
