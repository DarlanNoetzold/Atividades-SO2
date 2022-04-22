package BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {

    public BlockingQueue queue = null;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("Primeira mensagem");
            Thread.sleep(1000);
            queue.put("Segunda mensagem");
            Thread.sleep(1000);
            queue.put("Treceira mensagem");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
