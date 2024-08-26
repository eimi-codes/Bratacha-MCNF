package irish.eimi.bratacha.client.models;

import irish.eimi.bratacha.BratachaMod;
import irish.eimi.bratacha.common.entities.blocks.FlagBlockEntity;
import net.minecraft.client.renderer.texture.MissingTextureAtlasSprite;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FlagModel extends GeoModel<FlagBlockEntity> {
    @Override
    public ResourceLocation getModelResource(FlagBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID,"geo/block/flag.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FlagBlockEntity animatable) {
        ResourceLocation flagTexture = animatable.getFlag();
        if(flagTexture!=null)
            return ResourceLocation.fromNamespaceAndPath(flagTexture.getNamespace(),"textures/block/"+flagTexture.getPath()+".png");
        return MissingTextureAtlasSprite.getLocation();

    }

    @Override
    public ResourceLocation getAnimationResource(FlagBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(BratachaMod.MODID,"animations/block/flag.animation.json");
    }
}
