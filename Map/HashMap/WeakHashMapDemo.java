
import java.util.WeakHashMap;

class Image {

    private String image;

    public Image(String image) {
        this.image = image;
    }

}

public class WeakHashMapDemo { // for this to work keys must be weak, string is strong referenced since its stored in the string pool

    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        //imageCache.put("1", new Image("image 1")); // key: string literal (strong reference)
        imageCache.put(new String("1"), new Image("image 1")); // key: string literal (strong reference)
        // imageCache.put("2", new Image("image 2"));
        imageCache.put(new String("2"), new Image("image 2"));
        System.out.println(imageCache);
        editVideo();
        System.gc();
        System.out.println("Some entries may be cleared inside the imageCache" + imageCache);
        // now before this suggest JVM to collect cache 

    }

    public static void editVideo() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            System.getLogger(WeakHashMapDemo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
