// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelgiantslash extends EntityModel<Entity> {
	private final ModelRenderer slashbarrage;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;

	public Modelgiantslash() {
		textureWidth = 256;
		textureHeight = 256;

		slashbarrage = new ModelRenderer(this);
		slashbarrage.setRotationPoint(-0.3174F, -36.1313F, -0.4454F);
		setRotationAngle(slashbarrage, 0.0F, 1.5708F, 0.0F);
		slashbarrage.setTextureOffset(0, 41).addBox(-5.5F, 56.1313F, 98.2254F, 11.0F, 4.0F, 1.0F, 0.0F, false);
		slashbarrage.setTextureOffset(124, 64).addBox(-5.5F, 28.1313F, 93.2254F, 11.0F, 32.0F, 9.0F, 0.0F, false);
		slashbarrage.setTextureOffset(31, 0).addBox(-5.5F, 56.1313F, -99.2254F, 11.0F, 4.0F, 1.0F, 0.0F, false);
		slashbarrage.setTextureOffset(31, 32).addBox(-5.5F, 28.1313F, -102.2254F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.204F, -50.4116F, 16.0F);
		slashbarrage.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(0, 128).addBox(-5.296F, -32.0F, -5.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-0.204F, -24.4984F, -70.8282F);
		slashbarrage.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.9599F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(62, 64).addBox(-5.296F, -32.0F, -4.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-0.204F, 0.0474F, -89.4294F);
		slashbarrage.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6545F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(0, 64).addBox(-5.296F, -32.0F, -4.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.204F, 29.3341F, -98.4106F);
		slashbarrage.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.3054F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(62, 0).addBox(-5.296F, -32.0F, -4.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.204F, -42.2657F, -45.8744F);
		slashbarrage.addChild(cube_r5);
		setRotationAngle(cube_r5, -1.309F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(0, 0).addBox(-5.296F, -32.0F, -4.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.204F, -42.2657F, 45.8744F);
		slashbarrage.addChild(cube_r6);
		setRotationAngle(cube_r6, 1.309F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(93, 32).addBox(-5.296F, -32.0F, -5.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.204F, -24.4984F, 70.8282F);
		slashbarrage.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.9599F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(31, 96).addBox(-5.296F, -32.0F, -5.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.204F, 0.0474F, 89.4294F);
		slashbarrage.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.6545F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(93, 96).addBox(-5.296F, -32.0F, -5.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.204F, 29.3341F, 98.4106F);
		slashbarrage.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.3054F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(124, 0).addBox(-5.296F, -32.0F, -5.0F, 11.0F, 32.0F, 9.0F, 0.0F, false);
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