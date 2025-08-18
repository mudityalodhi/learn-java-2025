class DownloadTask implements Runnable {
    private String fileName;

    public DownloadTask(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        System.out.println("Starting download : " + fileName);

        for (int i = 1; i <= 100; i += 20) {
            System.out.println(fileName + " -> " + i + " % completed");

            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Completed download : " + fileName);

    }

}

public class DownloadManager {
    public static void main(String[] args) {
        Thread file1 = new Thread(new DownloadTask("File1.mp4"));
        Thread file2 = new Thread(new DownloadTask("File2.pdf"));
        Thread file3 = new Thread(new DownloadTask("File3.zip"));

        file1.start();
        file2.start();
        file3.start();
    }
}
