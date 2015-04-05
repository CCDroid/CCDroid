package org.developfreedom.ccdroid.app;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;

@Config(emulateSdk = 18)
@RunWith(RobolectricTestRunner.class)
public class ProjectTest {
    @Test
    public void testNoArgsConstructorSetsAllToNull() throws Exception {
        Project project = new Project();

        assertEquals(null, project.getName());
        assertEquals(null, project.getActivity());
        assertEquals(null, project.getLastBuildStatus());
        assertEquals(null, project.getLastBuildLabel());
        assertEquals(null, project.getLastBuildTime());
        assertEquals(null, project.getWebUrl());
    }

    @Test
    public void testAllArgsConstructorWorksCorrectly() {
        Project project = new Project(
                "shubhamchaudhary/wordpowermadeeasy",
                "Sleeping",
                "31",
                "Success",
                "2015-03-22T11:32:14.000+0000",
                "https://travis-ci.org/shubhamchaudhary/wordpowermadeeasy"
        );

        assertEquals("shubhamchaudhary/wordpowermadeeasy", project.getName());
        assertEquals("Sleeping", project.getActivity());
        assertEquals("Success", project.getLastBuildStatus());
        assertEquals("31", project.getLastBuildLabel());
        assertEquals("2015-03-22T11:32:14.000+0000", project.getLastBuildTime());
        assertEquals("https://travis-ci.org/shubhamchaudhary/wordpowermadeeasy", project.getWebUrl());

    }
    @Test
    public void testSettersWorkCorrectly() {
        Project project = new Project();

        project.setName("shubhamchaudhary/wordpowermadeeasy");
        project.setActivity("Sleeping");
        project.setLastBuildStatus("Success");
        project.setLastBuildLabel("31");
        project.setLastBuildTime("2015-03-22T11:32:14.000+0000");
        project.setWebUrl("https://travis-ci.org/shubhamchaudhary/wordpowermadeeasy");

        assertEquals("shubhamchaudhary/wordpowermadeeasy", project.getName());
        assertEquals("Sleeping", project.getActivity());
        assertEquals("Success", project.getLastBuildStatus());
        assertEquals("31", project.getLastBuildLabel());
        assertEquals("2015-03-22T11:32:14.000+0000", project.getLastBuildTime());
        assertEquals("https://travis-ci.org/shubhamchaudhary/wordpowermadeeasy", project.getWebUrl());
    }
}
