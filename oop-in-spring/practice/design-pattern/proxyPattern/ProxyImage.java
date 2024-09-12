package proxyPattern;

public class ProxyImage implements Image {
    private String path;
    private RealImage image;

    public ProxyImage(String path) {
        this.path = path;
    }

    @Override
    public void draw() {
        if(image == null) {
            // 최초 접근시 객체 생성
            image = new RealImage(path);
        }

        // RealImage 객체에 위임
        image.draw();
    }
}
