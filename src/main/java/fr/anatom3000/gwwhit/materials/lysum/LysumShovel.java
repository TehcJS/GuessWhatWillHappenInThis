package fr.anatom3000.gwwhit.materials.lysum;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
public class LysumShovel extends ShovelItem {
public LysumShovel(ToolMaterial material) {super(material, 7, 0.024243380359354916f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));}

}