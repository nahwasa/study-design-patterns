package proxy_pattern.virtual_proxy_complete;

import java.io.BufferedWriter;
import java.io.IOException;

public class RealSubject implements Subject {

    public RealSubject() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void print(final BufferedWriter bw) throws IOException {
        bw.write("Real Subject!\n");
        bw.flush();
    }
}
