package ph.edu.dlsu;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import ph.edu.dlsu.util.ImageViewer;

public class App
{
    static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) throws Exception {
        String filePath = "C:\\Users\\User\\OneDrive\\Documents\\DLSU\\5th Year 2nd Term\\" +
                "ObjectpL\\Assignments\\Lab 9 (OpenCV Samples)\\Chapter2\\SwingImageShow\\cathedral.jpg";
        Mat newImage = Imgcodecs.imread(filePath);

        if(newImage.dataAddr()==0){
            System.out.println("Couldn't open file " + filePath);
        }else{
            ImageViewer imageViewer = new ImageViewer();
            imageViewer.show(newImage, "Loaded image");
        }

    }
}