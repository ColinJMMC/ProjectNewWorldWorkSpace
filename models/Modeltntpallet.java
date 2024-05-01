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
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		tntpallet.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}