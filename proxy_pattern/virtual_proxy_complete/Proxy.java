package proxy_pattern.virtual_proxy_complete;

import java.io.BufferedWriter;
import java.io.IOException;

public class Proxy implements Subject {

    volatile RealSubject realSubject;
    Thread retrievealThread;

    synchronized void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void print(final BufferedWriter bw) throws IOException {
        if (realSubject != null) {
            realSubject.print(bw);
            return;
        }

        bw.write("I'm Proxy :). wait!\n");
        bw.flush();
        retrievealThread = new Thread(new Runnable() {
            @Override
            public void run() {
                setRealSubject(new RealSubject());
                try {
                    realSubject.print(bw);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        retrievealThread.start();
    }
}
