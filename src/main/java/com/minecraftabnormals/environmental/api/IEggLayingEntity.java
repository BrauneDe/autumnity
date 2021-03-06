package com.minecraftabnormals.environmental.api;

import java.util.Random;

import net.minecraft.item.Item;

public interface IEggLayingEntity
{
	int getEggTimer();
	void setEggTimer(int time);
	boolean isBirdJockey();
	Item getEggItem();
	int getNextEggTime(Random rand);
}