package fr.anatom3000.gwwhit.materials.kigys;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorMaterial;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
public class KigysRoot  {
public static final Kigys KIGYS = new Kigys();
public static final KigysBlock KIGYS_BLOCK = new KigysBlock();
public static final KigysOre KIGYS_ORE = new KigysOre();
public static final KigysShovel KIGYS_SHOVEL = new KigysShovel(KigysMaterial.INSTANCE);
public static final KigysPickaxe KIGYS_PICKAXE = new KigysPickaxe(KigysMaterial.INSTANCE);
public static final KigysAxe KIGYS_AXE = new KigysAxe(KigysMaterial.INSTANCE);
public static final KigysHoe KIGYS_HOE = new KigysHoe(KigysMaterial.INSTANCE);
public static final ArmorMaterial kigysArmorMaterial = new KigysArmorMaterial();
public static final KigysHelmet KIGYS_HELMET = new KigysHelmet(kigysArmorMaterial);
public static final KigysChestplate KIGYS_CHESTPLATE = new KigysChestplate(kigysArmorMaterial);
public static final KigysLeggings KIGYS_LEGGINGS = new KigysLeggings(kigysArmorMaterial);
public static final KigysBoots KIGYS_BOOTS = new KigysBoots(kigysArmorMaterial);
public static final KigysSword KIGYS_SWORD = new KigysSword(KigysMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys"),KIGYS);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "kigys_block"), KIGYS_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "kigys_block"), new BlockItem(KIGYS_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "kigys_ore"), KIGYS_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "kigys_ore"), new BlockItem(KIGYS_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_shovel"),KIGYS_SHOVEL);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_pickaxe"),KIGYS_PICKAXE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_axe"),KIGYS_AXE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_hoe"),KIGYS_HOE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_helmet"),KIGYS_HELMET);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_chestplate"),KIGYS_CHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_leggings"),KIGYS_LEGGINGS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_boots"),KIGYS_BOOTS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","kigys_sword"),KIGYS_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_kigys"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}