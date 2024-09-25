import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PermissionManagerTest {
    @Test
    void testGetRoleName() {
        PermissionManager pm = new PermissionManager();
        assertEquals("Admin", pm.getRoleName(PermissionLevel.ADMIN));
        assertEquals("Developer", pm.getRoleName(PermissionLevel.DEVELOPER));
        assertEquals("User", pm.getRoleName(PermissionLevel.USER));
    }

    @Test
    void testSetCurrentLevel() {
        PermissionManager pm = new PermissionManager();
        pm.setCurrentLevel(PermissionLevel.ADMIN);
        assertEquals(PermissionLevel.ADMIN, pm.getCurrentLevel());
        pm.setCurrentLevel(PermissionLevel.DEVELOPER);
        assertEquals(PermissionLevel.DEVELOPER, pm.getCurrentLevel());
        pm.setCurrentLevel(PermissionLevel.USER);
        assertEquals(PermissionLevel.USER, pm.getCurrentLevel());
    }
}