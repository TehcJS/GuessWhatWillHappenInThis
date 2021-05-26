package fr.anatom3000.gwwhit.materials.nefyf;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
public class NefyfRoot  {
public static final Nefyf NEFYF = new Nefyf();
public static final NefyfBlock NEFYF_BLOCK = new NefyfBlock();
public static final NefyfOre NEFYF_ORE = new NefyfOre();
public static final ArmorMaterial nefyfArmorMaterial = new NefyfArmorMaterial();
public static final NefyfHelmet NEFYF_HELMET = new NefyfHelmet(nefyfArmorMaterial);
public static final NefyfChestplate NEFYF_CHESTPLATE = new NefyfChestplate(nefyfArmorMaterial);
public static final NefyfLeggings NEFYF_LEGGINGS = new NefyfLeggings(nefyfArmorMaterial);
public static final NefyfBoots NEFYF_BOOTS = new NefyfBoots(nefyfArmorMaterial);
public static final NefyfSword NEFYF_SWORD = new NefyfSword(NefyfMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","nefyf"),NEFYF);
FuelRegistry.INSTANCE.add(NEFYF, 686);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "nefyf_block"), NEFYF_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "nefyf_block"), new BlockItem(NEFYF_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "nefyf_ore"), NEFYF_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "nefyf_ore"), new BlockItem(NEFYF_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","nefyf_helmet"),NEFYF_HELMET);
Registry.register(Registry.ITEM, new Identifier("gwwhit","nefyf_chestplate"),NEFYF_CHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","nefyf_leggings"),NEFYF_LEGGINGS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","nefyf_boots"),NEFYF_BOOTS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","nefyf_sword"),NEFYF_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_nefyf"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}