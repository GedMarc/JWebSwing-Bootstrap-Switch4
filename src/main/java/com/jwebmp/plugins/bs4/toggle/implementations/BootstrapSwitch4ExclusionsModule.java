package com.jwebmp.plugins.bs4.toggle.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class BootstrapSwitch4ExclusionsModule
		implements IGuiceScanModuleExclusions<BootstrapSwitch4ExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.bootstrap.switch4");
		return strings;
	}
}
