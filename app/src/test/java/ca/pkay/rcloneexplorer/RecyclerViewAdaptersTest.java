package ca.pkay.rcloneexplorer;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.ArrayList;
import java.util.List;

import ca.pkay.rcloneexplorer.Items.FileItem;
import ca.pkay.rcloneexplorer.Items.RemoteItem;
import ca.pkay.rcloneexplorer.RecyclerViewAdapters.RemotesRecyclerViewAdapter;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 29)
public class RecyclerViewAdaptersTest {

    private Context context;

    @Before
    public void setUp() {
        context = ApplicationProvider.getApplicationContext();
    }

    @Test
    public void testRemotesRecyclerViewAdapter() {
        List<RemoteItem> remotes = new ArrayList<>();
        remotes.add(new RemoteItem("drive_remote", "drive"));
        remotes.add(new RemoteItem("sftp_remote", "sftp"));

        RemotesRecyclerViewAdapter adapter = new RemotesRecyclerViewAdapter(remotes, null, null);
        assertEquals(2, adapter.getItemCount());
    }
}
