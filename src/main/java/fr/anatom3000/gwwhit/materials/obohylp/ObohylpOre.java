package fr.anatom3000.gwwhit.materials.obohylp;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
public class ObohylpOre extends Block {
public ObohylpOre() {super(FabricBlockSettings.of(Material.STONE).strength(1.0640294887474742f,2.151694244997517f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));}

}