package ca.pkay.rcloneexplorer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ca.pkay.rcloneexplorer.Items.FileItem;
import ca.pkay.rcloneexplorer.Items.RemoteItem;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = 29)
public class FileComparatorsTest {

    @Test
    public void testSortAlphaAscending() {
        RemoteItem remote = new RemoteItem("test_remote", "drive");
        FileItem f1 = new FileItem(remote, "path/b", "b", 100, "2023-01-01T00:00:00Z", "", false);
        FileItem f2 = new FileItem(remote, "path/a", "a", 100, "2023-01-01T00:00:00Z", "", false);
        FileItem dir = new FileItem(remote, "path/c", "c", 0, "2023-01-01T00:00:00Z", "", true);

        List<FileItem> list = new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(dir);

        Collections.sort(list, new FileComparators.SortAlphaAscending());

        // Directory comes first, then alphabetized files (a, b)
        assertEquals("c", list.get(0).getName());
        assertEquals("a", list.get(1).getName());
        assertEquals("b", list.get(2).getName());
    }

    @Test
    public void testSortSizeDescending() {
        RemoteItem remote = new RemoteItem("test_remote", "drive");
        FileItem fSmall = new FileItem(remote, "path/small", "small", 10, "2023-01-01T00:00:00Z", "", false);
        FileItem fBig = new FileItem(remote, "path/big", "big", 1000, "2023-01-01T00:00:00Z", "", false);

        List<FileItem> list = new ArrayList<>();
        list.add(fSmall);
        list.add(fBig);

        Collections.sort(list, new FileComparators.SortSizeDescending());

        assertEquals("big", list.get(0).getName());
        assertEquals("small", list.get(1).getName());
    }
}
