package fr.anatom3000.gwwhit.materials.mafab;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class MafabRoot {
    public static final Item MAFAB = new Item(new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    public static final Block MAFAB_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.489282987438932f, 4.288498110418534f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block MAFAB_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(1.2086324757403393f, 1.127308210678227f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));
    public static final MafabShovel MAFAB_SHOVEL = new MafabShovel(MafabMaterial.INSTANCE);
    public static final MafabPickaxe MAFAB_PICKAXE = new MafabPickaxe(MafabMaterial.INSTANCE);
    public static final MafabAxe MAFAB_AXE = new MafabAxe(MafabMaterial.INSTANCE);
    public static final MafabHoe MAFAB_HOE = new MafabHoe(MafabMaterial.INSTANCE);
    public static final ArmorMaterial mafabArmorMaterial = new MafabArmorMaterial();
    public static final MafabHelmet MAFAB_HELMET = new MafabHelmet(mafabArmorMaterial);
    public static final MafabChestplate MAFAB_CHESTPLATE = new MafabChestplate(mafabArmorMaterial);
    public static final MafabLeggings MAFAB_LEGGINGS = new MafabLeggings(mafabArmorMaterial);
    public static final MafabBoots MAFAB_BOOTS = new MafabBoots(mafabArmorMaterial);

    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab"), MAFAB);
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "mafab_block"), MAFAB_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_block"), new BlockItem(MAFAB_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.BLOCK, new Identifier("gwwhit", "mafab_ore"), MAFAB_ORE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_ore"), new BlockItem(MAFAB_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_shovel"), MAFAB_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_pickaxe"), MAFAB_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_axe"), MAFAB_AXE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_hoe"), MAFAB_HOE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_helmet"), MAFAB_HELMET);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_chestplate"), MAFAB_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_leggings"), MAFAB_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("gwwhit", "mafab_boots"), MAFAB_BOOTS);
        RegistryKey<ConfiguredFeature<?, ?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit", "ore_mafab"));
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
    }

    public void onInitializeClient() {

    }
}