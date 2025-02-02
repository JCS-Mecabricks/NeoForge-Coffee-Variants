package github.jcsmecabricks.coffeevariants.item;

import github.jcsmecabricks.coffeevariants.effect.ModEffects;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModDrinkProperties {
    public static final Consumable COFFEE_DRINK = defaultDrink().build();

    public static final Consumable ESPRESSO_DRINK = defaultDrink()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(ModEffects.CAFFEINE_EFFECT, 1800)))
            .build();


    public static Consumable.Builder defaultDrink() {
        return Consumable.builder().consumeSeconds(2F).animation(ItemUseAnimation.DRINK).sound(SoundEvents.GENERIC_DRINK).hasConsumeParticles(false);
    }

    public static final Consumable CAFFEINE_EFFECT = Consumables.defaultDrink().onConsume(
            new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 400), 0.35f)).build();
}