package proxy_pattern.virtual_proxy_complete;

import java.io.BufferedWriter;
import java.io.IOException;

public interface Subject {

    void print(final BufferedWriter bw) throws IOException;
}
