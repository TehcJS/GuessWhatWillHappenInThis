package fr.anatom3000.gwwhit.materials.kigys;

import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;

public class KigysBoots extends ArmorItem {
    public KigysBoots(ArmorMaterial material) {
        super(material, EquipmentSlot.FEET, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup));
    }

}