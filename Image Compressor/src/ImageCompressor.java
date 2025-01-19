import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

public class ImageCompressor {

    public static void compressImage(String inputImagePath, String outputImagePath, float quality) {
        try {
            File inputFile = new File(inputImagePath);
            if (!inputFile.exists()) {
                System.err.println("Input file does not exist: " + inputImagePath);
                return;
            }

            BufferedImage image = ImageIO.read(inputFile);
            if (image == null) {
                System.err.println("Error: Image file could not be read. The file may be corrupted or unsupported.");
            } else {
                System.out.println("Image loaded successfully!");
            }

            ImageWriter writer = ImageIO.getImageWritersByFormatName("jpeg").next();

            File outputFile = new File(outputImagePath);
            outputFile.getParentFile().mkdirs();
            ImageOutputStream outputStream = ImageIO.createImageOutputStream(outputFile);
            writer.setOutput(outputStream);

            ImageWriteParam param = writer.getDefaultWriteParam();
            if (param.canWriteCompressed()) {
                param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                param.setCompressionQuality(quality);
            }

            writer.write(null, new javax.imageio.IIOImage(image, null, null), param);

            outputStream.close();
            writer.dispose();

            System.out.println("Image compressed successfully. Saved to " + outputImagePath);
        } catch (IOException e) {
            System.err.println("Error compressing image: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String inputImagePath = "D:/niggggaaa/java/Image Compressor/src/sample.jpg";
        String outputImagePath = "D:/niggggaaa/java/Image Compressor/src/compressed_sample.jpg";
        float quality = 0f;

        compressImage(inputImagePath, outputImagePath, quality);
    }
}
