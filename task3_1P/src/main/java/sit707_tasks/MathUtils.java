//package sit707_week2;
//
//import java.io.File;
//
//public class FileUtils {
//
//	public static void copyFile(File screenshotFile, File file) {
//		// TODO Auto-generated method stub
//		public static void copyFile(File sourceFile, File destinationFile) throws IOException {
//	        Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
//	    }
//		
//	}
//
//}
package sit707_week2;


public class MathUtils {

	 // Adds two integers and performs basic checks
    public static Integer add(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        return a + b;
    }

    // Subtracts the second integer from the first and performs basic checks
    public static Integer sub(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Inputs cannot be null");
        }
        return a - b;
    }
}