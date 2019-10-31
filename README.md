# Offline test 


##1 Coding task 1. Longest substring without repeating characters. 
* Check related code in Task1 and Task1Test

##2 Coding task 2. Find subarray with given sum.
* Check related code in Task2 and Task2Test
* Complexity is O(n) as we in the worst case add and delete each element two times

##3 Java: List all issues you can find in the following class:

```java
import java.util.HashMap;
import java.util.Map;
import org.slf4j.LoggerFactory;
public abstract class Digest {
    private Map<byte[], byte[]> cache = new HashMap<byte[], byte[]>();
    public byte[] digest(byte[] input) {
        byte[] result = cache.get(input);
        if (result == null) {
            synchronized (cache) {
                result = cache.get(input);
                if (result == null) {
} }
}
try {
    result = doDigest(input);
    cache.put(input, result);
} catch (RuntimeException ex) {
    LoggerFactory.getLogger("Digest").error(
        "Unable to make digest"
    );
throw ex; }
        return result;
    }
    protected abstract byte[] doDigest(byte[] input);
}
```

* There are dedicated classes ConcurrentHashMap or SynchronizedHashMap. ConcurrentHashMap allows multiple threads to 
  work independently on different segments (buckets) in the map. This allows higher degree of concurrency in 
  ConcurrentHashMap and improves performance of the application in whole. 

* In general, if you need to use field for synchronization you need to have this field as final. Synchronizing on a 
  non-final field makes it possible for the field's value to change while a thread is in a block synchronized on the 
  old value. That would allow a second thread, synchronized on the new value, to enter the block at the same time.

* Regarding reading and updating cache just follow point #1. You don't need to do like that.

* There is byte[] used as a key for Map, so we are going to have reference equality for the key, this is really not a 
  good idea.
  
* Explicit type argument byte[], byte[] can be replaced with <>.

* I see this logging as a debug leftover as we catch and then throw exception. Doing like that we are going to have 
  multiple logging for the same case.

* Moreover we are catching to big exception. 