public class FileOperations {
    public void readFile(String file, User user) {
        if (user.hasUserPermission() || user.hasUserPlusPermission() || user.hasSuperUserPermission()) {
            System.out.println("Reading file: " + file);
        } else {
            System.out.println("Access denied to read file: " + file);
        }
    }

    public void writeFile(String file, User user) {
        if (user.hasUserPlusPermission() || user.hasSuperUserPermission()) {
            System.out.println("Writing to file: " + file);
        } else {
            System.out.println("Access denied to write file: " + file);
        }
    }

    public void deleteFile(String file, User user) {
        if (user.hasSuperUserPermission()) {
            System.out.println("Deleting file: " + file);
        } else {
            System.out.println("Access denied to delete file: " + file);
        }
    }
}
