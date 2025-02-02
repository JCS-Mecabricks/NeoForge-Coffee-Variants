package github.jcsmecabricks.coffeevariants.villager;

import com.google.common.collect.ImmutableSet;
import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import github.jcsmecabricks.coffeevariants.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(BuiltInRegistries.POINT_OF_INTEREST_TYPE, CoffeeVariants.MOD_ID);

    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(BuiltInRegistries.VILLAGER_PROFESSION, CoffeeVariants.MOD_ID);

    public static final Holder<PoiType> BARISTA_POI = POI_TYPES.register("barista_poi",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.COFFEE_STATION.get().getStateDefinition().getPossibleStates()), 1, 1));

    public static final Holder<VillagerProfession> BARISTA = VILLAGER_PROFESSIONS.register("barista",
            () -> new VillagerProfession("barista", holder -> holder.value() == BARISTA_POI.value(),
                    poiTypeHolder -> poiTypeHolder.value() == BARISTA_POI.value(), ImmutableSet.of(), ImmutableSet.of(),
                    SoundEvents.VILLAGER_WORK_LIBRARIAN));

    public static void register(IEventBus eventBus) {
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
