package com.infamous.dungeons_mobs.client.renderer.summonables;

import com.infamous.dungeons_mobs.DungeonsMobs;
import com.infamous.dungeons_mobs.client.models.summonables.GeomancerConstructModel;
import com.infamous.dungeons_mobs.client.models.summonables.IceCloudModel;
import com.infamous.dungeons_mobs.client.renderer.illager.IceologerRenderer;
import com.infamous.dungeons_mobs.client.renderer.layer.GeoEyeLayer;
import com.infamous.dungeons_mobs.entities.illagers.IceologerEntity;
import com.infamous.dungeons_mobs.entities.summonables.GeomancerBombEntity;
import com.infamous.dungeons_mobs.entities.summonables.IceCloudEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class IceCloudRenderer extends GeoEntityRenderer<IceCloudEntity> {
	public IceCloudRenderer(EntityRendererManager renderManager) {
		super(renderManager, new IceCloudModel());
		//this.addLayer(new GeoHeldItemLayer<>(this, 0.0, 0.0, 0.5));
	}
	
	protected void applyRotations(IceCloudEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks,
								  float rotationYaw, float partialTicks) {

		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
	}

	@Override
	public RenderType getRenderType(IceCloudEntity animatable, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
