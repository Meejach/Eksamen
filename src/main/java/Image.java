public class Image {

    private String fileName;
    private double width;
    private double hight;

    public static void main(String[] args) {
        Image image = new Image("kl.gif", 12, 3);
        System.out.println(image.isPortrait());
        System.out.println(image.isKnownFileType());
    }

    public Image (String fileName, double width, double hight) {
        this.fileName = fileName;
        this.width = width;
        this.hight = hight;
    }

    public boolean isKnownFileType () {
        if (fileName.endsWith(".gif") || fileName.endsWith(".jpg") || fileName.endsWith("jpeg") || fileName.endsWith(".png") || fileName.endsWith(".webp") || fileName.endsWith(".bmp")) {
            return true;
        }
        return false;
    }

    public boolean isPortrait() {
        if(hight>width) {
            return true;
        }
        return false;
    }

    public boolean isLandscape() {
        if(width>hight) {
            return true;
        }
        return false;
    }
}
