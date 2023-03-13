public class DataViewer {

    public void DataViewer() {
        String data = loadHtml();
        updateGui(data);
    }
    
    public String loadHtml() {
        HttpClient client = new HttpClient();
        client.connect(url);
        return client.getResponse();
    }
    
    private void updateGui(String data) {
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }
    
    private GuiData parseDataToGuiData(String data) {
        // ... 파싱 처리 코듸
    }
    
    // 기타 코드
}
