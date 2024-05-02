package net.mcreator.projectnewworld.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import net.mcreator.projectnewworld.item.GryphonbarrageItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GryphonbarrageRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GryphonbarrageItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<GryphonbarrageItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("projectnewworld:textures/entities/slashbarragegryphon.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(GryphonbarrageItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelslashbarrage();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(GryphonbarrageItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.9.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelslashbarrage extends EntityModel<Entity> {
		private final ModelRenderer slashbarrage;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;

		public Modelslashbarrage() {
			textureWidth = 16;
			textureHeight = 16;
			slashbarrage = new ModelRenderer(this);
			slashbarrage.setRotationPoint(0.0F, 20.2236F, 0.0919F);
			setRotationAngle(slashbarrage, 0.0F, 0.8727F, 0.0F);
			slashbarrage.setTextureOffset(1, 1).addBox(-1.0F, 1.7764F, 3.9081F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			slashbarrage.setTextureOffset(1, 1).addBox(-1.0F, 1.7764F, -4.9081F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(0.0F, -2.3178F, 0.5F);
			slashbarrage.addChild(cube_r1);
			setRotationAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(1, 1).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.0F, 2.9365F, -5.0752F);
			slashbarrage.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(1, 1).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.0F, 4.9383F, -4.8565F);
			slashbarrage.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
			cube_r3.setTextureOffset(1, 1).addBox(-1.0F, -5.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(0.0F, -1.8848F, -2.116F);
			slashbarrage.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.0472F, 0.0F, 0.0F);
			cube_r4.setTextureOffset(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.0F, -1.8848F, 2.116F);
			slashbarrage.addChild(cube_r5);
			setRotationAngle(cube_r5, 1.0472F, 0.0F, 0.0F);
			cube_r5.setTextureOffset(1, 1).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.0F, 2.9365F, 5.0752F);
			slashbarrage.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(1, 1).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.0F, 4.9383F, 4.8565F);
			slashbarrage.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(1, 1).addBox(-1.0F, -5.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			slashbarrage.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
