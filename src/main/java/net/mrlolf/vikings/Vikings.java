package net.mrlolf.vikings;

import net.fabricmc.api.ModInitializer;
import net.mrlolf.vikings.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Vikings implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "vikings";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		LOGGER.info("Hello Fabric world!");
	}
}
