package net.hapon.potluckmodern.item;

import net.hapon.potluckmodern.PotluckModern;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PotluckModern.MOD_ID);

    public static final RegistryObject<Item> COOKING_RECIPE = ITEMS.register("cooking_recipe",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POT = ITEMS.register("pot",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
