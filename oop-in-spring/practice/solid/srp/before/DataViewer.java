public class DataViewer {

    public void DataViewer() {
        byte[] data = loadHtml();
        updateGui(data);
    }
    
    public byte[] loadHtml() {
        SocketClient client = new SocketClient();
        client.connect(server, port);
        return client.read();
    }
    
    private void updateGui(byte[] data) {
        GuiData guiModel = parseDataToGuiData(data);
        tableUI.changeData(guiModel);
    }
    
    private GuiData parseDataToGuiData(byte[] data) {
        // ... 파싱 처리 코듸
    }
    
    // 기타 코드
}
