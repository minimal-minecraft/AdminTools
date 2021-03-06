package club.therepo.admintools.errors;

import club.therepo.admintools.AdminTools;

import java.util.logging.Level;

public class Error {
    public static void execute(AdminTools plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute MySQL statement: ", ex);
    }
    public static void close(AdminTools plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close MySQL connection: ", ex);
    }
}