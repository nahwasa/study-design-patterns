package proxy_pattern.virtual_proxy_complete;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ProxyTestDrive {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Subject subject = new Proxy();
        subject.print(new BufferedWriter(bw));
    }
}
