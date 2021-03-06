package io.katharsis.meta;

import org.junit.Before;

import io.katharsis.core.internal.boot.KatharsisBoot;
import io.katharsis.core.internal.boot.ReflectionsServiceDiscovery;
import io.katharsis.legacy.locator.SampleJsonServiceLocator;
import io.katharsis.resource.registry.ConstantServiceUrlProvider;

public class AbstractMetaTest {

	protected KatharsisBoot boot;

	@Before
	public void setup() {
		boot = new KatharsisBoot();
		boot.setServiceUrlProvider(new ConstantServiceUrlProvider("http://localhost"));
		boot.setServiceDiscovery(new ReflectionsServiceDiscovery("io.katharsis.meta.mock.model", new SampleJsonServiceLocator()));
		configure();
		boot.boot();
	}

	protected void configure() {

	}
}
