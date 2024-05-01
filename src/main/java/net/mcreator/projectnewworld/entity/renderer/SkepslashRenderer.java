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

import net.mcreator.projectnewworld.item.SkepslashItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SkepslashRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SkepslashItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<SkepslashItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("projectnewworld:textures/entities/slashskep.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(SkepslashItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modelslashattackgryphon();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(SkepslashItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.9.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelslashattackgryphon extends EntityModel<Entity> {
		private final ModelRenderer Slash;
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
		private final ModelRenderer cube_r17;
		private final ModelRenderer cube_r18;
		private final ModelRenderer cube_r19;
		private final ModelRenderer cube_r20;
		private final ModelRenderer cube_r21;

		public Modelslashattackgryphon() {
			textureWidth = 64;
			textureHeight = 64;
			Slash = new ModelRenderer(this);
			Slash.setRotationPoint(0.0282F, 9.7803F, -2.8583F);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.5708F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(18, 20).addBox(12.0F, -1.0F, -1.3468F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(0, 6).addBox(-13.8194F, -1.0F, -1.3468F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(27, 9).addBox(-0.4097F, -13.9097F, -1.3468F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r1.setTextureOffset(7, 33).addBox(-0.4097F, 11.9097F, -1.3468F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r2);
			setRotationAngle(cube_r2, -1.5708F, 0.0F, -0.2182F);
			cube_r2.setTextureOffset(9, 19).addBox(11.9597F, -1.0F, -3.2847F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r3);
			setRotationAngle(cube_r3, -1.5708F, 0.0F, -0.5672F);
			cube_r3.setTextureOffset(18, 14).addBox(12.2412F, -1.0F, -3.3122F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r4);
			setRotationAngle(cube_r4, -1.5708F, 0.0F, -1.0036F);
			cube_r4.setTextureOffset(18, 8).addBox(12.3067F, -1.0F, -1.9832F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r5);
			setRotationAngle(cube_r5, -1.5708F, 0.0F, -1.3963F);
			cube_r5.setTextureOffset(18, 1).addBox(11.9766F, -1.0F, -1.3573F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.0F, 1.5708F, 0.0F);
			cube_r6.setTextureOffset(29, 36).addBox(-0.5903F, 7.5F, 12.5F, 0.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(27, 36).addBox(-0.5903F, -2.0F, -7.0F, 0.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(25, 36).addBox(-0.5903F, 2.0F, 2.5F, 0.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(23, 32).addBox(-0.5903F, -12.5F, -2.5F, 0.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(21, 32).addBox(-0.5903F, -7.0F, 6.5F, 0.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r6.setTextureOffset(19, 32).addBox(-0.5903F, 5.0F, -13.5F, 0.0F, 11.0F, 1.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r7);
			setRotationAngle(cube_r7, 0.0F, 0.0F, 1.5708F);
			cube_r7.setTextureOffset(0, 0).addBox(5.0F, -0.0903F, -13.5F, 11.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 2).addBox(-2.0F, -0.0903F, -7.0F, 11.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 1).addBox(7.5F, -0.0903F, 12.5F, 11.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 3).addBox(-7.0F, -0.0903F, 6.5F, 11.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 4).addBox(2.0F, -0.0903F, 2.5F, 11.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r7.setTextureOffset(0, 5).addBox(-12.5F, -0.0903F, -2.5F, 11.0F, 0.0F, 1.0F, 0.0F, false);
			cube_r8 = new ModelRenderer(this);
			cube_r8.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r8);
			setRotationAngle(cube_r8, -1.5708F, 0.0F, 1.5708F);
			cube_r8.setTextureOffset(14, 26).addBox(-14.0F, -1.0F, -1.0903F, 2.0F, 1.0F, 2.0F, 0.0F, false);
			cube_r9 = new ModelRenderer(this);
			cube_r9.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r9);
			setRotationAngle(cube_r9, -1.5708F, 0.0F, 1.3963F);
			cube_r9.setTextureOffset(0, 18).addBox(-13.9453F, -1.0F, -1.5352F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r10 = new ModelRenderer(this);
			cube_r10.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r10);
			setRotationAngle(cube_r10, -1.5708F, 0.0F, 1.0036F);
			cube_r10.setTextureOffset(9, 13).addBox(-14.2097F, -1.0F, -2.1356F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r11 = new ModelRenderer(this);
			cube_r11.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r11);
			setRotationAngle(cube_r11, -1.5708F, 0.0F, 0.5672F);
			cube_r11.setTextureOffset(0, 12).addBox(-14.0889F, -1.0F, -3.4092F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r12 = new ModelRenderer(this);
			cube_r12.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r12);
			setRotationAngle(cube_r12, -1.5708F, 0.0F, 0.2182F);
			cube_r12.setTextureOffset(9, 7).addBox(-13.7833F, -1.0F, -3.3238F, 2.0F, 1.0F, 5.0F, 0.0F, false);
			cube_r13 = new ModelRenderer(this);
			cube_r13.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r13);
			setRotationAngle(cube_r13, -1.3526F, 0.0F, 0.0F);
			cube_r13.setTextureOffset(27, 2).addBox(-0.4097F, -13.8715F, -3.3043F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r14 = new ModelRenderer(this);
			cube_r14.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r14);
			setRotationAngle(cube_r14, -1.0036F, 0.0F, 0.0F);
			cube_r14.setTextureOffset(19, 26).addBox(-0.4097F, -14.1651F, -3.3607F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r15 = new ModelRenderer(this);
			cube_r15.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r15);
			setRotationAngle(cube_r15, -0.5672F, 0.0F, 0.0F);
			cube_r15.setTextureOffset(7, 26).addBox(-0.4097F, -14.2582F, -2.0594F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r16 = new ModelRenderer(this);
			cube_r16.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r16);
			setRotationAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
			cube_r16.setTextureOffset(0, 24).addBox(-0.4097F, -13.961F, -1.4463F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r17 = new ModelRenderer(this);
			cube_r17.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r17);
			setRotationAngle(cube_r17, 3.1416F, 0.0F, 0.0F);
			cube_r17.setTextureOffset(33, 30).addBox(-0.4097F, 12.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
			cube_r18 = new ModelRenderer(this);
			cube_r18.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r18);
			setRotationAngle(cube_r18, -2.9671F, 0.0F, 0.0F);
			cube_r18.setTextureOffset(27, 16).addBox(-0.4097F, 11.961F, -1.4463F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r19 = new ModelRenderer(this);
			cube_r19.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r19);
			setRotationAngle(cube_r19, -2.5744F, 0.0F, 0.0F);
			cube_r19.setTextureOffset(27, 23).addBox(-0.4097F, 12.2582F, -2.0594F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r20 = new ModelRenderer(this);
			cube_r20.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r20);
			setRotationAngle(cube_r20, -2.138F, 0.0F, 0.0F);
			cube_r20.setTextureOffset(26, 30).addBox(-0.4097F, 12.1651F, -3.3607F, 1.0F, 2.0F, 5.0F, 0.0F, false);
			cube_r21 = new ModelRenderer(this);
			cube_r21.setRotationPoint(-0.1185F, 0.3101F, 3.2051F);
			Slash.addChild(cube_r21);
			setRotationAngle(cube_r21, -1.789F, 0.0F, 0.0F);
			cube_r21.setTextureOffset(0, 31).addBox(-0.4097F, 11.8715F, -3.3043F, 1.0F, 2.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Slash.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
