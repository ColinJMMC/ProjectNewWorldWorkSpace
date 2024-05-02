// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelslashbarrage1 extends EntityModel<Entity> {
	private final ModelRenderer slashbarrage;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;

	public Modelslashbarrage1() {
		textureWidth = 32;
		textureHeight = 32;

		slashbarrage = new ModelRenderer(this);
		slashbarrage.setRotationPoint(2.5F, 20.2236F, -1.7414F);
		setRotationAngle(slashbarrage, 0.0F, 2.1817F, 0.0F);
		slashbarrage.setTextureOffset(0, 11).addBox(-1.0F, -0.2236F, 3.9081F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		slashbarrage.setTextureOffset(6, 0).addBox(-1.0F, -0.2236F, -10.3161F, 2.0F, 4.0F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, -6.6149F, -1.204F);
		slashbarrage.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 5.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -0.0173F, -10.1825F);
		slashbarrage.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.5672F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(5, 6).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 2.9383F, -10.2645F);
		slashbarrage.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.3054F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(6, 3).addBox(-1.0F, -6.0F, -1.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, -5.6819F, -6.6861F);
		slashbarrage.addChild(cube_r4);
		setRotationAngle(cube_r4, -1.0472F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(0, 4).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, -5.6819F, 1.278F);
		slashbarrage.addChild(cube_r5);
		setRotationAngle(cube_r5, 1.0472F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 8).addBox(-1.0F, -2.0F, -0.5F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -0.0173F, 4.7745F);
		slashbarrage.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.5672F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(6, 9).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 2.9383F, 4.8565F);
		slashbarrage.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.3054F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(11, 5).addBox(-1.0F, -6.0F, 0.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		slashbarrage.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}