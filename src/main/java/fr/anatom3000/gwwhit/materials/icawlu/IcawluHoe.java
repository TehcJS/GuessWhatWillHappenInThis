package fr.anatom3000.gwwhit.materials.icawlu;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class IcawluHoe extends HoeItem {
    public IcawluHoe(ToolMaterial material) {
        super(material, 1, -1.3728713776891f, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}