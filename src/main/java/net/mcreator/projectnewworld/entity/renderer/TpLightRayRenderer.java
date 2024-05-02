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

import net.mcreator.projectnewworld.item.TpLightRayItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TpLightRayRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TpLightRayItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<TpLightRayItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("projectnewworld:textures/entities/lightray.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(TpLightRayItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modellazerarm();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(TpLightRayItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.9.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modellazerarm extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer Lazerarm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer cube_r8;
		private final ModelRenderer cube_r9;
		private final ModelRenderer cube_r10;
		private final ModelRenderer cube_r11;
		private final ModelRenderer cube_r12;
		private final ModelRenderer cube_r13;
		private final ModelRenderer cube_r14;
		private final ModelRenderer cube_r15;
		private final ModelRenderer cube_r16;
		private final ModelRenderer LeftArm;

		public Modellazerarm() {
			textureWidth = 16;
			textureHeight = 16;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 0.0F, 0.0F);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
			Lazerarm = new ModelRenderer(this);
			Lazerarm.setRotationPoint(5.0F, 22.0F, 0.0F);
			RightArm.addChild(Lazerarm);
			Lazerarm.setTextureOffset(8, 8).addBox(-7.0F, -24.7F, -0.9917F, 2.0F, 2.0F, 2.0F, 0.0F, false);
			Lazerarm.setTextureOffset(0, 0).addBox(-7.0F, -28.0125F, -4.5042F, 2.0F, 2.0F, 6.0F, 0.0F, false);
			Lazerarm.setTextureOffset(0, 0).addBox(-7.5F, -27.5125F, -0.5042F, 2.0F, 1.0F, 1.0F, 0.0F, false);
			Lazerarm.setTextureOffset(0, 8).addBox(-8.5F, -27.5125F, -4.5042F, 1.0F, 1.0F, 6.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-8.552F, -23.136F, -0.5068F);
			Lazerarm.addChild(cube_r1);
			setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1134F);
			cube_r1.setTextureOffset(4, 3).addBox(0.0F, 0.5236F, 0.0F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-8.1F, -24.4655F, -0.5068F);
			Lazerarm.addChild(cube_r2);
			setRotationAngle(cube_r2, 0.0F, 0.0F, 1.5184F);
			cube_r2.setTextureOffset(0, 7).addBox(0.0F, -1.14F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-7.948F, -24.493F, -0.5068F);
			Lazerarm.addChild(cube_r3);
			setRotationAngle(cube_r3, 0.0F, 0.0F, 0.5411F);
			cube_r3.setTextureOffset(2, 4).addBox(0.0F, 0.0236F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-8.4748F, -23.6392F, -0.5068F);
			Lazerarm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.0F, 0.0F, 0.0175F);
			cube_r4.setTextureOffset(0, 4).addBox(0.0F, 0.0236F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-7.8998F, -19.6982F, -0.0068F);
			Lazerarm.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3752F);
			cube_r5.setTextureOffset(4, 1).addBox(0.0F, -1.0F, -0.5F, 0.0F, 2.0F, 1.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-5.9932F, -19.6982F, 1.8998F);
			Lazerarm.addChild(cube_r6);
			setRotationAngle(cube_r6, -0.3752F, 0.0F, 0.0F);
			cube_r6.setTextureOffset(4, 8).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-5.4932F, -23.6392F, 2.4748F);
			Lazerarm.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0175F, 0.0F, 0.0F);
			cube_r7.setTextureOffset(2, 10).addBox(-1.0F, 0.0236F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-5.4932F, -24.493F, 1.948F);
			Lazerarm.addChild(cube_r8);
			setRotationAngle(cube_r8, 0.5411F, 0.0F, 0.0F);
			cube_r8.setTextureOffset(10, 1).addBox(-1.0F, 0.0236F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-5.4932F, -24.4655F, 2.1F);
			Lazerarm.addChild(cube_r9);
			setRotationAngle(cube_r9, 1.5184F, 0.0F, 0.0F);
			cube_r9.setTextureOffset(10, 0).addBox(-1.0F, -1.14F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-5.4932F, -23.136F, 2.552F);
			Lazerarm.addChild(cube_r10);
			setRotationAngle(cube_r10, -0.1134F, 0.0F, 0.0F);
			cube_r10.setTextureOffset(2, 8).addBox(-1.0F, 0.5236F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-5.9932F, -19.6982F, -1.8998F);
			Lazerarm.addChild(cube_r11);
			setRotationAngle(cube_r11, 0.3752F, 0.0F, 0.0F);
			cube_r11.setTextureOffset(8, 8).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-5.4932F, -23.136F, -2.552F);
			Lazerarm.addChild(cube_r12);
			setRotationAngle(cube_r12, 0.1134F, 0.0F, 0.0F);
			cube_r12.setTextureOffset(0, 9).addBox(-1.0F, 0.5236F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-5.4932F, -23.6392F, -2.4748F);
			Lazerarm.addChild(cube_r13);
			setRotationAngle(cube_r13, -0.0175F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(10, 2).addBox(-1.0F, 0.0236F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-5.4932F, -24.493F, -1.948F);
			Lazerarm.addChild(cube_r14);
			setRotationAngle(cube_r14, -0.5411F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(10, 3).addBox(-1.0F, 0.0236F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-5.4932F, -24.4655F, -2.1F);
			Lazerarm.addChild(cube_r15);
			setRotationAngle(cube_r15, -1.5184F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(4, 10).addBox(-1.0F, -1.14F, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(-6.0F, -25.7F, 0.0083F);
			Lazerarm.addChild(cube_r16);
			setRotationAngle(cube_r16, 0.3927F, 0.0F, 0.0F);
			cube_r16.setTextureOffset(0, 2).addBox(-0.5F, -0.8255F, -0.9073F, 1.0F, 2.0F, 1.0F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
