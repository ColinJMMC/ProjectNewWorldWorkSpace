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

import net.mcreator.projectnewworld.item.TntPalletItem;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TntPalletRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TntPalletItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<TntPalletItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("projectnewworld:textures/entities/tntpallet.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(TntPalletItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modeltntpallet();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(TntPalletItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	// Made with Blockbench 4.9.4
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeltntpallet extends EntityModel<Entity> {
		private final ModelRenderer tntpallet;

		public Modeltntpallet() {
			textureWidth = 32;
			textureHeight = 32;
			tntpallet = new ModelRenderer(this);
			tntpallet.setRotationPoint(0.1F, 19.9444F, -0.0167F);
			setRotationAngle(tntpallet, -1.5708F, 0.0F, 0.0F);
			tntpallet.setTextureOffset(0, 0).addBox(-2.6F, 1.0556F, -3.9833F, 5.0F, 1.0F, 8.0F, 0.0F, false);
			tntpallet.setTextureOffset(10, 11).addBox(1.4F, -0.9444F, -3.9833F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			tntpallet.setTextureOffset(0, 9).addBox(0.2F, -1.9444F, -2.8083F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			tntpallet.setTextureOffset(0, 0).addBox(0.2F, -1.9444F, -0.2333F, 1.0F, 3.0F, 3.0F, 0.0F, false);
			tntpallet.setTextureOffset(0, 19).addBox(-1.45F, -1.9444F, -2.8083F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			tntpallet.setTextureOffset(18, 0).addBox(-1.45F, -1.9444F, -0.2333F, 2.0F, 3.0F, 3.0F, 0.0F, false);
			tntpallet.setTextureOffset(0, 9).addBox(-2.6F, -0.9444F, -3.9833F, 1.0F, 2.0F, 8.0F, 0.0F, false);
			tntpallet.setTextureOffset(10, 12).addBox(-1.6F, -0.9444F, 3.0167F, 3.0F, 2.0F, 1.0F, 0.0F, false);
			tntpallet.setTextureOffset(10, 9).addBox(-1.6F, -0.9444F, -3.9833F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		}

		@Override
		public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			// previously the render function, render code was moved to a method below
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			tntpallet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}
	}

}
