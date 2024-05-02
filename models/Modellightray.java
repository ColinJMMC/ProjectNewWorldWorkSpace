// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modellightray extends EntityModel<Entity> {
	private final ModelRenderer lightray;
	private final ModelRenderer cube_r1;

	public Modellightray() {
		textureWidth = 128;
		textureHeight = 128;

		lightray = new ModelRenderer(this);
		lightray.setRotationPoint(0.0F, 24.0F, 0.0F);
		lightray.setTextureOffset(0, 0).addBox(-2.0F, -98.0F, -2.0F, 4.0F, 98.0F, 4.0F, 0.0F, false);
		lightray.setTextureOffset(34, 0).addBox(-2.5F, -98.0F, -1.0F, 1.0F, 98.0F, 2.0F, 0.0F, false);
		lightray.setTextureOffset(22, 0).addBox(1.5F, -98.0F, -1.0F, 1.0F, 98.0F, 2.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		lightray.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.5708F, 0.0F);
		cube_r1.setTextureOffset(16, 0).addBox(-2.5F, -98.0F, -1.0F, 1.0F, 98.0F, 2.0F, 0.0F, false);
		cube_r1.setTextureOffset(28, 0).addBox(1.5F, -98.0F, -1.0F, 1.0F, 98.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		lightray.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}