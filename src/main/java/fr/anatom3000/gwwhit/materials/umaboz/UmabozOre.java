package fr.anatom3000.gwwhit.materials.umaboz;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
public class UmabozOre extends Block {
public UmabozOre() {super(FabricBlockSettings.of(Material.STONE).strength(4.48987759142475f,1.2928537118134944f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));}

}