
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMapDemo { 
    public static void main(String[] args) {
        // java 7: segment based locking(16 smaller hashMaps) 
        // read: doesn't require locking, for write operation: segment gets locked 
        
        //java 8: no segmentationll
        //uses compare and swap approach-> no clocking EXCEPT resizing or collision
        // When CAS fails- Thread will retry in short Time period
        ConcurrentHashMap <Integer,String> cMap= new ConcurrentHashMap<>();
    }   // incremental resizing not 2x as in LinkedList
}