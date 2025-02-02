package github.jcsmecabricks.coffeevariants.event;

import github.jcsmecabricks.coffeevariants.CoffeeVariants;
import github.jcsmecabricks.coffeevariants.item.ModItems;
import github.jcsmecabricks.coffeevariants.villager.ModVillagers;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;

import java.util.List;

@EventBusSubscriber(modid = CoffeeVariants.MOD_ID, bus = EventBusSubscriber.Bus.GAME)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {

        if(event.getType() == ModVillagers.BARISTA.value()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 2),
                    new ItemStack(ModItems.COFFEE_ITEM.get(), 1), 15, 3, 0.04f
            ));
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.COCOA_BEANS, 5),
                    new ItemStack(Items.EMERALD, 1), 12, 5, 0.04f
            ));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 4),
                    new ItemStack(ModItems.LATTE.get(), 1), 12, 6, 0.04f
            ));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.MILK_BUCKET, 1),
                    new ItemStack(Items.EMERALD, 3), 12, 8, 0.04f
            ));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 4),
                    new ItemStack(ModItems.MOCHA.get(), 1), 12, 10, 0.04f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.SUGAR, 8),
                    new ItemStack(Items.EMERALD, 1), 12, 10, 0.04f
            ));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 5),
                    new ItemStack(ModItems.CAPPUCCINO.get(), 1), 12, 10, 0.04f
            ));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.ESPRESSO.get(), 1), 12, 12, 0.04f
            ));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.COOKIE, 6),
                    new ItemStack(Items.EMERALD, 1), 12, 10, 0.04f
            ));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 8),
                    new ItemStack(ModItems.AFFOGATO.get(), 1), 10, 20, 0.04f
            ));
        }
    }
}