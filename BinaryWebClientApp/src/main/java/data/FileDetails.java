package data;

import com.services.Exception_Exception;
import com.services.FileHandlerService;
import com.services.FileHandlerServiceService;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author shelc
 */
public class FileDetails {

    public static void main(String[] args) throws IOException, Exception_Exception {
        
        File file = new File("C:\\Image\\color.png");
        byte[] data = Files.readAllBytes(file.toPath());

        System.out.println("Size of the file: " + getServicePort().getFileSize(file.getName(), data));
    }

    public static FileHandlerService getServicePort() {
        FileHandlerServiceService service = new FileHandlerServiceService();
        FileHandlerService port = service.getFileHandlerServicePort();
        return port;
    }

}
