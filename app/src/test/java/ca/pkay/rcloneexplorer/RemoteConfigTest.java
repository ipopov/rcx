package ca.pkay.rcloneexplorer;

import org.junit.Test;

import ca.pkay.rcloneexplorer.Items.RemoteItem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoteConfigTest {

    @Test
    public void testRemoteItemProperties() {
        RemoteItem driveRemote = new RemoteItem("my_drive", "drive");
        assertEquals("my_drive", driveRemote.getName());
        assertEquals(RemoteItem.GOOGLE_DRIVE, driveRemote.getType());
        assertTrue(driveRemote.hasTrashCan());
        assertTrue(driveRemote.isOAuth());

        RemoteItem b2Remote = new RemoteItem("my_b2", "b2");
        assertEquals("my_b2", b2Remote.getName());
        assertEquals(RemoteItem.B2, b2Remote.getType());
        assertFalse(b2Remote.hasTrashCan());
        assertFalse(b2Remote.isOAuth());
    }
}
