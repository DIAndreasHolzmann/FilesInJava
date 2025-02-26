package htl.ah;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class ReadFileWIthFileChannel {
    public static void main(String[] args) {
        try (FileChannel fileChannel = FileChannel.open(Path.of("largefile.txt"), StandardOpenOption.READ)) {
            // Allocate a ByteBuffer with a capacity of 4096 bytes to read data from the file channel.
            ByteBuffer buffer = ByteBuffer.allocate(4096);
            // Continuously read data from the file channel into the buffer until there is no more data to read.
            while (fileChannel.read(buffer) > 0) {
                // Flip the buffer to prepare it for reading. This sets the limit to the current position and the position to 0.
                buffer.flip();
                // Convert the buffer's content to a string and print it to the console. The parameters specify the start index, end index, and the character set.
                System.out.print(new String(buffer.array(), 0, buffer.limit()));
                // Clear the buffer to prepare it for the next read operation. This sets the position to 0 and the limit to the capacity.
                buffer.clear();
            }
        } catch (IOException e) {
            // Catch any IOException that might occur during file reading and print the stack trace.
            e.printStackTrace();
        }

    }
}

