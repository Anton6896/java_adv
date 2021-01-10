package basic;

// create my Exception

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class Exceptions_my {
    public static void main(String[] args) throws ScannerException, IOException {
        numbers_true();

//        try {
//            open_file_my();
//        } catch (IOException | FileNotFoundException exception) {
//            exception.printStackTrace();
//        }

    }

    // -------------------------------------------------------------------
    static void open_file_my() throws IOException, FileNotFoundException {
        String _path_ = new File(".").getCanonicalPath();
        String sep = File.separator;
        String path_to_file = _path_ + sep + "src" + sep + "basic" + sep + "file.txt";

    }

    static void numbers_true() throws ScannerException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("number (0>exit, error>50) : ");
            int x = Integer.parseInt(scan.nextLine());
            if (x < 0) {
                break;
            } else if (x > 50) {
                throw new ScannerException("number > 50 was in place .");
            }

        }
    }
}

// crate my Exception      // ---------------------------------------------
class ScannerException extends Exception {
    public ScannerException(String description) {
        System.out.println("description : " + description);
    }
}


