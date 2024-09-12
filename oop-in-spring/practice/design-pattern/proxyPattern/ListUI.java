package proxyPattern;

import java.util.List;

public class ListUI {
    private List<Image> images;

    public ListUI(List<Image> images) {
        this.images = images;
    }

    public void onScroll(int start, int end) {
        // 스크롤시, 화면에 표시되는 이미지를 표시
        for(int i = start; i <= end; i++) {
            Image image = images.get(i);
            image.draw();
        }
    }
}
