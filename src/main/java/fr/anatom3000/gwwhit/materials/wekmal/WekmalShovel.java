package fr.anatom3000.gwwhit.materials.wekmal;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class WekmalShovel extends ShovelItem {
    public WekmalShovel(ToolMaterial material) {
        super(material, 5, -0.49587940349985105f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}