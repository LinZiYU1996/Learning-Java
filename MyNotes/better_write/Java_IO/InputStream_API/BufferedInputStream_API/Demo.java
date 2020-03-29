package better_write.Java_IO.InputStream_API.BufferedInputStream_API;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/3/28
 * \* Time: 20:13
 * \* Description:
 * \
 */
public class Demo {


    public static void main(String[] args) throws FileNotFoundException {


        //As you can see, using a BufferedInputStream to add buffering to a non-buffered InputStream is pretty easy. The BufferedInputStream creates a byte array internally, and attempts to fill the array by calling the InputStream.read(byte[]) methods on the underlying InputStream.


        int bufferSize = 8 * 1024;

        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("E:\\learn-java\\Learning-Java\\MyNotes\\better_write\\Java_IO\\a.txt"),
                bufferSize

        );

        /*
        This example sets the internal buffer used by the BufferedInputStream to 8 KB. It is best to use buffer sizes that are multiples of 1024 bytes. That works best with most built-in buffering in hard disks etc.

        Except for adding buffering to your input streams, BufferedInputStream behaves exactly like an InputStream.
         */

        /*
        Optimal Buffer Size for a BufferedInputStream
You should make some experiments with different buffer sizes to find out which buffer size seems to give you the best performance on your concrete hardware. The optimal buffer size may depend on whether you are using the Java BufferedInputStream with a disk or network InputStream.

With both disk and network streams, the optimal buffer size may also depend on the concrete hardware in the computer. If the hard disk is anyways reading a minimum of 4KB at a time, it's stupid to use less than a 4KB buffer. It is also better to then use a buffer size that is a multiple of 4KB. For instance, using 6KB would be stupid too.

Even if your disk reads blocks of e.g. 4KB at a time, it can still be a good idea to use a buffer that is larger than this. A disk is good at reading data sequentially - meaning it is good at reading multiple blocks that are located after each other. Thus, using a 16KB buffer, or a 64KB buffer (or even larger) with a BufferedInputStream may still give you a better performance than using just a 4KB buffer.

Also keep in mind that some hard disks have a read cache of some mega bytes. If your hard disk anyways reads, say 64KB, of your file into its internal cache, you might as well get all of that data into your BufferedInputStream using one read operation, instead of using multiple read operations. Multiple read operations will be slower, and you risk that the hard disk's read cache gets erased between read operations, causing the hard disk to re-read that block into the cache.

To find the optimal BufferedInputStream buffer size, find out the block size your hard disk reads in, and possibly also its cache size, and make the buffer a multiple of that size. You will definitely have to experiment to find the optimal buffer size. Do so by measuring read speeds with different buffer sizes.
         */







    }
}
