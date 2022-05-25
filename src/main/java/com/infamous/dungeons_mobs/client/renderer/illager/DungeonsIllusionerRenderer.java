package com.infamous.dungeons_mobs.client.renderer.illager;

import com.google.common.collect.Maps;
import com.infamous.dungeons_mobs.DungeonsMobs;
import com.infamous.dungeons_mobs.client.models.illager.DungeonsIllusionerModel;
import com.infamous.dungeons_mobs.client.models.illager.MageModel;
import com.infamous.dungeons_mobs.entities.illagers.DungeonsIllusionerEntity;
import com.infamous.dungeons_mobs.entities.illagers.MageEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.model.ItemCameraTransforms.TransformType;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.vector.Vector3f;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;
import java.util.Map;
/*
public class DungeonsIllusionerRenderer extends GeoEntityRenderer<DungeonsIllusionerEntity> {

	   private static final Map<String, ResourceLocation> ARMOR_LOCATION_CACHE = Maps.newHashMap();
	   public DungeonsIllusionerEntity thisMage;

	public DungeonsIllusionerRenderer(EntityRendererManager renderManager) {
		super(renderManager, new DungeonsIllusionerModel());
		//this.addLayer(new GeoEyeLayer<>(this, new ResourceLocation(DungeonsMobs.MODID, "textures/entity/enchanter/enchanter_eyes.png")));
		//this.addLayer(new GeoHeldItemLayer<>(this, 0.0, 0.0, 0.5));
	}
	
	protected void applyRotations(DungeonsIllusionerEntity entityLiving, MatrixStack matrixStackIn, float ageInTicks,
			float rotationYaw, float partialTicks) {
        float scaleFactor = 0.9375F;
        matrixStackIn.scale(scaleFactor, scaleFactor, scaleFactor);
		super.applyRotations(entityLiving, matrixStackIn, ageInTicks, rotationYaw, partialTicks);
	}

	@Override
	public RenderType getRenderType(DungeonsIllusionerEntity animatable, float partialTicks, MatrixStack stack,
			IRenderTypeBuffer renderTypeBuffer, IVertexBuilder vertexBuilder, int packedLightIn,
			ResourceLocation textureLocation) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
	
	@Override
	public void renderRecursively(GeoBone bone, MatrixStack stack, IVertexBuilder bufferIn, int packedLightIn, int packedOverlayIn, float red, float green, float blue, float alpha) {
		
	    if (bone.getName().equals("leftHand")) { // rArmRuff is the name of the bone you to set the item to attach too. Please see Note
	        stack.pushPose();
	        //You'll need to play around with these to get item to render in the correct orientation
	        stack.mulPose(Vector3f.XP.rotationDegrees(15)); 
	        stack.mulPose(Vector3f.YP.rotationDegrees(0)); 
	        stack.mulPose(Vector3f.ZP.rotationDegrees(0));
	        //You'll need to play around with this to render the item in the correct spot.
	        stack.translate(-0.4D, 0.6D, -0.7D); 
	        //Sets the scaling of the item.
	        stack.scale(1.0f, 1.0f, 1.0f); 
	        // Change mainHand to predefined Itemstack and TransformType to what transform you would want to use.
	        Minecraft.getInstance().getItemRenderer().renderStatic(offHand, TransformType.THIRD_PERSON_LEFT_HAND, packedLightIn, packedOverlayIn, stack, this.rtb);
	        stack.popPose();

	    }		
		
		if (bone.getName().equals("rightHand")) { // rArmRuff is the name of the bone you to set the item to attach too. Please see Note
	        stack.pushPose();
	        //You'll need to play around with these to get item to render in the correct orientation
	        stack.mulPose(Vector3f.XP.rotationDegrees(-75)); 
	        stack.mulPose(Vector3f.YP.rotationDegrees(0)); 
	        stack.mulPose(Vector3f.ZP.rotationDegrees(0));
	        //You'll need to play around with this to render the item in the correct spot.
	        stack.translate(0.4D, 0.4D, 0.8D); 
	        //Sets the scaling of the item.
	        stack.scale(1.0f, 1.0f, 1.0f); 
	        // Change mainHand to predefined Itemstack and TransformType to what transform you would want to use.
	        Minecraft.getInstance().getItemRenderer().renderStatic(mainHand, TransformType.THIRD_PERSON_RIGHT_HAND, packedLightIn, packedOverlayIn, stack, this.rtb);
	        stack.popPose();

	    }

	    super.renderRecursively(bone, stack, bufferIn, packedLightIn, packedOverlayIn, red, green, blue, alpha);
	}
	   
		public Integer getUniqueID(DungeonsIllusionerEntity animatable) {
			return animatable.getId();
		}
}/*/


