package ca.pkay.rcloneexplorer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import ca.pkay.rcloneexplorer.Settings.SettingsActivity;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 29)
public class ActivitiesTest {

    @Test
    public void testAboutActivityLaunch() {
        AboutActivity activity = Robolectric.buildActivity(AboutActivity.class).create().start().resume().get();
        assertNotNull(activity);
    }

    @Test
    public void testAboutLibsActivityLaunch() {
        AboutLibsActivity activity = Robolectric.buildActivity(AboutLibsActivity.class).create().start().resume().get();
        assertNotNull(activity);
    }

    @Test
    public void testChangelogActivityLaunch() {
        ChangelogActivity activity = Robolectric.buildActivity(ChangelogActivity.class).create().start().resume().get();
        assertNotNull(activity);
    }

    @Test
    public void testContributorActivityLaunch() {
        ContributorActivity activity = Robolectric.buildActivity(ContributorActivity.class).create().start().resume().get();
        assertNotNull(activity);
    }

    @Test
    public void testOnboardingActivityLaunch() {
        OnboardingActivity activity = Robolectric.buildActivity(OnboardingActivity.class).create().start().resume().get();
        assertNotNull(activity);
    }

    @Test
    public void testSettingsActivityLaunch() {
        SettingsActivity activity = Robolectric.buildActivity(SettingsActivity.class).create().start().resume().get();
        assertNotNull(activity);
    }
}
