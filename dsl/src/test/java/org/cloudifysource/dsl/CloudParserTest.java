package org.cloudifysource.dsl;

import static org.junit.Assert.*;

import java.io.File;

import org.cloudifysource.dsl.internal.ServiceReader;
import org.junit.Ignore;
import org.junit.Test;


public class CloudParserTest {

	private final static String SIMPLE_CLOUD_PATH = "testResources/simple/my-cloud.groovy";
	
	@Ignore
	@Test
	public void testCloudParser() throws Exception {
		org.cloudifysource.dsl.cloud.Cloud cloud = ServiceReader.readCloud(new File(SIMPLE_CLOUD_PATH));
		assertNotNull(cloud);
		assertNotNull(cloud.getProvider());
		assertNotNull(cloud.getTemplates());
		assertNotNull(cloud.getUser());
		assertNotNull(cloud.getTemplates().size() > 0);
		assertNotNull(cloud.getTemplates().get("SMALL_LINUX_32"));
	}


}
