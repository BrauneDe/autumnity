package com.minecraftabnormals.autumnity.common.world.biome;

import com.minecraftabnormals.autumnity.core.registry.AutumnityEntities;
import com.teamabnormals.abnormals_core.common.world.biome.AbnormalsBiome;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MoodSoundAmbience;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public final class MapleForestHillsBiome extends AbnormalsBiome
{
	public MapleForestHillsBiome()
	{
		super((new Biome.Builder()).surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(0.45F).scale(0.3F).temperature(0.7F).downfall(0.8F).func_235097_a_((new BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setWaterFogColor(12638463).setFogColor(12638463).setMoodSound(MoodSoundAmbience.field_235027_b_).build()).parent((String)null));
	}

	@Override
	public void addFeatures()
	{
		DefaultBiomeFeatures.func_235196_b_(this);
		this.func_235063_a_(DefaultBiomeFeatures.RUINED_PORTAL_STANDARD);
		DefaultBiomeFeatures.addCarvers(this);
		DefaultBiomeFeatures.addLakes(this);
		DefaultBiomeFeatures.addMonsterRooms(this);
		DefaultBiomeFeatures.addStoneVariants(this);
		DefaultBiomeFeatures.addOres(this);
		DefaultBiomeFeatures.addSedimentDisks(this);
		AutumnityBiomeFeatures.addMapleFeatures(this);
		DefaultBiomeFeatures.addDefaultFlowers(this);
		DefaultBiomeFeatures.addMushrooms(this);
		DefaultBiomeFeatures.addReedsAndPumpkins(this);
		DefaultBiomeFeatures.addSprings(this);
		DefaultBiomeFeatures.addFreezeTopLayer(this);
	}

	@Override
	public void addSpawns() 
	{
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.PIG, 10, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(AutumnityEntities.TURKEY.get(), 10, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.COW, 8, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.WOLF, 5, 4, 4));
		this.addSpawn(EntityClassification.AMBIENT, new Biome.SpawnListEntry(EntityType.BAT, 10, 8, 8));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SLIME, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.WITCH, 5, 1, 1));
	}

	@OnlyIn(Dist.CLIENT)
	public int getGrassColor(double posX, double posZ)
	{
		return 0x9AB839;
	}

	@OnlyIn(Dist.CLIENT)
	public int getFoliageColor()
	{
		return 0x9FC944;
	}
}